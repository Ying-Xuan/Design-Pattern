package Ch3_Decoraator;

public class StarbuzzCoffee {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);  // wrapping
        beverage3 = new Mocha(beverage3);  // wrapping
        beverage3 = new Whip(beverage3);  // wrapping
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}