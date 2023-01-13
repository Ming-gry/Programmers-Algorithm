package blog_oop;

public class Raichu extends Pikachu{

    public Raichu(String name, int lengthOfTail, String voltage) {
        super(name, lengthOfTail, voltage);
    }

    @Override
    public String thunderStorm() {
        return getVoltage() + "썬더 스톰 발사!";
    }
}
