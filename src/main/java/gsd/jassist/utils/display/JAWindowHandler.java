package gsd.jassist.utils.display;

import gsd.jassist.display.JAButton;
import gsd.jassist.display.JAWindow;

import java.util.*;

/**
 * @author BigTallahasee
 */
public class JAWindowHandler {
    private Map<String, JAWindow> windows;

    /**
     * Extend JAWindowHandler class, Then create your JAWindows in your own WindowHandler class
     */
    public JAWindowHandler() {
        this.windows = new HashMap<String, JAWindow>();
    }

    /**
     *
     * @return returns a Map of JAWindows in the project
     */
    public Map<String, JAWindow> getWindows() {
        return this.windows;
    }

    /**
     * Add a JAWindow to the JAWindowHandler anywhere
     * @param key key that the window will be stored under
     * @param window JAWindow Object that will be stored
     */
    public void addWindow(String key, JAWindow window) {
        this.windows.put(key, window);
    }

    /**
     *
     * @param key Key of the button that you'd like to return
     * @return returns the JAButton of the provided key after checking through all the windows
     * in the JAWindowHandler. Used for moving buttons between JAWindows.
     */
    public JAButton grabButton(String key) {
        String[] keys = this.windows.keySet().toArray(new String[0]);

        for (int i = 0; i < keys.length; i++) {
            Map<String, JAButton> tempButtonList = this.windows.get(keys[i]).getButtons();

            if (tempButtonList.containsKey(key)) {
                JAButton correctButton = tempButtonList.get(key);

                System.out.println(tempButtonList.get(key));
                return correctButton;
            }
        }

        return null;
    }
}
