package design_pattern.structual_pattern.bridge;

import design_pattern.structual_pattern.bridge.devices.Device;
import design_pattern.structual_pattern.bridge.devices.Radio;
import design_pattern.structual_pattern.bridge.devices.Tv;
import design_pattern.structual_pattern.bridge.remotes.AdvancedRemote;
import design_pattern.structual_pattern.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
