package com.gsd.jassist.utils.filemanagement;

import java.io.File;
import java.io.IOException;

public class JAFile extends File{
    private File self;

    public JAFile(JAFileHandler fileHandler, String fileKey, String fileName) throws IOException {
        super(fileName);
        this.self = this;
        System.out.println(fileName);
        this.self.createNewFile();

        fileHandler.addFile(fileKey, this.self);
    }

    public File getSelf() {
        return this.self;
    }
}
