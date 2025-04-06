package error_handling.tests.unclebob;

import error_handling.tests.unclebob.auxiliar.SectionStoreFailingTest;
import error_handling.tests.unclebob.auxiliar.StorageException;
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
