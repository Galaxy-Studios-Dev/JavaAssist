package gsd.jassist.display;

import javax.swing.*;
import java.awt.*;

/**
 * @author BigTallahasee
 */
public class JAImage extends JALabel {
    JAImage self;

    /**
     * Inherits JALabel which Inherits JLabel
     * @param image Takes a default Image java Object
     * @param position The position of the JAImage
     * @param size Size of the JAImage
     */
    public JAImage(Image image, int[] position, int[] size) {
        super("", position, size);

        this.self = this;
        this.self.setIcon(new ImageIcon(image));
        this.self.setVisible(true);
    }
}
