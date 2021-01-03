package structural.bridge.device;

public class Tv implements Device {
    private String name = "Tv";
    private int volume;
    private boolean power;

    @Override
    public void setPower(boolean power) {
        this.power = power;
    }

    @Override
    public boolean getPower() {
        return this.power;
    }

    @Override
    public void setVolume(int volume) {
        if(volume < 0 || volume >= 100) return;
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
