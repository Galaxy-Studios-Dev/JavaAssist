package com.gsd.jassist.utils.logger;

import com.gsd.jassist.utils.JADateFormatter;
import com.gsd.jassist.utils.filemanagement.JAFile;
import com.gsd.jassist.utils.filemanagement.JAFileHandler;
import com.gsd.jassist.utils.filemanagement.JALogFile;

import java.io.IOException;

public class JALogger {
    private JAFileHandler fileHandler;
    private JAFile logFile;

    private String logPath;

    private JADateFormatter dateFormatter;

    public JALogger(JAFileHandler fileHandler) throws IOException {
        this.fileHandler = fileHandler;
        dateFormatter = new JADateFormatter();

        this.logPath = fileHandler.getLogPath() + dateFormatter.fileFormatDate() + ".log";

        this.logFile = new JALogFile(this.fileHandler, dateFormatter.fileFormatDate());
    }

    public JAFile getLogFile() {
        return this.logFile;
    }

    public void log(JALevel priority, String text) throws IOException {
        String logLevel = priority.toString();
        String logHeader = dateFormatter.getTime() + " | Priority : " + logLevel + " | ";

        this.fileHandler.write("LOGGER", logHeader + text + System.lineSeparator());

    }
}
