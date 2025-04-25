package unit_tests;

import unit_tests.auxiliar.*;

import static org.junit.Assert.*;

public class SerializedPageResponderTestRefactored {
    private PageCrawler crawler;
    private Page root;
    Request request;
    Responder responder = new SerializedPageResponder();
    SimpleResponse response = (SimpleResponse) responder.makeResponse(new FitNesseContext(root), request);

    public void testGetPageHierarchyAsXml() throws Exception {
        makePages("PageOne", "PageOne.ChildOne", "PageTwo");

        submitRequest("root", "type:pages");

        assertResponseIsXml();
        assertResponseContains("<name>PageOne</name>", "<name>PageTwo</name>", "<name>ChildOne</name>");
    }

    public void testSymbolicLinksAreNotInXmlPageHierarchy() throws Exception {
        WikiPage page = makePage("PageOne");
        makePages("PageOne.ChildOne", "PageTwo");

        addLinkTo(page, "PageTwo", "SymPage");

        submitRequest("root", "type:pages");

        assertResponseIsXml();
        assertResponseContains("<name>PageOne</name>", "<name>PageTwo</name>", "<name>ChildOne</name>");
        assertResponseDoesNotContain("SymPage");
    }

    public void testGetDataAsXml() throws Exception {
        makePageWithContent("TestPageOne", "testPage");

        submitRequest("TestPageOne", "type:data");

        assertResponseIsXml();
        assertResponseContains("test page", "<Test");
    }

    private WikiPage makePage(String... pagePath) {
        WikiPage lastCreatedPage = new WikiPage();
        for (String p : pagePath) {
            lastCreatedPage= crawler.addPage(root, PathParser.parse(p));
        }
        return lastCreatedPage;
    }

    private void makePages(String... pagePath) {
        for (String p : pagePath) {
            crawler.addPage(root, PathParser.parse(p));
        }
    }

    private void makePageWithContent(String path, String s) {
        crawler.addPage(root, PathParser.parse(path), s);
    }

    private void addLinkTo(WikiPage sourcePage, String targetPageName, String linkName) throws Exception {
        PageData data = sourcePage.getData();
        WikiPageProperties properties = data.getProperties();
        WikiPageProperties symLinks = properties.set(SymbolicPage.PROPERTY_NAME);
        symLinks.set(linkName, targetPageName);
        sourcePage.commit(data);
    }


    private void submitRequest(String resource, String... inputs) throws Exception{
        request.setResource(resource);

        for (String input : inputs) {
            String[] parts = input.split(":", 2);
            if (parts.length == 2) {
                request.addInput(parts[0].trim(), parts[1].trim());
            }
        }
    }

    private void assertResponseIsXml() {
        assertEquals("text/xml", response.getContentType());
    }

    private void assertResponseContains(String... substrings) {
        String xml = response.getContent();
        for (String expected : substrings) {
            assertSubstring(expected, xml);
        }
    }

    private void assertResponseDoesNotContain(String... substrings) {
        String xml = response.getContent();
        for (String unexpected : substrings) {
            if(xml.contains(unexpected)) {
                fail("Response should not contain: \"" + unexpected + "\"");
            }
        }
    }

    private void assertSubstring (String expected, String actual) {
        assertTrue("Expected to find substring: \"" + expected + "\" in:\n" + actual,
                actual.contains(expected));
    }
}
