public class DateQuestions {
    public static void main(String[] args) {
        System.out.println(isValidDate(21, 02, 2005));
        System.out.println(firstDay(2005));
    }

    public static int firstDay(int year){
        year--;
        int b = year % 400; //391
        int c = b % 100; 
        b = b - c; // 300
        int ans = (b/100*5 + c + c/4 + 1);
        return ans%7;
    }

    public static boolean leap(int year) {
        if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0)
            return true;
        else
            return false;
    }

     
    public  static boolean isValidDate(int day, int month, int year){
            if(day < 1 || day > 31 || month < 1 || month > 12 || year < 1)
            return false;
            if(day <= daysInMonth(month, year))
        return true;
        else return false;
    }
 
    private static int daysInMonth(int month, int year){
        // Method 1. using if else
    //     if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
    //         return 31;
    //     if(month == 4 || month == 6 || month == 9 || month == 11)
    //         return 30;
    //     else if(month == 2 && leap(year))
    //         return 29;
    //     else
    //         return 28;
    // }

    // Method 2. using switch case
    // switch (month){
    //     case 1: case 3: case 5: case 7: case 8: case 10: case 12:
    //         return 31;
    //     case 4: case 6: case 9: case 11:
    //         return 30;
    //     case 2:
    //         if(leap(year))
    //             return 29;
    //         else
    //             return 28;
    //     default:
    //     return 0;
    // }

    // Method 3. using array
    int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    if(month == 2 && leap(year))
        return 29;
    else
        return days[month];
    }
}