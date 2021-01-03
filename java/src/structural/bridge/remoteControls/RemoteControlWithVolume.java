package structural.bridge.remoteControls;

import structural.bridge.device.Device;

public class RemoteControlWithVolume extends RemoteControl{
    public RemoteControlWithVolume(Device device) {
        super(device);
    }

    public void volumeUp() {
        int currentVolume = this.device.getVolume();
        device.setVolume(currentVolume + 1);
        System.out.println("Current volume of "
                + this.device.getName()
                + " is "
                + this.device.getVolume()
        );
    }

    public void volumeDown() {
        int currentVolume = this.device.getVolume();
        device.setVolume(currentVolume - 1);
        System.out.println("Current volume of "
                + this.device.getName()
                + " is "
                + this.device.getVolume()
        );
    }
}
