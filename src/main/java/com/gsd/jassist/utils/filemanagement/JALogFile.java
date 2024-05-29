package com.gsd.jassist.utils.filemanagement;

import java.io.IOException;

public class JALogFile extends JAFile{

    private String exactLogPath;
    private String fileKey;

    private JAFileHandler fileHandler;

    public JALogFile(JAFileHandler fileHandler, String fileName) throws IOException {
        super(fileHandler, "LOGGER", fileHandler.getLogPath() + fileName + ".log");

        this.fileHandler = fileHandler;
        this.fileKey = "LOGGER";
        this.exactLogPath = fileHandler.getLogPath() + fileName + ".log";
    }
}
