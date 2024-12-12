import java.util.Scanner;
public class EigthDigitFromRightOfANumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        int digit = (number / 10000000) % 10;
        System.out.println("Eigth digit from right of " + number + " is " + digit);
    }    
}
