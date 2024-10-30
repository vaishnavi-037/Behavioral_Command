package exampleTwo.Client;

import exampleTwo.command.LightOnCommand;
import exampleTwo.invoker.RemoteControl;
import exampleTwo.receiver.Light;

public class Application {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);

        remoteControl.pressButton();
    }
}
