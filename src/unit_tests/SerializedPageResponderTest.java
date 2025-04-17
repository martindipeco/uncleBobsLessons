package unit_tests;

import unit_tests.auxiliar.Page;
import unit_tests.auxiliar.PageCrawler;
import unit_tests.auxiliar.PathParser;

public class SerializedPageResponderTest {
    private PageCrawler crawler;
    private Page root;

    public void testGetPageHieratchyAsXml() throws Exception {
        crawler.addPage(root, PathParser.parse("PageOne"));
        crawler.addPage(root, PathParser.parse("PageOne.ChildOne"));
        crawler.addPage(root, PathParser.parse("PageTwo"));
    }
}
