package first_part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EighthChallenge {

   // https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
    static boolean isAnagram(String a, String b) {

        List<Character> anagramListFirst = new ArrayList<>();
        List<Character> anagramListSecond = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            anagramListFirst.add(a.charAt(i));
        }

        for (int i = 0; i < b.length(); i++) {
            anagramListSecond.add(b.charAt(i));
        }

        Collections.sort(anagramListFirst);
        Collections.sort(anagramListSecond);

        if (anagramListFirst.equals(anagramListSecond)) {
            System.out.println("Anagrams");
        } else {
            System.out.println(" Not anagrams");
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        sc.nextLine();
        String B = sc.nextLine();

        isAnagram(A, B);

    }
}
