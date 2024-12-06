// import java.util.Scanner;

// class SecondMax {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter three numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         int secondMax;
//         if ((a > b && a < c) || (a > c && a < b)) {
//             secondMax = a;
//         } else if ((b > a && b < c) || (b > c && b < a)) {
//             secondMax = b;
//         } else {
//             secondMax = c;
//         }

//         System.out.println("The second maximum number is: " + secondMax);
//     }
// }

// import java.util.Scanner;

// class Leap{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();
//         boolean leap = leapOrNot(year);
//         System.out.println("Is " + year + " a leap year? " + leap);
//         }
//     public static boolean leapOrNot(int year){
//         if(year % 100 == 0 && year % 400 == 0){
//             return true;
//         }
//         if(year % 100 != 0 && year % 4 == 0){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }

