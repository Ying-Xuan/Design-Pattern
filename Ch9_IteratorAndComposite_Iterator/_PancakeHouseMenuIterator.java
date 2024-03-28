package Ch9_IteratorAndComposite_Iterator;

import java.util.List;

public class _PancakeHouseMenuIterator implements Iterator {
    List<MenuItem> items;
    int position = 0;

    public _PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }
}
