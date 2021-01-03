package structural.bridge.device;

public interface Device {
    void setName(String name);
    void setPower(boolean power);
    void setVolume(int volume);

    String getName();
    boolean getPower();
    int getVolume();
}
