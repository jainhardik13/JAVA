import java.util.Scanner;

public class Array2Dim {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the 1st 2D array (rows and columns):- ");
        int[][] array1 = new int[sc.nextInt()][sc.nextInt()];

        System.out.println("Enter the size of the 2nd 2D array (rows and columns):- ");
        int[][] array2 = new int[sc.nextInt()][sc.nextInt()];

        System.out.println("Enter the elements of the 1st 2D array:- ");
        readMatrix(array1, sc);

        System.out.println("Enter the elements of the 2nd 2D array:- ");
        readMatrix(array2, sc);

        System.out.println("The 1st 2D array is as follows:- ");
        printMatrix(array1);
        System.out.println("The 2nd 2D array is as follows:- ");
        printMatrix(array2);

        if (array1.length == array2.length && array1[0].length == array2[0].length) {
            System.out.println("The sum of the 2D arrays is as follows:- ");
            printMatrix(addMatrix(array1, array2));
        } else {
            System.out.println("The matrices cannot be added as they have different dimensions.");
        }

        if (array1[0].length == array2.length) {
            System.out.println("The product of the 2D arrays is as follows:- ");
            printMatrix(multiplyMatrix(array1, array2));
        } else {
            System.out.println("The matrices cannot be multiplied as they have incompatible dimensions.");
        }

        System.out.println("The Max element of the 1st 2D array is:- " + findMax(array1));
        System.out.println("The max element of array1 is present at index:- " + findMaxIndex(array1));
        System.out.println("The Min element of the 2nd 2D array is:- " + findMax(array2));
        System.out.println("The max element of array2 is present at index:- " + findMaxIndex(array2));
    }

    public static void readMatrix(int[][] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrix(int[][] array1, int[][] array2) {
        int[][] sum = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return sum;
    }

    public static int[][] multiplyMatrix(int[][] array1, int[][] array2) {
        int[][] product = new int[array1.length][array2[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array1[0].length; k++) {
                    product[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return product;
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static String findMaxIndex(int[][] array) {
        int max = array[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return "(" + row + ", " + col + ")";
    }
}