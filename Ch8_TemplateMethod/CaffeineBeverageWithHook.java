package Ch8_TemplateMethod;

public abstract class CaffeineBeverageWithHook {
 
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    abstract void brew();
    
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }
    
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Hook
    boolean customerWantsCondiments() {
        return true;
    }
}
