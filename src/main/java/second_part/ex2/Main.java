package second_part.ex2;
//https://www.hackerrank.com/challenges/java-inheritance-2/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int a = adder.add(30, 12);
        int b = adder.add(1, 12);
        int c = adder.add(8, 12);


        System.out.print(a + " " + b +  " " + c);
    }
}
