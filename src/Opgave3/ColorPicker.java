package Opgave3;

import java.awt.*;
import java.util.HashMap;

public class ColorPicker {
    public HashMap<Integer, Color> map;

    public ColorPicker(HashMap<Integer, Color> _map) {
        this.map = _map;
    }

    public ColorPicker() {
        map = new HashMap();
        for (int i = 0; i < 256; i++) {
            map.put(i, new Color((int) (Math.random() * 256),
                    (int) (Math.random() * 256),
                    (int) (Math.random() * 256)));
        }
    }
}
