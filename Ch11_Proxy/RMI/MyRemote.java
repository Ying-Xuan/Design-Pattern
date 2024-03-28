package Ch11_Proxy.RMI;

import java.rmi.*;

/* Remote interface : defines the methods that a client can call remotely */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
