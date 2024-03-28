package Ch3_Decoraator;

public abstract class CondimentDecorator extends Beverage {
    // hold the beverage we are wrapping.
    Beverage beverage;
    
    public abstract String getDescription();
}
