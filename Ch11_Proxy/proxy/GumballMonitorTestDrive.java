package Ch11_Proxy.proxy;

import java.rmi.*;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {

        String[] location = {"rmi://127.0.0.1/Taipei",
                            "rmi://127.0.0.1/Miaoli"}; 
        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i=0; i < location.length; i++) {
            try {
                //  get a proxy to each remote machine.
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                // System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0; i < monitor.length; i++) {
            monitor[i].report();
            System.out.println();
        }
    }
}
