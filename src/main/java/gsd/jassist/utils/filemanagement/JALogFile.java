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
        super(fileHandler, "LOG", pathHandler.getSpecificPath("LOGDIR") + fileName + ".log");

        this.fileHandler = fileHandler;
        this.fileKey = "LOG";
        this.exactLogPath = pathHandler.getSpecificPath(pathHandler.getLogPathKey()) + fileName + ".log";
    }
}
