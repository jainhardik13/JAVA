import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = {12, 23, 34, 45, 17, 45, 34, 76, 7, 64, 77, 41};
        
        System.out.println("Original array:");
        printArray(array);

        int maxValue = max(array);
        System.out.println("Maximum value: " + maxValue);

        int maxIndexValue = maxIndex(array, 0, array.length - 1);
        System.out.println("Index of maximum value: " + maxIndexValue);

        insertSorted(array, array.length);
        System.out.println("Array after insertion sort:");
        printArray(array);
    }

    static int[] concat(int a[], int b[]) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }
        return result;
    }

    static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static int maxIndex(int[] a, int start, int end) {
        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void insertSorted(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }

}
