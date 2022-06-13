package second_part.ex6;

public class Motorcycle extends Cycle {
    String temp= "Hello I am a motorcycle," + super.getTemp();


    public String getTemp() {
        return temp;
    }
}
