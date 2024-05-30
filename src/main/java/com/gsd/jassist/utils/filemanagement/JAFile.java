package com.gsd.jassist.utils.filemanagement;

import java.io.File;
import java.io.IOException;

/**
 * @author BigTallahasee
 */
public class JAFile extends File{
    private File self;

    /**\
     *
     * @param fileHandler The projects JAFileHandler
     * @param fileKey A key to store the file under
     * @param fileName Name of the file
     * @throws IOException Has a chance to throw IOException
     */
    public JAFile(JAFileHandler fileHandler, String fileKey, String fileName) throws IOException {
        super(fileName);
        this.self = this;
        System.out.println(fileName);
        this.self.createNewFile();

        fileHandler.addFile(fileKey, this);
    }

    /**
     *
     * @return returns a default java File Object
     */
    public File getSelf() {
        return this.self;
    }
}
