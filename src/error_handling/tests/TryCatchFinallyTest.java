package error_handling.tests;

import error_handling.tests.auxiliar.SectionStore;
import error_handling.tests.auxiliar.StorageException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TryCatchFinallyTest {
    private SectionStore sectionStore;

    @Before  // This runs before each test
    public void setUp() {
        sectionStore = new SectionStore();
    }

    @Test(expected = StorageException.class)
    public void retrieveSectionShouldThrowOnInvalidFileName() throws StorageException {
        sectionStore.retrieveSection("invalid - file");
    }
}