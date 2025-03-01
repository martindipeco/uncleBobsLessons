package functions.fitnesse;//Taken from "Clean Code" by Robert C. Martin
//Listing 3-2
//HtmlUtil.java (re - refactored)

import functions.fitnesse.auxiliar.PageData;

public class HtmlUtilRefactoredB {
    public static String renderPageWithSetupsAndTeardowns(
            PageData pageData, boolean isSuite) throws Exception {
        if (isTestPage(pageData))
            includeSetupAndTeardownPages(pageData, isSuite);
        return pageData.getHtml();
    }

    //not included in the book. Just added to compile
    private static void includeSetupAndTeardownPages(PageData pageData, boolean isSuite) {
    }

    private static boolean isTestPage(PageData pageData) {
        if(pageData.hasAttribute("test")) {
            return true;
        }
        return false;
    }
}
