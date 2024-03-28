package Ch4_Factory.FactoryMethod;

public abstract class PizzaStore {
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		// System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	// A method that acts as a factory.
	// 將工廠的職責(創建物件)封裝在Creator(Client)的一個abstract方法中
    abstract Pizza createPizza(String item);
    
}
