package structural.bridge;

import structural.bridge.device.Device;
import structural.bridge.device.Radio;
import structural.bridge.device.Tv;
import structural.bridge.remoteControls.RemoteControl;
import structural.bridge.remoteControls.RemoteControlWithVolume;

public class Main {
    public static void main(String[] args) {
        Device tv = new Tv();
        Device radio = new Radio();

        RemoteControl remoteControl = new RemoteControl(tv);
        RemoteControlWithVolume remoteControlWithVolume = new RemoteControlWithVolume(radio);

        remoteControl.togglePower();
        remoteControl.togglePower();

        remoteControlWithVolume.togglePower();

        remoteControlWithVolume.volumeUp();
        remoteControlWithVolume.volumeUp();
        remoteControlWithVolume.volumeUp();
        remoteControlWithVolume.volumeUp();

        remoteControlWithVolume.volumeDown();
        remoteControlWithVolume.volumeDown();
        remoteControlWithVolume.volumeDown();
        remoteControlWithVolume.volumeDown();
        remoteControlWithVolume.volumeDown();
    }
}
