package velog_ioc;

class OriginalDough implements Dough{
}

class ItalianPepperoni implements Pepperoni{
}

class MozzarellaCheese implements Cheese{
}

class KoreanBeef implements Meat{
}


public class PepperoniPizza {
    private OriginalDough originalDough;
    private ItalianPepperoni italianPepperoni;
    private MozzarellaCheese mozzarellaCheese;
    private KoreanBeef koreanBeef;

    public PepperoniPizza(){
        this.originalDough = new OriginalDough();
        this.italianPepperoni = new ItalianPepperoni();
        this.mozzarellaCheese = new MozzarellaCheese();
        this.koreanBeef = new KoreanBeef();
    }

    public void deletePepperoni(){
        this.italianPepperoni = null;
    }

    public ItalianPepperoni getItalianPepperoni(){
        return italianPepperoni;
    }

    public static void main(String[] args) {
        PepperoniPizza pepperoniPizza = new PepperoniPizza();
        System.out.println(pepperoniPizza.getItalianPepperoni());

        pepperoniPizza.deletePepperoni();
        System.out.println(pepperoniPizza.getItalianPepperoni());
    }
}
