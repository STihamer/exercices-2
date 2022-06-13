package second_part.ex4;
//https://www.hackerrank.com/challenges/java-interface/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(myCalculator.divisor_sum(6));
    }
}
