package Ch11_Proxy.RMI;

import java.rmi.*;
import java.rmi.server.*;

/* Remote Implementation : real implementation of the remote methods defined in the remote interface */
// extend UnicastRemoteObject
// implements remote interface
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    
    // UnicastRemoteObject implements  Serializable, so we need the serialVersionUID field
    private static final long serialVersionUID = 1L;
    
    // real implementation
    public String sayHello() {
        return "Server says, 'Hey'";
    }

    // a no-arg constructor that declares RemoteException : 
    // declare that your superclass constructor throws an exception.
    public MyRemoteImpl() throws RemoteException { }

    public static void main (String[] args) {
        // Register the service with the RMI registry
        try {
            MyRemote service = new MyRemoteImpl();
            // When you bind the service object, RMI swaps the service for the stub and
            // puts the stub in the registry.
            Naming.rebind("RemoteHello", service);

            System.out.println("Server is ready...");
        } catch(Exception ex) {
            System.err.println("Error");
            ex.printStackTrace();
        }
    }
}
