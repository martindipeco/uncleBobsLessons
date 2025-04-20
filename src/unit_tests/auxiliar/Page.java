package unit_tests.auxiliar;

public class Page {
    public PageCrawler getPageCrawler() {
        return new PageCrawler();
    }

    public PageData getData() {
        return new PageData();
    }

    public void commit(PageData data) {
    }
}
