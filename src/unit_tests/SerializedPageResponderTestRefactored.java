package unit_tests;

import unit_tests.auxiliar.Page;
import unit_tests.auxiliar.PageCrawler;
import unit_tests.auxiliar.PathParser;

import java.util.Arrays;

public class SerializedPageResponderTestRefactored {
    private PageCrawler crawler;
    private Page root;

    public void testGetPageHierarchyAsXml() throws Exception {
        makePage("PageOne", "PageOne.ChildOne", "PageTwo");
    }

    private void makePage(String... pagePath) {
        for (String p : pagePath) {
            crawler.addPage(root, PathParser.parse(p));
        }
    }
}
