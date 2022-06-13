package second_part.ex5;

public class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers(){

        System.out.println("Soccer Class");
        System.out.println( "Each team has 11 players in " + getName());

    }
}
