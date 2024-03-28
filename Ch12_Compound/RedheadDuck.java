package Ch12_Compound;

// public class RedheadDuck implements Quackable {
//     public void quack() {
//         System.out.println("Quack");
//     }
// }

public class RedheadDuck implements Quackable {
    
    Observable observable;
    
    public RedheadDuck() {
        observable = new Observable(this);
    }
    
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
