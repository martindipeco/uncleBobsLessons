package error_handling.tests;

import error_handling.tests.auxiliar.SectionStoreFailingTest;
import error_handling.tests.auxiliar.StorageException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FailingTest {
    private SectionStoreFailingTest sectionStore = new SectionStoreFailingTest();

    @Test(expected = StorageException.class)
    public void retrieveSectionShouldThrowOnInvalidFileName() throws StorageException {
        sectionStore.retrieveSection("invalid - file");
    }


}
