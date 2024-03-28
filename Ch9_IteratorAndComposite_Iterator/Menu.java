package Ch9_IteratorAndComposite_Iterator;

import java.util.Iterator;

// This is a simple interface that just lets clients get an iterator for the items in the menu.
public interface Menu {
    public Iterator<MenuItem> createIterator();
}
