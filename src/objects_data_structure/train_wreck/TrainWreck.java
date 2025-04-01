package objects_data_structure.train_wreck;

import objects_data_structure.train_wreck.auxiliar.Context;

import java.io.BufferedOutputStream;

public class TrainWreck {
    Context ctxt = new Context();

    final String outputDir = ctxt.getOptions().getScratchDir().getAbsolutePath();

}
