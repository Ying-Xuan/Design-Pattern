package Ch8_TemplateMethod;

public abstract class CaffeineBeverage {
 
    // is declared final because we don’t want our subclasses to be able to override this method
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    
    abstract void addCondiments();
        void boilWater() {
        System.out.println("Boiling water");
    }
    
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
