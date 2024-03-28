package Ch11_Proxy.proxy;

import java.rmi.*;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        
        GumballMachineRemote gumballMachine = null;
        String[] locations = {"Taipei", "Miaoli"};
        int[] nums = {5, 3};


        for (int i=0; i<locations.length; i++) {
            try {
                gumballMachine = new GumballMachine(locations[i], nums[i]);
                Naming.rebind(locations[i], gumballMachine);
            } catch (Exception e) {
                System.out.println(locations[i] + " error");
                e.printStackTrace();
            }    
        }
        System.out.println("Server is ready~");
        
    }
}