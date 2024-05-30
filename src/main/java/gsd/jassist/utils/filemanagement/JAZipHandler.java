package gsd.jassist.utils.filemanagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author BigTallahasee
 */
public class JAZipHandler {
    private Map<String, File> containedDirectories;

    /**
     *
     */
    public JAZipHandler() {
        this.containedDirectories = new HashMap<>();
    }

    /**
     *
     * @param zipFile File to be extracted
     * @param destPath Destination to extract the file
     */
    public void unzip(File zipFile, String destPath) {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile))) {
            ZipEntry entry;
            byte[] buffer = new byte[1024];

            while ((entry = zis.getNextEntry()) != null) {
                File newFile = new File(destPath + entry.getName());

                if (entry.isDirectory()) {
                    newFile.mkdirs();

                } else {
                    new File(newFile.getParent()).mkdirs();

                    try (FileOutputStream fos = new FileOutputStream(newFile)) {
                        int length;
                        while ((length = zis.read(buffer)) > 0) {
                            fos.write(buffer, 0, length);
                        }
                    }
                }
            }
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * NOTE : Work in progress, Don't use.
     * @param tempDir
     * @param destination
     * @throws IOException
     */
    public void unzipNested(File tempDir, String destination) throws IOException {
        for (int i = 0; i < tempDir.list().length; i++) {
            this.containedDirectories.put("Directory" + i, tempDir);
            //System.out.println(tempDir.getName() + " : " + this.containedDirectories.get("Directory" + i).list()[i]);
            for (int j = 0; j < this.containedDirectories.get("Directory" + i).list().length; j++) {
                tempDir = new File(destination + tempDir.getName() + "\\" + this.containedDirectories.get("Directory" + i).list()[j]);
                tempDir.getParentFile().mkdirs();
                tempDir.createNewFile();
            }
        }
    }

}
