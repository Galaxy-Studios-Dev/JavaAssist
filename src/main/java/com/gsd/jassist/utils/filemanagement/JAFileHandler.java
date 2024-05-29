package com.gsd.jassist.utils.filemanagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class JAFileHandler {
    private Map<String, File> files;
    private String projectPath;

    private String logPath;

    public JAFileHandler(Map<String, File> files, String projectPath) {
        this.files = files;
        this.projectPath = projectPath;
        this.logPath = this.projectPath + "Logs\\";
    }

    public String getProjectPath() {
        return this.projectPath;
    }

    public String getLogPath() {
        return this.logPath;
    }

    public void addFile(String fileKey, File file) {
        this.files.put(fileKey, file);
    }

    public String read(String key) {
        return "";
    }

    public void write(String fileKey, String text) throws IOException {
        /* Check if the given key is in the Map of files,
           if it is not then the file has not been loaded.
         */
        if (files.containsKey(fileKey)) {
            File currentFile = this.files.get(fileKey);

            if (currentFile.exists()) {
                FileWriter fw = new FileWriter(currentFile, true);

                fw.write(text);

                fw.close();
            }
        }
    }
}
