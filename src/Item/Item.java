package Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Item implements Comparable<Item>{
    String name;
    int price=0;
    public Item(){
        
    }
    public Item(String name){
        this.name = name;
    }
    public Item(String name,int price){
        this.name = name;
        this.price=price;
    }
    
    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果");
    }
    public String toString(){
    	return "叫做 " + name + " 的物品，其价格是 " + price;
    }
    public boolean equals(Object o) {
        if (o instanceof Item) {
            Item i = (Item) o;
            if (i.price == this.price)
                return true;
            else
                return false;
            //return i.price==this.price;
        }
        return false;
    }
    //public abstract boolean disposable();
    public boolean disposable() {
    	return false;
    }
    public static void main(String[] args) {
        /*//血瓶Potion
        Item potion = new Item();
        potion.name = "血瓶";
        potion.price = 50;
        //草鞋sandals
        Item sandals = new Item();
        sandals.name = "草鞋";
        sandals.price = 300;
        //长剑sword
        Item sword = new Item();
        sword.name = "长剑";
        sword.price = 350;
        System.out.println("物品名称:"+potion.name+",物品价格:"+potion.price);
        System.out.println("物品名称:"+sandals.name+",物品价格:"+sandals.price);
        System.out.println("物品名称:"+sword.name+",物品价格:"+sword.price);*/
    	
    	/*Item i1= new LifePotion();
        Item i2 = new MagicPotion();
        System.out.print("i1  是Item类型，执行effect打印:");
        i1.effect();
        System.out.print("i2也是Item类型，执行effect打印:");
        i2.effect();
        System.out.println(i1.equals(i2));*/
    	
    	/*Item item=new Item() {
    		@Override
    		public boolean disposable() {
    			return false;
    		}
    	};
    	System.out.println(item.disposable());*/
    	Random r = new Random();
        List<Item> items = new ArrayList<Item>();
        for (int i = 0; i < 10; i++) {
            items.add(new Item("item " + i, r.nextInt(1000)));
        }
 
        System.out.println("初始化集合后的数据 (最后一个数据重复)：");
        System.out.println(items);
         
        //传统方式
        /*Collections.sort(heros,new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return (int) (o2.hp-o1.hp);
            }
        });*/
         
        Item it = items.get(2);
        System.out.println("通过传统方式找出来的price第三高的物品名称是:" + it.name);
         
        //聚合方式
        String name =items
            .stream()
            .sorted((it1,it2)->it1.price>it2.price?-1:1)
            .skip(2)
            .map(h->h.name)
            .findFirst()
            .get();
 
        System.out.println("通过聚合操作找出来的price第三高的物品名称是:" + name);
    }
	@Override
	public int compareTo(Item o) {
		if(price>o.price)
            return 1; 
        else
            return -1;
	}
}