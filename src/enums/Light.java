package enums;

public class Light {
    public void changeLight(StopLight currentLight){
        if(currentLight == StopLight.RED){
            System.out.println("STOP!!!");
        } else if (currentLight == StopLight.YELLOW) {
            System.out.println("Get Ready!");
        }else{
            System.out.println("Gooo!!");
        }
    }
}
