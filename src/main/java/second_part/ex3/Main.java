package second_part.ex3;
//https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        MyBook myBook = new MyBook();
        myBook.setTitle("A tale of two cities");
        System.out.println("The title is: " + myBook.getTitle());
    }
}
