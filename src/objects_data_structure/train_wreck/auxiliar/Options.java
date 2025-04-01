package objects_data_structure.train_wreck.auxiliar;

import java.io.File;

public class Options {
    private File scratchDir;

    public Options() {
        // Default scratch directory
        this.scratchDir = new File(System.getProperty("java.io.tmpdir"));
    }

    public File getScratchDir() {
        return scratchDir;
    }
}
