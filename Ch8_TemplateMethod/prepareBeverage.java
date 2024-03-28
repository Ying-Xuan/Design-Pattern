package Ch8_TemplateMethod;

public class prepareBeverage {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        System.out.println();
        
        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();

        System.out.println();
        CoffeeWithHook myCoffeeWithHook = new CoffeeWithHook();
        myCoffeeWithHook.prepareRecipe();

    }
}