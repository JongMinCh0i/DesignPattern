package command.client;

import command.GarageDoorUpCommand;
import command.LightOnCommand;
import command.invoker.SimpleRemoteControl;
import command.reciever.GarageDoor;
import command.reciever.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
