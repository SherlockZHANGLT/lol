package List;

import java.util.ArrayList;

import Item.Item;
import lol.Hero;

public class HeroItemList extends ArrayList{
	public boolean canAdd(Object o) {
        return o instanceof Hero || o instanceof Item;
    }
 
    @Override
    public boolean add(Object o) {
        return this.canAdd(o) && super.add(o);
    }
 
    @Override
    public void add(int index, Object element) {
        if (this.canAdd(element)) {
            super.add(index, element);
        }
    }

}
