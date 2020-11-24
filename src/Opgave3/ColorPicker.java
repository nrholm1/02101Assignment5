package Opgave3;

import java.awt.*;
import java.util.HashMap;

public class ColorPicker {
    public HashMap<Integer, Color> map = new HashMap();

    public ColorPicker(int[][] colorGrid) {
        for (int i = 0; i < 256; i++) {
            map.put(i, new Color(colorGrid[i][0], colorGrid[i][1], colorGrid[i][2]));
        }
    }

    public ColorPicker() {
        for (int i = 0; i < 256; i++) {
            map.put(i, new Color((int) (Math.random() * 256),
                    (int) (Math.random() * 256),
                    (int) (Math.random() * 256)));
        }
    }
}
