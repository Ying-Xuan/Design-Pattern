package Ch4_Factory.FactoryMethod;

public class PizzaTestDrive {
	public static void main(String[] args) {
        
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		nyStore.orderPizza("cheese");
        nyStore.orderPizza("veggie");
        chicagoStore.orderPizza("clam");
        chicagoStore.orderPizza("clam");

	}
}