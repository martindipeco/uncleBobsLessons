package error_handling.tests.auxiliar;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class SectionStore {
    public List<RecordedGrip> retrieveSection(String sectionName) throws StorageException {
        try {
            FileInputStream stream = new FileInputStream(sectionName);
        } catch (Exception e) {
            throw new StorageException("retrieval error", e);
        }
        return new ArrayList<RecordedGrip>();
    }
}
