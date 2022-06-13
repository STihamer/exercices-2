package first_part;

import java.util.Scanner;

public class FirstChallenge {
//https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please introduce an integer");
        int i = scan.nextInt();

        System.out.println("Please introduce a double");
        double d = scan.nextDouble();

        System.out.println();


        System.out.println("Please introduce a String");

        scan.nextLine(); // Consume newline left-over
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);


        // Write your code here.
    }

}


