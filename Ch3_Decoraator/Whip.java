package Ch3_Decoraator;

public class Whip extends CondimentDecorator {

    // instantiate Whip with a reference to a Beverage.
    public Whip(Beverage beverage) {
        this.beverage = beverage;  // set the instence to the object we are mapping
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + .15;
    }
}
