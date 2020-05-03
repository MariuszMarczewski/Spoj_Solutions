import java.util.ArrayList;
import java.util.List;


public class Sudoku {

    public static boolean checkSudoku(Integer[][] arrays) {
        if (checkArrays2Drow(arrays) && checkArrays2Dcolumn(arrays)) {
            return true;
        }
        return false;
    }

    public static boolean checkArrays2Drow(Integer[][] arrays) {
        int size = arrays.length;
        int[] row1 = new int[size];
        int[] row2 = new int[size];
        int[] row3 = new int[size];
        int[] row4 = new int[size];
        int[] row5 = new int[size];
        int[] row6 = new int[size];
        int[] row7 = new int[size];
        int[] row8 = new int[size];
        int[] row9 = new int[size];

        for (int i = 0; i < size; i++) {
            row1[i] = arrays[i][0];
            row2[i] = arrays[i][1];
            row3[i] = arrays[i][2];
            row4[i] = arrays[i][3];
            row5[i] = arrays[i][4];
            row6[i] = arrays[i][5];
            row7[i] = arrays[i][6];
            row8[i] = arrays[i][7];
            row9[i] = arrays[i][8];
        }
        if (
                checkLine(row1) &&
                        checkLine(row2) &&
                        checkLine(row3) &&
                        checkLine(row4) &&
                        checkLine(row5) &&
                        checkLine(row6) &&
                        checkLine(row7) &&
                        checkLine(row8) &&
                        checkLine(row9)
        ) {
            return true;
        }
        return false;
    }

    public static boolean checkArrays2Dcolumn(Integer[][] arrays) {
        int size = arrays[0].length;
        int[] column1 = new int[size];
        int[] column2 = new int[size];
        int[] column3 = new int[size];
        int[] column4 = new int[size];
        int[] column5 = new int[size];
        int[] column6 = new int[size];
        int[] column7 = new int[size];
        int[] column8 = new int[size];
        int[] column9 = new int[size];

        for (int i = 0; i < size; i++) {
            column1[i] = arrays[0][i];
            column1[i] = arrays[1][i];
            column1[i] = arrays[2][i];
            column1[i] = arrays[3][i];
            column1[i] = arrays[4][i];
            column1[i] = arrays[5][i];
            column1[i] = arrays[6][i];
            column1[i] = arrays[7][i];
            column1[i] = arrays[8][i];
        }
        if (
                checkLine(column1) &&
                        checkLine(column2) &&
                        checkLine(column3) &&
                        checkLine(column4) &&
                        checkLine(column5) &&
                        checkLine(column6) &&
                        checkLine(column7) &&
                        checkLine(column8) &&
                        checkLine(column9)
        ) {
            return true;
        }
        return false;

    }


    public static boolean checkLine(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            {
                list.add(arr[i]);
            }
        }
        List<Integer> listPattern = new ArrayList<>(9);
        for (int i = 1; i <= listPattern.size(); i++) {
            list.add(i);
        }
        if (!list.containsAll(list)) {
            return false;
        }
        return true;
    }

}

