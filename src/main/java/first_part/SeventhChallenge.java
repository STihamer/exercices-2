package first_part;

import java.util.Scanner;

public class SeventhChallenge {
    //https://www.hackerrank.com/challenges/java-string-reverse/forum

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        StringBuilder str = new StringBuilder();
        str.append(A).toString();
        String str1 = str.reverse().toString();

       if(str1.equals(str)){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }

        /* Enter your code here. Print output to STDOUT. */

    }
}
