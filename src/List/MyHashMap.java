package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import lol.ADHero;

public class MyHashMap implements IHashMap{
	// 长度是2000的对象数组
    @SuppressWarnings("unchecked")
    LinkedList<Entry>[] Olist = new LinkedList[2000];
     
    public void put(String key, Object object) {
        // TODO 自动生成的方法存根
        int hashcode = TestCollection2.hashcode(key);
        if (Olist[hashcode] == null) {
            // 在作用域中，没有任何Entry的外层实例可访问   Entry.super;
            Entry e = new Entry(key, object);
            Olist[hashcode] = new LinkedList<Entry>();
            Olist[hashcode].add(e);
        }   
        else {
            Entry e = new Entry(key, object);
            Olist[hashcode].addLast(e);
        }
    }
 
    public Object get(String key) {
        // TODO 自动生成的方法存根
        int hashcode = TestCollection2.hashcode(key);
        Object v = null; 
        if (Olist[hashcode] == null) {
            // 在作用域中，没有任何Entry的外层实例可访问   Entry.super;
            return null;
        }   
        else {
            for (Entry o : Olist[hashcode]) {
                if(o.key.equals(key)) {
                    v = o.value;
                    break;
                }
                else
                    return null;
            }
            return v;
        }
    } 
    public static void main(String args[]) {
    	/*MyHashMap mhm=new MyHashMap();
    	mhm.put("haha", "hahahaha");
    	System.out.print(mhm.get("haha"));*/
    	List<ADHero> lst1=new ArrayList<ADHero>();
    	List<String> lst2=new ArrayList<String>();
    	for (int i = 0; i <10000000; i++) {
            int j = (int) (Math.random()*9000+1000);
                lst1.add(new ADHero("hero-" + j));
    }
    	long start=System.currentTimeMillis();
    	for (ADHero ad:lst1) {
            if(ad.getName()=="hero-5555")
            	break;
    }
    	long end=System.currentTimeMillis();
    	System.out.printf("for用时%d%n",end-start);
    	MyHashMap mhm=new MyHashMap();
    	start=System.currentTimeMillis();
    	for (ADHero ad:lst1) {
            mhm.put(ad.getName(), ad);
    }
    	end=System.currentTimeMillis();
    	System.out.printf("MyHash用时%d%n",end-start);
    }

}
