package Ch12_Compound;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    
    List<Quackable> quackers = new ArrayList<Quackable>();
    
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        // child maintenance method
        Iterator<Quackable> iterator = quackers.iterator();
        /* the Flock is a Quackable too. The quack() method in Flock needs to work over the entire Flock. 
            Here we iterate through the ArrayList and call quack() on each element */
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.registerObserver(observer);
        }
    }
        
    public void notifyObservers() { }
}
