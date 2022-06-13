package first_part;

import java.util.Scanner;

public class EleventhChallenge {

    //https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        int[] listOfNumbers = new int[sc];
        for (int i = 0; i < sc; i++) {
            int sc1 = scanner.nextInt();
            listOfNumbers[i] = sc1;
        }
        System.out.println(sc);
        for (int i = 0; i< listOfNumbers.length; i++){
            System.out.println(listOfNumbers[i]);
        }
        scanner.close();
    }


}
