package unit_tests;

import unit_tests.auxiliar.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SerializedPageResponderTestRefactored {
    private PageCrawler crawler;
    private Page root;
    Request request;
    Responder responder = new SerializedPageResponder();
    SimpleResponse response = (SimpleResponse) responder.makeResponse(new FitNesseContext(root), request);

    public void testGetPageHierarchyAsXml() throws Exception {
        makePage("PageOne", "PageOne.ChildOne", "PageTwo");

        submitRequest("root", "type:pages");

        assertResponseIsXml();
        assertResponseContains("<name>PageOne</name>", "<name>PageTwo</name>", "<name>ChildOne</name>");
    }

    private void makePage(String... pagePath) {
        for (String p : pagePath) {
            crawler.addPage(root, PathParser.parse(p));
        }
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

    private void assertSubstring (String expected, String actual) {
        assertTrue("Expected to find substring: \"" + expected + "\" in:\n" + actual,
                actual.contains(expected));
    }
}
