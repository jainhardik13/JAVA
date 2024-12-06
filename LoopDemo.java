public class LoopDemo {
    public static void main(String[] args) {

        int[] a = { 2, 3, 4, 5, 1, 2, 7, 5, 3, 2 };
        int[] b = { 0, 0, 0, 0, 0 };
        /*
         * b[0] = a[0] + a[1];
         * b[1] = a[2] + a[3];
         * b[2] = a[4] + a[5];
         * b[3] = a[6] + a[7];
         * b[4] = a[8] + a[9];
         */
        for (int i = 0; i < 5; i++) {
            b[i] = a[2 * i] + a[2 * i + 1];
        }
    }

    // 3 47 54 56 85 25 15
    // 3 47 54 56 85 25 15
    // 3 47 54 56 25 85 15
    // 3 47 54 56 25 15 85

    // if(a0>a1) swap a0 with a1
    // if(a1>a2) swap a1 with a2
    // if(a2>a3) swap a2 with a3
    // if(a3>a4) swap a3 with a4
    // if(an-2 > an-1) swap an-2 with an-1

    // for(int j = 1; j < n ;j++)
    // {
    //     for (int i = 0; i < n - 1; i++) {
    //         if (a[i] > a[i + 1]) {
    //             int temp = a[i];
    //             a[i] = a[i - 1];
    //             a[i - 1] = temp;
    //         }
    //     }
    // }

    // n = 65359
    // int last = n % 10;
    // print last
    // n = n / 10;
    // last = n % 10;
    // print last
    // n = n / 10;
    // last = n % 10;
    // print last
    // n = n / 10;
    // last = n % 10;
    // print last
    // n = n / 10;
    // last = n % 10;
    // print last
    // n = n / 10;
    // last = n % 10;
    // print last

    
}
