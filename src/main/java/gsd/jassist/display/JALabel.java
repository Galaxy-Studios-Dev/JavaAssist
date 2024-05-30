package gsd.jassist.display;

import javax.swing.*;

/**
 * @author BigTallahasee
 */
public class JALabel extends JLabel {
    private JALabel self;

    /**
     *
     * @param text Text that the JALabel will say
     * @param position Where the JALabel will be positioned
     * @param size How big the JALabel will be
     */
    public JALabel(String text, int[] position, int[] size) {
        this.self = this;

        this.self.setText(text);
        this.self.setBounds(position[0], position[1], size[0], size[1]);

        this.self.setVisible(true);
    }

    /**
     *
     * @return
     */
    public JALabel getSelf() {
        return this.self;
    }

}
