package inheritance;

public class Boat extends Vehicle{
    public Boat(){
        super("Boat Start", "Boat End", "Boat Speed", "Boat Direction");
    }

    public void depthFinder(){
        System.out.println("How deep is the water");
    }
}
