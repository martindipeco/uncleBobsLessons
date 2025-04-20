package unit_tests;

import unit_tests.auxiliar.*;

import static org.junit.Assert.assertEquals;

public class SerializedPageResponderTest {
    private PageCrawler crawler;
    private Page root;
    private Request request;

    public void testGetPageHierarchyAsXml() throws Exception {
        crawler.addPage(root, PathParser.parse("PageOne"));
        crawler.addPage(root, PathParser.parse("PageOne.ChildOne"));
        crawler.addPage(root, PathParser.parse("PageTwo"));

        request.setResource("root");
        request.addInput("type", "pages");
        Responder responder = new SerializedPageResponder();
        SimpleResponse response = (SimpleResponse) responder.makeResponse(new FitNesseContext(root), request);
        String xml = response.getContent();

        assertEquals("text/xml", response.getContentType());
        assertSubstring("<name>PageOne</name>", xml);
        assertSubstring("<name>PageTwo</name>", xml);
        assertSubstring("<name>ChildOne</name>", xml);
    }

    public void testGetPageHierarchyAsXmlDoesntContainSymbolicLinks() throws Exception {
        WikiPage pageOne = crawler.addPage(root, PathParser.parse("PageOne"));
        crawler.addPage(root, PathParser.parse("PageOne.ChildOne"));
        crawler.addPage(root, PathParser.parse("PageTwo"));

        PageData data = pageOne.getData();
        WikiPageProperties properties = data.getProperties();
        WikiPageProperties symLinks = properties.set(SymbolicPage.PROPERTY_NAME);
        symLinks.set("SymPage", "PageTwo");
        pageOne.commit(data);
    }

    private void assertSubstring(String s, String xml) {
    }
}
