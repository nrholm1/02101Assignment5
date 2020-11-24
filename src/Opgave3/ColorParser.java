package Opgave3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ColorParser {
    public static int[][] parseFile(String fileName) throws FileNotFoundException, InputMismatchException {
        File file = new File("src/opgave3/mnd/" + fileName + ".mnd");

        Scanner in = null;
        if (file.exists()) {
            in = new Scanner(file);
        }
        else
            throw new FileNotFoundException("File does not exist -> " + file.getAbsolutePath());

        int[][] grid = new int[256][3];

        int col = 0;
        while(in.hasNextLine())
        {
            int row = 0;
            Scanner lineScan = new Scanner(in.nextLine());
            while(lineScan.hasNext()) {
                int value = lineScan.nextInt();
                grid[col][row] = value;
                row++;
            }
            col++;
        }

        System.out.println("Loaded " + fileName);
        return grid;
    }
}