package blog_oop;

public abstract class Pokemon {

    private String name;
    private int lengthOfTail;

    public Pokemon(String name, int lengthOfTail){
        this.name = name;
        this.lengthOfTail = lengthOfTail;
    }

    public String getName(){
        return name;
    }

    public int getLengthOfTail() {
        return lengthOfTail;
    }
}
