import java.util.Scanner;
class ConcatArrays{
    public static void main(String args[]){
        int[] arr1 = new int[15];
        int[] arr2 = new int[10];
        System.out.println("Enter the elements of the first array");
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 15 ; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of second array");
        for(int i = 0 ; i < 10 ; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("The first array is:");
        printArray(arr1);
        System.out.println("The second array is:");
        printArray(arr2);

        System.out.println("The concatenated array is:");
        int[]result = concatenatedArray(arr1,arr2);
        printArray(result);
    }

    static void printArray(int[] a){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }    
        System.out.println();
    }

    static int[] concatenatedArray(int[] a, int[] b){
        int[] result = new int[a.length + b.length];

        for(int i = 0 ; i < a.length ; i++){
            result[i] = a[i];
        }

        for(int i = 0 ; i < b.length ; i++){
            result[a.length + i] = b[i];
        }

        return result;
    }
}