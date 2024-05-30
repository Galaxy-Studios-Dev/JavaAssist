package gsd.jassist.display;

import gsd.jassist.utils.display.JAWindowHandler;

import java.awt.*;

public class JABackground extends JAImage {
    private final JAWindowHandler jaWindowHandler = new JAWindowHandler();
    private JABackground self;

    public JABackground(Image bgImage, String mainWinKey) {
        super(bgImage, new int[]{0, 0}, new int[]{0, 0});
        this.self = this;
        JAWindow main = this.jaWindowHandler.getWindows().get(mainWinKey);

        this.self.setSize(main.getWidth(), main.getHeight());

    }
}
