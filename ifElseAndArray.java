import java.util.Scanner;

class ifElseAndArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter three Numbers:- ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maximun Number is:- " + findMax(a, b, c));
        System.out.println("Nearer Number to " + a + " is:- " + findNearer(a, b, c));

        System.out.println("Enter the size of the array:- ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:- ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Maximum Consecutive Difference is:- " + maxConsecutiveDifference(array));
    }

    static int findMax(int a, int b, int c){
        int max = 0;
        if(a > b && a > c){
            max = a;
        }
        else if(b > a && b > c){
            max = b;
        }
        else{
            max = c;
        }
        return max;
    }

    static int findNearer(int a, int b, int c){
        int diff1 = a-b;
        int diff2 = a-c;
        if(diff1 < 0 || diff2 < 0){
            diff1 = -diff1;
            diff2 = -diff2;
        }

        if(diff1 < diff2){
            return b;
        }
        else{
            return c;
        }
    }

    static int maxConsecutiveDifference(int[] array) {
        int maxDiff = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int diff = array[i] - array[i + 1];
            if (diff < 0) {
                diff = -diff;
            }
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }   
    
}

