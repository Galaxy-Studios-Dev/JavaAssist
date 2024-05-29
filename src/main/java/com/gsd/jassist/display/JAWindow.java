package com.gsd.jassist.display;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class JAWindow extends JFrame {
    private JFrame self;
    private String title = "JavaAssist";
    private Image windowIcon;

    public JAWindow() {
        this.self = new JFrame(this.title);
        this.windowIcon = Toolkit.getDefaultToolkit().getImage("src/main/java/com/galaxystudios/jassist/default_icon.png");
        this.self.setIconImage(this.windowIcon);
        this.self.setLayout(null);
        this.self.setSize(500, 350);

        this.self.setVisible(true);

        this.self.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JAWindow(String iconPath, int[] size){
        this.self = new JFrame(this.title);
        this.windowIcon = Toolkit.getDefaultToolkit().getImage(iconPath);
        this.self.setIconImage(this.windowIcon);
        this.self.setLayout(null);
        this.self.setSize(size[0], size[1]);

        this.self.setVisible(true);

        this.self.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JAWindow(String title, String iconPath, int[] size) {
        this.self = new JFrame(title);
        this.windowIcon = Toolkit.getDefaultToolkit().getImage(iconPath);
        this.self.setIconImage(this.windowIcon);
        this.self.setLayout(null);
        this.self.setSize(size[0], size[1]);

        this.self.setVisible(true);

        this.self.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void add(JComponent jc) {
        this.self.add(jc);
        //this.self.update(g);
    }
}
