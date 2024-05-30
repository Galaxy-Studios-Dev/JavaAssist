package com.gsd.jassist.display;

import javax.swing.*;

/**
 * @author BigTallahasee
 * **Note** Work in Progress, Don't Use
 */
public class JAPanel extends JPanel {
    JPanel self;

    int[] panelPosition = {0,0};
    int[] panelSize;

    public JAPanel(int[] panelSize) {
        this.panelSize = panelSize;
        this.self = new JPanel();

        this.self.setBounds(this.panelPosition[0], this.panelPosition[1], panelSize[0], panelSize[1]);
        this.self.setVisible(true);
    }

    public JAPanel(int[] panelPosition, int[] panelSize) {
        this.panelPosition = panelPosition;
        this.panelSize = panelSize;

        this.self = new JPanel();

        this.self.setBounds(this.panelPosition[0], this.panelPosition[1], panelSize[0], panelSize[1]);
        this.self.setVisible(true);
    }

    public JPanel getSelf() {
        return this.self;
    }

    public void add(JComponent jc) {
        this.self.add(jc);
        this.self.repaint();
    }
}
