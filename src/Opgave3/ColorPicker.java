package Opgave3;

import java.awt.*;
import java.util.HashMap;

public class ColorPicker {
    public HashMap<Integer, Color> colorDict = new HashMap();

    public ColorPicker() {
        for (int i = 0; i < 255; i++) {
            colorDict.put(i, new Color((int) (Math.random() * 256),
                    (int) (Math.random() * 256),
                    (int) (Math.random() * 256)));
        }
    }
}
