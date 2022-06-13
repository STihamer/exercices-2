package first_part;

import java.util.Scanner;

public class ForthSoution {

    // https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int a = 5;
        int b = 3;
        int n = 5;
        int counter = 0;
        int counter1 = 1;
        for (int j = 0; j < n; j++) {
            int counter2 = counter1 * b;
            counter = counter + counter2;
            counter1 = counter1*2;
            System.out.println(counter + a);

        }
    }


}
