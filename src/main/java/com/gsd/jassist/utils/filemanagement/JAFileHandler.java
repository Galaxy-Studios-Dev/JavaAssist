package com.gsd.jassist.utils.filemanagement;

import com.gsd.jassist.utils.logger.JALogger;

import java.io.*;
import java.util.Map;

public class JAFileHandler {
    private Map<String, JADirectory> directories;
    private Map<String, JAFile> files;
    private String projectPath;

    private JALogger logger;

    private String logPath;

    /**
     *
     * @param directories a map of directories, Empty or With items
     * @param files a Map of jafiles, Empty or with items
     * @param projectPath the path where you plan to store files for the user
     */
    public JAFileHandler(Map<String, JADirectory> directories, Map<String, JAFile> files, String projectPath) {
        this.directories = directories;
        this.files = files;

        this.projectPath = projectPath;
        this.logPath = this.projectPath + "Logs\\";
    }

    /**
     *
     * @return returns the provided project path
     */
    public String getProjectPath() {
        System.out.println("Grabbing the saved project path " + this.projectPath);
        return this.projectPath;
    }

    /**
     *
     * @return returns the logs path
     */
    public String getLogPath() {
        return this.logPath;
    }

    /**
     *
     * @return returns the jalogger object
     */
    public JALogger getLogger() {
        return this.logger;
    }

    /**
     *
     * @param logger The jalogger object you plan to use
     */
    public void setLogger(JALogger logger) {
        this.logger = logger;
    }

    /**
     *
     * @param fileKey new key inwhich the jafile will be stored under
     * @param file the file that will be stored
     */
    public void addFile(String fileKey, JAFile file) {
        this.files.put(fileKey, file);
    }

    /**
     *
     * @param key key of the jafile you would like to read
     * @return returns the content of the file stored at the key
     */
    public String read(String key) throws IOException {
        if (this.files.containsKey(key)) {
            File wantsRead = this.files.get(key);

            FileReader fr = new FileReader(wantsRead);
            String content = "";
            int i;

            while ((i = fr.read()) != -1) {
                content = content + (char)i;
            }

            return content;
        } else {
            return null;
        }
    }

    /**
     *
     * @param fileKey
     * @param text
     * @throws IOException
     */
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
