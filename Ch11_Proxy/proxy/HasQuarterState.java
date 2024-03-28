package Ch11_Proxy.proxy;

import java.util.Random;

public class HasQuarterState extends State {

    // do NOT serialize to transfer
    private static final long serialVersionUID = 2L;  //
    /* transient : tells the  JVM not to serialize this field. */
    // Note that this can be slightly dangerous 
    // if you try to access this field once the object’s been serialized and transferred
    transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    //
    Random randomWinner = new Random(System.currentTimeMillis());
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(3);
            if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
    
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void refill() {}
}
   