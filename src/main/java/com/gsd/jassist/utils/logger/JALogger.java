package com.gsd.jassist.utils.logger;

import com.gsd.jassist.utils.JADateFormatter;
import com.gsd.jassist.utils.filemanagement.JAFile;
import com.gsd.jassist.utils.filemanagement.JAFileHandler;

import java.io.IOException;

public class JALogger {
    private JAFileHandler fileHandler;
    private JAFile logFile;

    private JADateFormatter dateFormatter;

    public JALogger(JAFileHandler fileHandler) throws IOException {
        this.fileHandler = fileHandler;
        dateFormatter = new JADateFormatter();

        logFile = new JAFile(this.fileHandler, "LOGGER", dateFormatter.getDate() + ".log");
    }

    public void log(JALevel priority, String text) throws IOException {
        switch(priority) {
            case INFO :
                this.fileHandler.write("LOGGER", dateFormatter.getTime() + " | Priority | Info : " + text);
                break;
            case LOW:
                this.fileHandler.write("LOGGER", dateFormatter.getTime() + " | Priority | Low : " + text);
                break;
            case MEDIUM:
                this.fileHandler.write("LOGGER", dateFormatter.getTime() + " | Priority | Medium : " + text);
                break;
            case SEVERE:
                this.fileHandler.write("LOGGER", dateFormatter.getTime() + " | Priority | Severe : " + text);
        }
    }
}
