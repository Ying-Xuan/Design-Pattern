package Ch11_Proxy.AbstractProxy.other;

import java.util.Hashtable;

public class ProxyPatternTestDruve {

    public static void main(String[] args) {

        Hashtable<Integer, String> albums = new Hashtable<Integer, String>();
        for (int i=0; i<=5; i++) {
            String fileName = i + ".jpg";
            albums.put(i, fileName);
        }

        Image image = new ProxyImage(albums.get(3));


        image.display(); 
        System.out.println("");
        image.display();  
    }
}