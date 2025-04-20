package unit_tests;

import unit_tests.auxiliar.*;

import static org.junit.Assert.assertEquals;

public class SerializedPageResponderTest {
    private PageCrawler crawler;
    private Page root;
    private Request request;

    public void testGetPageHieratchyAsXml() throws Exception {
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

    private void assertSubstring(String s, String xml) {
    }
}
