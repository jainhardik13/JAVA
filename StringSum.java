import java.util.Scanner;

public class StringSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSum = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.length() == 0) {
                break;
            }
            System.out.println(sumofLine(line));
            totalSum += sumofLine(line);
        }
        System.out.println("Total sum: " + totalSum);
        sc.close();
    }

    static int sumofLine(String line) {
        Scanner sc = new Scanner(line);
        int lineSum = 0;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            lineSum += x;
        }
        sc.close();
        return lineSum;
    }
}
