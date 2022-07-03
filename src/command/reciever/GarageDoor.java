package command.reciever;

public class GarageDoor {
    String name = "";

    public GarageDoor(String name){
        this.name = name;
    }

    public  GarageDoor(){}

    public void up(){
        System.out.println("up");
    }

    public void down(){
        System.out.println("down");
    }

    public void stop(){
        System.out.println("stop");
    }

    public void lightOn(){
        System.out.println("lightOn");
    }

    public void lightOff(){
        System.out.println("lightOff");
    }
}
