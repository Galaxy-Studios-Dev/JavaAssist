package com.gsd.jassist.utils.filemanagement;

import java.io.IOException;

/**
 * @author BigTallahasee
 */
public class JALogFile extends JAFile{

    private String exactLogPath;
    private String fileKey;

    private JAFileHandler fileHandler;

    /**
     *
     * @param fileHandler JAFileHandler of the project
     * @param fileName Name of the log file
     * @throws IOException Can throw IOException when creating Default java File Object
     */
    public JALogFile(JAFileHandler fileHandler, String fileName) throws IOException {
        super(fileHandler, "LOGGER", fileHandler.getLogPath() + fileName + ".log");

        this.fileHandler = fileHandler;
        this.fileKey = "LOGGER";
        this.exactLogPath = fileHandler.getLogPath() + fileName + ".log";
    }
}
