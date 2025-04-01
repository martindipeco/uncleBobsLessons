package objects_data_structure.train_wreck.auxiliar;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Context {
    private Options options;

    public Context() {
        options = new Options();
    }

    public Options getOptions() {
        return options;
    }

    public BufferedOutputStream createScratchFileStream(String fileName) {
        try {
            File scratchFile = new File(options.getScratchDir(), fileName);
            return new BufferedOutputStream(new FileOutputStream(scratchFile));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Could not create scratch file: " + fileName, e);
        }
    }
}
