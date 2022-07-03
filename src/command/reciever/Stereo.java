package command.reciever;

public class Stereo {
    int volume = 0;
    String name = "";

    public Stereo(String name){
        this.name = name;
    }

    public void on(){
        System.out.println(getClass() + ".on");
    }

    public void off(){
        System.out.println(getClass() + ".off");
    }

    public void setCd(){
        System.out.println(getClass() + ".setCd");
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println(getClass() + ".setVolume -> volume(" + this.volume + ")");
    }

}
