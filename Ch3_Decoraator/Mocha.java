package Ch3_Decoraator;

// extend Decorator
public class Mocha extends CondimentDecorator {

    // instantiate Mocha with a reference to a Beverage.
    public Mocha(Beverage beverage) {
        this.beverage = beverage;  // set the instence to the object we are mapping
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + .20;
    }
}
