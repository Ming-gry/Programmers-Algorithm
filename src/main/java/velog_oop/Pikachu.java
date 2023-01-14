package velog_oop;

public class Pikachu extends Pichu{

    public Pikachu(String name, int lengthOfTail, String voltage) {
        super(name, lengthOfTail, voltage);
    }

    @Override
    public String tailPress() {
        return getLengthOfTail() + "만큼 누르기!";
    }
}
