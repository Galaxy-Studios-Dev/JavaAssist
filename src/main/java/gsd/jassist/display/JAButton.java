package gsd.jassist.display;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author BigTallahasee
 */
public class JAButton extends JButton {
    private JAButton self;

    private String text;

    /**
     *
     * @param text What the button will say
     * @param position Position of the button
     * @param size Size of the Button
     * @param actionListener What the button will do when clicked
     */
    public JAButton(String text, int[] position, int[] size, ActionListener actionListener) {
        this.self = this;
        this.self.setText(text);
        this.self.setBounds(position[0], position[1], size[0], size[1]);
        this.self.setVisible(true);
        this.self.addActionListener(actionListener);
    }
}
