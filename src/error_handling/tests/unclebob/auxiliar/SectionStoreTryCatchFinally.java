package error_handling.tests.unclebob.auxiliar;

import error_handling.tests.unclebob.auxiliar.StorageException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SectionStoreTryCatchFinally {
    public List<RecordedGrip> retrieveSection(String sectionName) throws StorageException {
        try {
            FileInputStream stream = new FileInputStream(sectionName);
            stream.close();
        } catch (FileNotFoundException e) {
            throw new error_handling.tests.unclebob.auxiliar.StorageException("retrieval error", e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new ArrayList<RecordedGrip>();
    }
}
