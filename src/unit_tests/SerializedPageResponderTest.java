package unit_tests;

import unit_tests.auxiliar.*;

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
    }
}
