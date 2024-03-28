package Ch11_Proxy.proxy;

import java.rmi.*;

// extends Remote
// public interface GumballMachineRemote extends Remote {   
//     public int getCount() throws RemoteException;
//     public String getLocation() throws RemoteException;
//     public State getState() throws RemoteException;
// }

public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
