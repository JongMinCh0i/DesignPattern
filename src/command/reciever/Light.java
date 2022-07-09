package command.reciever;

public class Light {
    String name = "";

    public Light(String name){
        this.name = name;
    }

    public Light(){}

    public void on(){
        System.out.println(this.name + "불이 켜짐");
    }

    public void off(){
        System.out.println(this.name + "불이 꺼짐");
    }
}
