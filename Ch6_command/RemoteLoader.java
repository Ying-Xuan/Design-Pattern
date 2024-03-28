public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        FanRemoteControl fanRemoteControl = new FanRemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan LivingCeilingFan = new CeilingFan("Living Room");
        CeilingFan bedCeilingFan = new CeilingFan("BedRoom");
        Stereo stereo = new Stereo("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        CeilingFanOnCommand livingceilingFanOn = new CeilingFanOnCommand(LivingCeilingFan);
        CeilingFanOffCommand livingceilingFanOff = new CeilingFanOffCommand(LivingCeilingFan);
        
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, livingceilingFanOn, livingceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
        
        /* Use lambda */ // can only do this if Command interface has one abstract method.
        // remoteControl.setCommand(0, ()->livingRoomLight.on(), ()->livingRoomLight.off());
        // remoteControl.setCommand(1, ()->kitchenLight.on(), ()->kitchenLight.off());
        // remoteControl.setCommand(2, ()->ceilingFan.on(), ()->ceilingFan.off());
        // remoteControl.setCommand(3, stereoOnWithCD, ()->stereo.off());
        // remoteControl.setCommand(4, ()->garageDoor.up(), ()->garageDoor.down());

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        System.out.println();

        CeilingFanLowCommand bedgceilingFanlow = new CeilingFanLowCommand(bedCeilingFan);
        CeilingFanMediumCommand bedceilingFanMedium = new CeilingFanMediumCommand(bedCeilingFan);
        CeilingFanHighCommand bedceilingFanHigh = new CeilingFanHighCommand(bedCeilingFan);
        CeilingFanOffCommand bedceilingFanOff = new CeilingFanOffCommand(bedCeilingFan);

        fanRemoteControl.setCommand(0, bedgceilingFanlow);
        fanRemoteControl.setCommand(1, bedceilingFanMedium);
        fanRemoteControl.setCommand(2, bedceilingFanHigh);
        fanRemoteControl.setCommand(3, bedceilingFanOff);

        fanRemoteControl.ButtonWasPushed(0);
        fanRemoteControl.ButtonWasPushed(2);
        fanRemoteControl.undoButtonWasPushed();
        fanRemoteControl.ButtonWasPushed(1);
        fanRemoteControl.ButtonWasPushed(3);

        System.out.println();

        Command[] partyOn = {livingRoomLightOn, kitchenLightOn, livingceilingFanOn, stereoOnWithCD};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff, livingceilingFanOff, stereoOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remoteControl.setCommand(5, partyOnMacro, partyOffMacro);
        remoteControl.onButtonWasPushed(5);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
    }
}