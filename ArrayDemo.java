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

        insertElementSorted(array, array.length - 1);
        System.out.println("Array after inserting last element in sorted order:");
        printArray(array);

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] concatenatedArray = concat(array1, array2);
        System.out.println("Concatenated array:");
        printArray(concatenatedArray);

        int[] arrayToSort = {5, 2, 9, 1, 5, 6};
        System.out.println("Array before insertion sort:");
        printArray(arrayToSort);
        insertionSort(arrayToSort);
        System.out.println("Array after insertion sort:");
        printArray(arrayToSort);

        int[] arrayToReverse = {1, 2, 3, 4, 5};
        System.out.println("Array before reversing:");
        printArray(arrayToReverse);
        reverseArray(arrayToReverse);
        System.out.println("Array after reversing:");
        printArray(arrayToReverse);
    }

    // static int[] concat(int a[], int b[]) {
    //     int[] result = new int[a.length + b.length];
    //     for (int i = 0; i < a.length; i++) {
    //         result[i] = a[i];
    //     }
    //     for (int i = 0; i < b.length; i++) {
    //         result[a.length + i] = b[i];
    //     }
    //     return result;
    // }

    // static void printArray(int[] a) {
    //     for (int i : a) {
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }

    // static int max(int[] a) {
    //     int max = a[0];
    //     for (int i = 1; i < a.length; i++) {
    //         if (a[i] > max) {
    //             max = a[i];
    //         }
    //     }
    //     return max;
    // }

    // static int maxIndex(int[] a, int start, int end) {
    //     int maxIndex = start;
    //     for (int i = start + 1; i <= end; i++) {
    //         if (a[i] > a[maxIndex]) {
    //             maxIndex = i;
    //         }
    //     }
    //     return maxIndex;
    // }

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

    static void insertionSort(int a[]){
        for(int i = 1 ; i < a.length ; i++){
            insertSorted(a, i);
        }
    }

    static void insertElementSorted(int[] a, int n) {
        for(int i = n ; i >= 1 ; i--){
            if(a[i] < a[i-1]){
                int t = a[i];  a[i] = a[i-1]; a[i-1] = t; 
            }
            else break;
        }
    }
    
    static void reverseArray(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }
}