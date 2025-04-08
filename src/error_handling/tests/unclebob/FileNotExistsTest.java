package error_handling.tests.unclebob;

import error_handling.tests.unclebob.auxiliar.SectionStore;
import error_handling.tests.unclebob.auxiliar.StorageException;
import org.junit.Test;

public class FileNotExistsTest {
    SectionStore sectionStore = new SectionStore();

    @Test(expected = StorageException.class)
    public void retrieveSectionShouldThrowOnInvalidFileName() throws StorageException {
        sectionStore.retrieveSection("Invalid - file");
    }
}
