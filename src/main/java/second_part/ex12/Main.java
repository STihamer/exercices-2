package second_part.ex12;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        Singleton singleton = Singleton.getSingleInstance();
        System.out.println(singleton.getStr() + " " +  str1 + "!");
    }
}
