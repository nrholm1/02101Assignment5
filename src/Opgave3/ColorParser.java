package Opgave3;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ColorParser {
    public static HashMap<Integer, Color> parseFile(String fileName) throws FileNotFoundException {
        File file = new File("src/opgave3/mnd/" + fileName + ".mnd");

        Scanner in = null;
        if (file.exists()) {
            in = new Scanner(file);
        }
        else
            throw new FileNotFoundException("File does not exist -> " + file.getAbsolutePath());

        HashMap<Integer, Color> map = new HashMap<Integer, Color>();

        int row = 0;
        while(in.hasNextLine())
        {
            int val = 0;
            int[] rgb = new int[3];

            Scanner lineScan = new Scanner(in.nextLine());
            while(lineScan.hasNext()) {
                int value = lineScan.nextInt();
                rgb[val] = value;
                val++;
            }

            map.put(row, new Color(rgb[0], rgb[1], rgb[2]));
            row++;
        }

        System.out.println("Loaded " + fileName);
        return map;
    }
}