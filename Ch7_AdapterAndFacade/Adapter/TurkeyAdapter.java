package Ch7_AdapterAndFacade.Adapter;

// implement Target interface
public class TurkeyAdapter implements Duck {
    
    Turkey turkey;  // Adaptee
    
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    
    public void quack() {
        turkey.gobble();
    }
    
    public void fly() {
        for(int i=0; i < 5; i++) {
            turkey.fly();
        }
    }
}
