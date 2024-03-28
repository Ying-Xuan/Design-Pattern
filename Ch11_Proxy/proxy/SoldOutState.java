package Ch11_Proxy.proxy;

public class SoldOutState extends State {

    // do NOT serialize to transfer
    private static final long serialVersionUID = 2L;  //
    /* transient : tells the  JVM not to serialize this field. */
    // Note that this can be slightly dangerous 
    // if you try to access this field once the object’s been serialized and transferred
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void refill() { 
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
