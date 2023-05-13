package Exceptions.HW3.classes.workWithFile;

import Exceptions.HW3.abstracts.AFindSameFileName;

import java.io.File;

public class CFindSameFileName extends AFindSameFileName {

    //
    @Override
    public boolean findTheSameFileName(String lastName, String pathFolder) {
        super.folder = new File(pathFolder);
        boolean found = false;
        for (File file: this.folder.listFiles()) {
            String fileName = file.getName().split("\\.")[0];
            if (fileName.equals(lastName)){
                found = true;
                break;
            }

        }
        return found;
    }
}
