package Ch3_Decoraator;

// extend Decorator
public class Soy extends CondimentDecorator {

    // instantiate Soy with a reference to a Beverage.
    public Soy(Beverage beverage) {
        this.beverage = beverage;  // set the instence to the object we are mapping
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + .15;
    }
}
