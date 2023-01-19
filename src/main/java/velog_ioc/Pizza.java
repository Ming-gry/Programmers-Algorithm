package velog_ioc;

interface Dough{
}

interface Pepperoni{
}

interface Cheese{
}

interface Meat{
}

public class Pizza {
    private Dough dough;
    private Pepperoni pepperoni;
    private Cheese cheese;
    private Meat meat;

    public Pizza(Dough dough, Pepperoni pepperoni, Cheese cheese, Meat meat){
        this.dough = dough;
        this.pepperoni = pepperoni;
        this.cheese = cheese;
        this.meat = meat;
    }

    public Dough getDough() {
        return dough;
    }

    public Meat getMeat() {
        return meat;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza(new OriginalDough(), null, null, new KoreanBeef());

        System.out.println(pizza.getDough());
        System.out.println(pizza.getPepperoni());
        System.out.println(pizza.getCheese());
        System.out.println(pizza.getMeat());
    }
}
