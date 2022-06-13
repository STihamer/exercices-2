package second_part.ex10;
//https://www.hackerrank.com/challenges/can-you-access/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Inner innerClass = main.new Inner();
        Inner.Private privateClass = innerClass.new Private();
        privateClass.powerOf2(6);
    }

    public class Inner {
        public class Private {
            public void powerOf2(Integer nr) {
                if (nr % 2 == 0) {
                    Main.Inner.Private o = new Inner().new Private();
                    String str = o.getClass().getCanonicalName().substring(o.getClass().getPackageName().length() + 1);
                    System.out.println(nr + " is power of 2");
                    System.out.println("An instance of class: " +  str + " has been created");
                }
            }
        }
    }
}
