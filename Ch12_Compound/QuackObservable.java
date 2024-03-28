package Ch12_Compound;

// Subject : be observed
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
