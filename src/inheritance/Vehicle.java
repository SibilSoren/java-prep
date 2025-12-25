package inheritance;

public class Vehicle {
    private String start;
    private String end;
    private String speed;
    private String direction;

    public Vehicle(String start, String end, String speed, String direction){
        this.start = start;
        this.speed = speed;
        this.end = end;
        this.direction = direction;
    }

    public void start(){
        System.out.println(start);
    }

    public void  end(){
        System.out.println(end);
    }

    public void speed(){
        System.out.println(speed);
    }

    public void direction(){
        System.out.println(direction);
    }

}
