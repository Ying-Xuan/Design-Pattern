package Ch11_Proxy.RMI;

import java.rmi.*;

public class MyRemoteClient {
    public static void main (String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            // It comes out of the registry as type : Object, so it need to cast
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello(); 
            System.out.println(s);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
