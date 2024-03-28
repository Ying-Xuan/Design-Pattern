package Ch9_IteratorAndComposite_Composite;

public class Waitress {
    MenuComponent allMenus;
   
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    
    public void printMenu() {
        allMenus.print();
    }
}
