package Ch10_State;

public class GumballMachineTestDrive {

	public static void main(String[] args) {

		GumballMachine gumballMachine = new GumballMachine(3);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.refill(5);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
	}
}
