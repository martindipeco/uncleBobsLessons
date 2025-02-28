package functions.auxiliar;

public class PageData {
    public boolean hasAttribute(String test) {
        if (test.contains("Attribute")) {
            return true;
        }
        return false;
    }

    public WikiPage getWikiPage() {
        return new WikiPage();
    }

    public char[] getContent() {
        return new char[] {'a'};
    }

    public void setContent(String string) {
    }

    public String getHtml() {
        return "Htlml";
    }
}
