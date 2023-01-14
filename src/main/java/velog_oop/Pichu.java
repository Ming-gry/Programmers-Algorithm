package velog_oop;

public class Pichu extends Pokemon implements Attack{

    private String voltage;

    public Pichu(String name, int lengthOfTail, String voltage) {
        super(name, lengthOfTail);
        this.voltage = voltage;
    }

    public String getVoltage(){
        return voltage;
    }

    @Override
    public String attack() {
        return voltage + "볼트 발사!";
    }

    @Override
    public String tailPress() {
        return null;
    }

    @Override
    public String thunderStorm() {
        return null;
    }
}
