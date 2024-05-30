package gsd.jassist.utils.filemanagement;

import java.util.HashMap;
import java.util.Map;

public class JAPathHandler {
    private Map<String, String> projectPaths;

    public JAPathHandler() {
        this.projectPaths = new HashMap<String, String>();
    }

    public Map<String, String> getProjectPaths() {
        return this.projectPaths;
    }

    public String getSpecficPath(String key) {
        return this.projectPaths.get(key);
    }

    public void addPath(String key, String value) {
        this.projectPaths.put(key, value);
    }
}
