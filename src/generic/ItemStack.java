package generic;

import java.util.LinkedList;
import Item.Item;

public class ItemStack {
	LinkedList<Item> Items = new LinkedList<Item>();
    
    public void push(Item h) {
        Items.addLast(h);
    }
   
    public Item pull() {
        return Items.removeLast();
    }
   
    public Item peek() {
        return Items.getLast();
    }
       
    public static void main(String[] args) {
           
        ItemStack ItemStack = new ItemStack();
        for (int i = 0; i < 5; i++) {
            Item item = new Item("Item name " + i);
            System.out.println("Ñ¹Èë Item:" + item);
            ItemStack.push(item);
        }
        for (int i = 0; i < 5; i++) {
            Item item =ItemStack.pull();
            System.out.println("µ¯³ö Item" + item);
        }
    }

}
