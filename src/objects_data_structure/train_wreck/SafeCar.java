package objects_data_structure.train_wreck;

import java.io.BufferedOutputStream;
import objects_data_structure.train_wreck.auxiliar.Context;

public class SafeCar {
    Context ctxt = new Context();
    private String classFileName = "new";

    BufferedOutputStream bos = ctxt.createScratchFileStream(classFileName);
}
