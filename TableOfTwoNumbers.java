public class TableOfTwoNumbers {
    static void table(int n, int m) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i + " ");
            System.out.print(m * i + " ");
        }
    }

    public static void main(String[] args) {
        table(7, 5);
    }

}
