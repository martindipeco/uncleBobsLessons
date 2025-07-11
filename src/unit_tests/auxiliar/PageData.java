package unit_tests.auxiliar;

public class PageData {
    public boolean hasAttribute(String test) {
        if (test.contains("Attribute")) {
            return true;
        }
        return false;
    }

    public Page getWikiPage() {
        return new Page();
    }

    public char[] getContent() {
        return new char[] {'a'};
    }

    public void setContent(String string) {
    }

    public String getHtml() {
        return "Htlml";
    }

    public WikiPageProperties getProperties() {
        return new WikiPageProperties();
    }
}
