package Ch11_Proxy.proxy;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;

// Be a server
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State state;
    State winnerState;
    int count = 0;
    String location = "";

    private static final long serialVersionUID = 2L;

    // throws RemoteException
    public  GumballMachine(String location, int numberGumballs) throws RemoteException {
        
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        this.location = location;
        
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count = count - 1;
        }
    }

    void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
        state.refill();
    }

    public int getCount() {
        return count;
    }

    void setState(State state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    void setLocation(String location) {
        this.location = location;
    }

    public State getState() {
        return state;
    }
    public State getSoldOutState() {
        return soldOutState;
    }
    public State getNoQuarterState() {
        return noQuarterState;
    }
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    public State getSoldState() {
        return soldState;
    }
    public State getWinnerState() {
        return winnerState;
    }
}