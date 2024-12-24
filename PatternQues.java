import java.util.Scanner;

public class PatternQues {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n = sc.nextInt();
        Pattern1(n);
        Pattern2(n);
    }

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    public static void Pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //         1
    //         1 2
    //         1 2 3
    //         1 2 3 4
    //         1 2 3 4 5
    public static void Pattern2(int n) {
        int num = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
            num = num - 2;
        }
    }

    
    public static void Pattern3(int n) {

    }
}
