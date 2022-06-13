package second_part.ex5;
//https://www.hackerrank.com/challenges/java-method-overriding/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Sports sports = new Sports();
        System.out.println("Generic Sports");
        sports.getNumberOfTeamMembers();
        Soccer soccer = new Soccer();
        soccer.getNumberOfTeamMembers();
    }
}
