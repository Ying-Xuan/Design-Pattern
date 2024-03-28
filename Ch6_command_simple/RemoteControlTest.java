package Ch6_command_simple;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        // LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(()->light.on());
        remote.buttonWasPressed();
    }
}
