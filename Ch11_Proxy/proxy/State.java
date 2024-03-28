package Ch11_Proxy.proxy;

import java.io.*;

// extend
// public interface State extends Serializable {
//     public void insertQuarter();
//     public void ejectQuarter();
//     public void turnCrank();
//     public void dispense();
// }


public abstract class State implements Serializable {
    public abstract void insertQuarter();
    public abstract void ejectQuarter();
    public abstract void turnCrank();
    public abstract void dispense();
    public abstract void refill();
}