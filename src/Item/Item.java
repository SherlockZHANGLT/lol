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
        System.out.println("����");
    }
    public void effect() {
        System.out.println("��Ʒʹ�ú󣬿�����Ч��");
    }
    public String toString(){
    	return "���� " + name + " ����Ʒ����۸��� " + price;
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
        /*//ѪƿPotion
        Item potion = new Item();
        potion.name = "Ѫƿ";
        potion.price = 50;
        //��Ьsandals
        Item sandals = new Item();
        sandals.name = "��Ь";
        sandals.price = 300;
        //����sword
        Item sword = new Item();
        sword.name = "����";
        sword.price = 350;
        System.out.println("��Ʒ����:"+potion.name+",��Ʒ�۸�:"+potion.price);
        System.out.println("��Ʒ����:"+sandals.name+",��Ʒ�۸�:"+sandals.price);
        System.out.println("��Ʒ����:"+sword.name+",��Ʒ�۸�:"+sword.price);*/
    	
    	/*Item i1= new LifePotion();
        Item i2 = new MagicPotion();
        System.out.print("i1  ��Item���ͣ�ִ��effect��ӡ:");
        i1.effect();
        System.out.print("i2Ҳ��Item���ͣ�ִ��effect��ӡ:");
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
 
        System.out.println("��ʼ�����Ϻ������ (���һ�������ظ�)��");
        System.out.println(items);
         
        //��ͳ��ʽ
        /*Collections.sort(heros,new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return (int) (o2.hp-o1.hp);
            }
        });*/
         
        Item it = items.get(2);
        System.out.println("ͨ����ͳ��ʽ�ҳ�����price�����ߵ���Ʒ������:" + it.name);
         
        //�ۺϷ�ʽ
        String name =items
            .stream()
            .sorted((it1,it2)->it1.price>it2.price?-1:1)
            .skip(2)
            .map(h->h.name)
            .findFirst()
            .get();
 
        System.out.println("ͨ���ۺϲ����ҳ�����price�����ߵ���Ʒ������:" + name);
    }
	@Override
	public int compareTo(Item o) {
		if(price>o.price)
            return 1; 
        else
            return -1;
	}
}