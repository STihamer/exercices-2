package second_part.ex14;

public class Result {
    public static int alternatingCharacters(String s) {

        int counter = 0;
        for(int i = 0; i<s.length()-1; i++){
            if (s.toLowerCase().charAt(i) == s.toLowerCase().charAt(i +1)){
                counter ++;
            }

        }
        return counter;
    }

    public static void main(String[] args) {

    }
}