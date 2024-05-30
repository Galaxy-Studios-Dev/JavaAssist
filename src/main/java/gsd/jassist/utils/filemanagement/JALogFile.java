package gsd.jassist.utils.filemanagement;

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
     * @param fileHandler Where the logfile will be added
     * @param pathHandler
     * @param fileName
     * @throws IOException
     */
    public JALogFile(JAFileHandler fileHandler, JAPathHandler pathHandler, String fileName) throws IOException {
        super(fileHandler, "LOGGER", pathHandler.getSpecficPath("LOG") + fileName + ".log");

        this.fileHandler = fileHandler;
        this.fileKey = "LOGGER";
        this.exactLogPath = fileHandler.getLogPath() + fileName + ".log";
    }
}
