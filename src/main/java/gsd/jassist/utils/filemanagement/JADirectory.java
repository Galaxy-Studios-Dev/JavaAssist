package gsd.jassist.utils.filemanagement;

import gsd.jassist.utils.exceptions.FileNotDirectoryException;

import java.io.File;
import java.util.Map;

/**
 * @author BigTallahasee
 */
public class JADirectory extends File {
    private File self;

    private Map<String, JADirectory> directories;
    private Map<String, JAFile> files;

    /**
     *
     * @param pathname path of where the directory is located
     * @throws FileNotDirectoryException Throws custom FileNotDirectoryException if not a directory.
     */
    public JADirectory(String pathname) throws FileNotDirectoryException {
        super(pathname);

        if (this.isDirectory()) {
            this.self = new File(pathname);
            System.out.println("Path given is a directory that already exists...");
        }
        else if (!this.isDirectory() && pathname.endsWith("/") || !this.isDirectory() && pathname.endsWith("\\")) {
            this.self = new File(pathname);
            this.self.mkdirs();
            System.out.println("Path is not a directory that exists but ends with / or \\ and should be a directory!");
            System.out.println("Turning path into a directory...");
        }else {
            throw new FileNotDirectoryException("File is not a directory...");
        }
    }

    /**
     *
     * @return returns all JADirectories stored in this JADirectory
     */
    public Map<String, JADirectory> getDirectories() {
        return this.directories;
    }

    /**
     *
     * @param key key to store the JADirectory Object under
     * @param jaDirectory JADirectory Object that will be stored in this JADirectory Object
     */
    public void addDirectory(String key, JADirectory jaDirectory) {
        this.directories.put(key, jaDirectory);
    }

    /**
     *
     * @return returns a Map of JAFiles that are stored in this JADirectory Object
     */
    public Map<String, JAFile> getFiles() {
        return this.files;
    }

    /**
     *
     * @param key key that the JAFile will be stored under
     * @param jaFile JAFile Object that will be stored in this directory
     */
    public void addFile(String key, JAFile jaFile) {
        this.files.put(key, jaFile);
    }

    /**
     *
     * @return returns Default java File Class
     */
    public File getSelf() { return this.self; }
}
