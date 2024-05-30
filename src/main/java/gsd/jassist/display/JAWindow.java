package gsd.jassist.display;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * @author BigTallahasee
 * **Note** Work in Progress, Don't Use
 */
public class JAWindow extends JFrame {
    private JAWindow self;
    private String title = "JavaAssist";
    private Image windowIcon;

    private Map<String, JAButton> buttons;
    private Map<String, JAPanel> panels;
    private Map<String, JALabel> labels;
    private Map<String, JAImage> images;

    /**
     *
     * @param title
     * @param iconPath
     * @param size
     */
    public JAWindow(String title, String iconPath, int[] size) {
        this.buttons = new HashMap<String, JAButton>();
        this.panels = new HashMap<String, JAPanel>();
        this.labels = new HashMap<String, JALabel>();
        this.images = new HashMap<String, JAImage>();

        this.self = this;
        this.self.setTitle(title);
        this.windowIcon = Toolkit.getDefaultToolkit().getImage(iconPath);
        this.self.setIconImage(this.windowIcon);
        this.self.setLayout(null);
        this.self.setSize(size[0], size[1]);

        this.self.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     *
     * @return
     */
    public Map<String, JAButton> getButtons() {
        return this.buttons;
    }

    /**
     *
     * @param key
     * @param button
     */
    public void addButton(String key, JAButton button) {
        this.buttons.put(key, button);
    }

    /**
     *
     * @return
     */
    public Map<String, JAPanel> getPanels() {
        return this.panels;
    }

    /**
     *
     * @param key
     * @param panel
     */
    public void addPanel(String key, JAPanel panel) {
        this.panels.put(key, panel);
    }

    /**
     *
     * @return
     */
    public Map<String, JALabel> getLabels() {
        return this.labels;
    }

    /**
     *
     * @param key
     * @param label
     */
    public void addLabel(String key, JALabel label) {
        this.labels.put(key, label);
    }

    /**
     *
     * @return
     */
    public Map<String, JAImage> getImages() {
        return this.images;
    }

    /**
     *
     * @param key
     * @param img
     */
    public void addImage(String key, JAImage img) {
        this.images.put(key, img);
    }

    public void drawButtons() {
        String[] keys = this.buttons.keySet().toArray(new String[0]);

        for (int i = 0; i < keys.length; i++) {
            //System.out.println(keys[i]);
            this.self.add(this.buttons.get(keys[i]));
        }
    }

    public void drawPanels() {
        String[] keys = this.panels.keySet().toArray(new String[0]);

        for(int i = 0; i < keys.length; i++) {
            this.self.add(this.panels.get(keys[i]));
        }
    }

    public void drawLabels() {
        String[] keys = this.labels.keySet().toArray(new String[0]);

        for(int i = 0; i < keys.length; i++) {
            this.self.add(this.labels.get(keys[i]));
        }
    }

    public void drawImages() {
        String[] keys = this.images.keySet().toArray(new String[0]);

        for (int i = 0; i < keys.length; i++) {
            this.self.add(this.images.get(keys[i]));
        }
    }
}
