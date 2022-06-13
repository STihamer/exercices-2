package second_part.ex12;

public class Singleton {
    private  String str;
    private static Singleton instance;

    private Singleton() {
        this.str = "Hello I am a singleton! Let me say";
    }

    public String getStr() {
        return str;
    }

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
