package first_part;

import java.util.Scanner;

public class NinthChallenge {
     // https://www.hackerrank.com/challenges/java-int-to-string/problem
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();

        String numberToString = number.toString();

        if(numberToString instanceof String){
            System.out.println("Good job");
            System.out.println(numberToString);
        }else{
            System.out.println("Try more");
        }
    }
    /*You are given an integer , you have to convert it into a string.
    Please complete the partially completed code in the editor. If your code successfully
    converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
    can range between  to  inclusive.
    Sample Input 0

            100
    Sample Output 0

    Good job*/
}
