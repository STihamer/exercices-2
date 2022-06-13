package first_part;

import java.util.*;

public class SixthChallenge {
    //https://www.hackerrank.com/challenges/java-string-compare/problem
    public static void getSmallestAndLargestCompareTo(String s, int k) {
        List<String> makeToStringList = new ArrayList<>();
        for (int i = 0; i <= s.length() - k; i++) {
            makeToStringList.add(s.substring(i, i + k));
            Collections.sort(makeToStringList);


        }

        Optional<String> maxString = makeToStringList.stream()
                .max((h, j) -> h.compareTo(j));
        System.out.println(maxString);

        Optional<String> minString = makeToStringList.stream()
                .min((h, j) -> h.compareTo(j));
        System.out.println(minString);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();

        getSmallestAndLargestCompareTo(str, k);


    }

}
