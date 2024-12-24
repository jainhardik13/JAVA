import java.util.Scanner;

public class MaxAndIndex {
    public static void main(String[] args){
        int n;
        System.out.println("Enter number of Elements in an array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Array is: ");
        printArray(array);

        int maxNum = max(array);
        int maxIndex = maxIndex(array);
        System.out.println("Max number is: " + maxNum + " at index : " + maxIndex);
    }

    public static void printArray(int[] a){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int max(int[]a){
        int max = a[0];

        for(int i = 0 ; i < a.length ; i++){
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int maxIndex(int[] a){
        int maxIndex = 0;

        for(int i = 0 ; i < a.length ; i++){
            if(a[i] > a[maxIndex]){
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
