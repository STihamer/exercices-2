package second_part.ex14;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=strings
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.toLowerCase().charAt(i) == 'b' || s.toLowerCase().charAt(i) == 'a'){
                counter = counter + 0;
            }else{
                counter = counter +1;
            }
        }
        if(counter >0){
            System.out.println("The input string must contain only 'a' an 'b' characters. Case insensitive");
        }else{
            System.out.println(Result.alternatingCharacters(s));
        }
    }
}


