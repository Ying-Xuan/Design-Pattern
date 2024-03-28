package Ch11_Proxy.proxy;

public class NoQuarterState extends State {

    // do NOT serialize to transfer
    private static final long serialVersionUID = 2L;  //
    /* transient : tells the  JVM not to serialize this field. */
    // Note that this can be slightly dangerous 
    // if you try to access this field once the object’s been serialized and transferred
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    } 

    public void refill() {}
}
