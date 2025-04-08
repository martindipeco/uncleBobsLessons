package error_handling.tests.unclebob.auxiliar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SectionStore {
    public List<RecordedGrip> retrieveSection(String sectionName) throws StorageException {
        try {
            FileInputStream stream = new FileInputStream(sectionName);
            stream.close();
        } catch (FileNotFoundException e) {
            throw new StorageException("retrieval error", e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //dummy return
        return new ArrayList<RecordedGrip>();
    }
}
