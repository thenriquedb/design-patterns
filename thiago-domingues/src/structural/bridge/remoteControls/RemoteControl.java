package structural.bridge.remoteControls;

import structural.bridge.device.Device;

public class RemoteControl{
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        this.device.setPower(!this.device.getPower());
        System.out.println(this.device.getName() + " power status " + this.device.getPower());
    }

    
}
