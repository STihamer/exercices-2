package first_part;

public class ThirdChallenge {

    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true

        /*2 x 2 = 4
        2 x 3 = 6
        2 x 4 = 8
        2 x 5 = 10
        2 x 6 = 12
        2 x 7 = 14
        2 x 8 = 16
        2 x 9 = 18
        2 x 10 = 20*/
        int element = 2;
        for(int i = element; i<=10; i++){
            System.out.println(element + " x " + i + " = " + (element * i) );
        }
    }
}
