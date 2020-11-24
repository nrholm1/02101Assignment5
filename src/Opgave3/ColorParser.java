package Opgave3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ColorParser {
    public static int[][] parseFile(String fileName) throws FileNotFoundException, InputMismatchException {
        File file = new File("src/aflevering6/opgave3/mnd/" + fileName + ".mnd");
        int[] dimensions = new int[0];

        Scanner in = null;
        if (file.exists()) {
            in = new Scanner(file);
            dimensions = getInputDimensions(file);
        }
        else
            throw new FileNotFoundException("File does not exist -> " + file.getAbsolutePath());

        int[][] grid = new int[dimensions[1]][dimensions[0]];

        int col = 0;
        while(in.hasNextLine())
        {
            int row = 0;
            Scanner lineScan = new Scanner(in.nextLine());
            while(lineScan.hasNext()) {
                int value = lineScan.nextInt();
                grid[row][col] = value;
                row++;
            }
            col++;
        }

        System.out.println("Loaded " + fileName);
        return grid;
    }

    public static int[] getInputDimensions(File file) throws FileNotFoundException, InputMismatchException  {
        Scanner in = new Scanner(file);
        int rows = 1;
        int cols = 0;
        while (in.hasNextLine()) {
            in.nextLine();
            if (rows == 1) {
                Scanner lineScan = new Scanner(in.nextLine());
                while(lineScan.hasNext()) {
                    lineScan.next();
                    cols++;
                }
            }
            rows++;
        }
        if (rows != cols)
            throw new InputMismatchException("Input array must be have same amount of rows and columns");

        return new int[] {rows, cols};
    }
}