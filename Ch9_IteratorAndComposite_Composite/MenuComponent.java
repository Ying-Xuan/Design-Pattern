package Ch9_IteratorAndComposite_Composite;

// subtree
public abstract class MenuComponent {
    /*
    Because some of these methods only make sense for MenuItems, and some only make sense for Menus, 
    the default implementation is UnsupportedOperationException. That way, if MenuItem or Menu doesn’t 
    support an operation, it doesn’t have to do anything; it can just inherit the default implementation.
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    
    public void print() {
        throw new UnsupportedOperationException();
    }
}
