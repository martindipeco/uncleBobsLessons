package error_handling.tests.unclebob;

import error_handling.tests.unclebob.auxiliar.SectionStoreTryCatchFinally;
import error_handling.tests.unclebob.auxiliar.StorageException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PassingTest {
    private SectionStoreTryCatchFinally sectionStore = new SectionStoreTryCatchFinally();

    @Test(expected = StorageException.class)
    public void retrieveSectionShouldThrowOnInvalidFileName() throws StorageException {
        sectionStore.retrieveSection("invalid - file");
    }
}