import java.util.Arrays;
import java.util.*;

public class Algorithm2DArrays {
    public static boolean isFound(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr[0].length; a++) {
                if (arr[i][a] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /** Return the number of elements in arr that contain searchStr as a substring
     *  For example, if arr is:
     *                  {{"hi", "bye", "howl", "goo"},
     *                   {"time", "owl", "you", "good"},
     *                   {"map", "low", "bow", "mom"}};
     *  and searchStr is "ow", this method returns 4, because 4 strings in arr
     *  contain "ow" as a substring.
     *
     *  @param arr  2D array of Strings
     *  @param target  searchStr value to be searched for in each String of arr
     *  @return  the number of elements that contain searchStr as a substring
     */
    public static int countElementsWithSubstring(String[][] arr, String searchStr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr[0].length; a++) {
                if (arr[i][a].contains(searchStr)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    /** Replaces all even integers in arr with 0; all odd integers are unchanged.
     *  It also returns the number of changes that were made.
     *
     *  THIS METHOD MODIFIES THE ORIGINAL 2D ARRAY OBJECT!
     *
     *  @param arr  2D array of ints
     *  @return  the number of changes made
     */
    public static int replaceEvensWithZero(int[][] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr[0].length; a++) {
                if (arr[i][a]%2 == 0) {
                    arr[i][a] = 0;
                    counter++;
                }
            }
        }
        return counter;
    }

    /** Return the sum of all elements of arr that are in the one particular row,
     *  specified by the row parameter
     *
     *  PRECONDITION:  0 <= row < arr.length (i.e. row will be valid)
     *
     *  @param arr  2D array of ints
     *  @param row  the row to add up
     *  @return  the sum of all elements in row

     */
    public static int sumForRow(int[][] arr, int row) {
        int sum = 0;
        for (int a = 0; a < arr[row].length; a++) {
            sum+=arr[row][a];
        }
        return sum;
    }
    /** Return the sum of all elements of arr that are in the one particular column
     *
     *  PRECONDITION:  0 <= col < arr[0].length (i.e. col is valid)
     *
     *  @param arr  2D array of ints
     *  @param col  the column to add up
     *  @return  the sum of all elements in column
     */
    public static int sumForColumn(int[][] arr, int col) {
        int sum = 0;
        for (int a = 0; a < arr.length; a++) {
            sum+=arr[a][col];
        }
        return sum;
    }

    /** Creates a 2D array of ints of size n x m, where n is number of rows and
     *  m is number of columns; the elements in the 2D array should be numbered 0
     *  through n x m - 1, with the numbers filled top to bottom, left to right.
     *  The method prints the 2D array "grid" of numbers, and also returns
     *  the 2D array.
     *
     *  For example, for rows = 3 and cols = 4, this method should print
     *  (and return):
     *  0 1 2 3
     *  4 5 6 7
     *  8 9 10 11
     *
     *  Print each element with a single space in between.
     *
     *  @param rows  number of rows
     *  @param cols  number of columns
     *  @return  the same 2D array "number grid" that gets printed by the method
     */
    public static int[][] printNumberGrid(int rows, int cols) {
        int[][] grid = new int[rows][cols];
        int num = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int a = 0; a < grid[0].length; a++) {
                grid[i][a] = num;
                num++;
            }
        }

        return grid;
    }
}
