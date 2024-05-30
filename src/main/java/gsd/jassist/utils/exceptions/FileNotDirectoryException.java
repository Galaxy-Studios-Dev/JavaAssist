package gsd.jassist.utils.exceptions;

import java.io.FileNotFoundException;

/**
 * @author BigTallahasee
 */
public class FileNotDirectoryException extends FileNotFoundException {

    /**
     *
     * @param errorMsg Message that will be passed through the Exception
     * @throws FileNotDirectoryException Custom Exception for JADirectory class
     */
    public FileNotDirectoryException(String errorMsg) throws FileNotDirectoryException {
        throw new FileNotDirectoryException(errorMsg);
    }
}
