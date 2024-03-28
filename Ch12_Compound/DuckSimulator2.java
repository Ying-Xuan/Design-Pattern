package Ch12_Compound;

/* Adapter + Decorator */
public class DuckSimulator2 {
    public static void main(String[] args) {
        DuckSimulator2 simulator = new DuckSimulator2();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));
        System.out.println("\nDuck Simulator: With Decorator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
   }
