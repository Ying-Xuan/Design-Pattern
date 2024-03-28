package Ch10_State;

public abstract class State {
    public abstract void insertQuarter();
    public abstract void ejectQuarter();
    public abstract void turnCrank();
    public abstract void dispense();
    public abstract void refill();
}
