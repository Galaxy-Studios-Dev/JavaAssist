package com.gsd.jassist.utils.logger;

import com.gsd.jassist.utils.JADateFormatter;
import com.gsd.jassist.utils.filemanagement.JAFile;
import com.gsd.jassist.utils.filemanagement.JAFileHandler;
import com.gsd.jassist.utils.filemanagement.JALogFile;

import java.io.IOException;

/**
 * @author BigTallahasee
 */
public class JALogger {
    private JAFileHandler fileHandler;
    private JAFile logFile;

    private String logPath;

    private JADateFormatter dateFormatter;

    /**
     *
     * @param fileHandler JAFileHandler of the project
     * @throws IOException Can throw a IOException creating a JALogFile
     */
    public JALogger(JAFileHandler fileHandler) throws IOException {
        this.fileHandler = fileHandler;
        dateFormatter = new JADateFormatter();

        this.logPath = fileHandler.getLogPath() + dateFormatter.fileFormatDate() + ".log";

        this.logFile = new JALogFile(this.fileHandler, dateFormatter.fileFormatDate());
    }

    /**
     *
     * @return returns a JAFile that is pre-made by the logger
     */
    public JAFile getLogFile() {
        return this.logFile;
    }

    /**
     *
     * @param priority What is the seriousness of the log
     * @param text What will be written into the log
     * @throws IOException Can throw IOException writing to JALogFile
     */
    public void log(JALevel priority, String text) throws IOException {
        String logLevel = priority.toString();
        String logHeader = dateFormatter.getTime() + " | Priority : " + logLevel + " | ";

        this.fileHandler.write("LOGGER", logHeader + text + System.lineSeparator());

    }
}
