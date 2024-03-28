package Ch11_Proxy.ProtectionProxy;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
    // instance variables here
    
    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public void drive() {

        Person joe = new PersonImpl("Joe Javabean", "Female", "Reading, hiking"); 
        Person ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");

        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }

        System.out.println("Rating is " + ownerProxy.getGeekRating());

        System.out.println();

        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());

        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setGeekRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getGeekRating());
    }

    private Person getOwnerProxy(Person person) {
 
        return (Person) Proxy.newProxyInstance( person.getClass().getClassLoader(),
                            person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
        
    }

    private Person getNonOwnerProxy(Person person) {
 
        return (Person) Proxy.newProxyInstance( person.getClass().getClassLoader(),
                            person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
        
    }
}
