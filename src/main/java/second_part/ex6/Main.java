package second_part.ex6;
//https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        Vehicle vehicle = new Vehicle();

        System.out.println(motorcycle.temp + "with engine.");
        System.out.println("My ancestor is a cycle " + vehicle.getTemp());

    }
}
