package functions;//Taken from "Clean Code" by Robert C. Martin
//Listing 3-2
//HtmlUtil.java (refactored)

import functions.auxiliar.PageData;
import functions.auxiliar.WikiPage;

public class HtmlUtilRefactoredA {
    public static String renderPageWithSetupsAndTeardowns(
            PageData pageData, boolean isSuite
    ) throws Exception {
        boolean isTestPage = pageData.hasAttribute("Test");
        if (isTestPage) {
            WikiPage testPage = pageData.getWikiPage();
            StringBuffer newPageContent = new StringBuffer();
            includeSetupPages(testPage, newPageContent, isSuite);
            newPageContent.append(pageData.getContent());
            includeTeardownPages(testPage, newPageContent, isSuite);
            pageData.setContent(newPageContent.toString());
        }
        return pageData.getHtml();
    }

    //not included in the book. Just added to compile
    private static void includeTeardownPages(WikiPage testPage, StringBuffer newPageContent, boolean isSuite) {
    }

    private static void includeSetupPages(WikiPage testPage, StringBuffer newPageContent, boolean isSuite) {
    }
}
