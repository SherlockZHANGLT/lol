package List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
 
public class VS {
	//ArrayList VS LinkedList
    //public static void main(String[] args) {
        //List<Integer> l;
        
        /*l = new ArrayList<>();
        insertFirst(l, "ArrayList");
        l = new LinkedList<>();
        insertFirst(l, "LinkedList");
        
        l = new ArrayList<>();
        modify(l, "ArrayList");
        l = new LinkedList<>();
        modify(l, "LinkedList");*/
        
        /*l = new ArrayList<>();
        insertLast(l, "ArrayList");
        l = new LinkedList<>();
        insertLast(l, "LinkedList");*/
        
        /*l = new ArrayList<>();
        insertMid(l, "ArrayList");
        l = new LinkedList<>();
        insertMid(l, "LinkedList");*/
        
        /*HashSet<Integer> hs = new HashSet<>();
        while (hs.size()<50)
            hs.add((int) (Math.random()*9999));
        System.out.println(hs);*/
        
        /*HashMap<String,String> hashMap = new HashMap<String,String>();
        
        //HashMap������null��key,��value
        hashMap.put(null, "123");
        hashMap.put("123", null);
         
        Hashtable<String,String> hashtable = new Hashtable<String,String>();
        //Hashtable������null��key��������null��value
        hashtable.put(null, "123");
        hashtable.put("123", null);
 
    }*/
 
    /*private static void insertFirst(List<Integer> l, String type) {
        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            l.add(0, number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("��%s ��ǰ�����%d�����ݣ��ܹ���ʱ %d ���� %n", type, total, end - start);
    }
    
    private static void modify(List<Integer> l, String type) {
        int total = 100 * 1000;
        int index = total/2;
        final int number = 5;
        //��ʼ��
        for (int i = 0; i < total; i++) {
            l.add(number);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
             int n = l.get(index);
             n++;
             l.set(index, n);
        }
        long end = System.currentTimeMillis();
        System.out.printf("%s�ܳ�����%d����λ����%d�����ݣ�ȡ��������1���ٷŻ�ȥ%n �ظ�%d�飬�ܹ���ʱ %d ���� %n", type,total, index,total, end - start);
        System.out.println();
    }
    
    private static void insertLast(List<Integer> l, String type) {
        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            l.add(l.size(), number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("��%s ��������%d�����ݣ��ܹ���ʱ %d ���� %n", type, total, end - start);
    }
    
    private static void insertMid(List<Integer> l, String type) {
        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            l.add((int)(l.size()/2), number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("��%s �м������%d�����ݣ��ܹ���ʱ %d ���� %n", type, total, end - start);
    }*/
	public void reverseHashmap(HashMap<String,String> hashMap) {
	    String[] keys = new String[hashMap.size()];
	    String[] values = new String[hashMap.size()];
	    int i = 0;
	    for(String k : hashMap.keySet()) {
	        String value = hashMap.get(k);
	        keys[i] =  k;
	        values[i] =value;
	        i++;
	    }
	    hashMap.clear();
	    for(int j = 0; j < keys.length; j++) {
	        hashMap.put(values[j], keys[j]);
	    }
	}
	public static void main(String[] args) {
	    // HashMap��Hashtable��ʵ����Map�ӿڣ����Ǽ�ֵ�Ա������ݵķ�ʽ
	    HashMap<String,String> hashMap = new HashMap<String,String>();
	    // HashMap������null��key,��value
	    hashMap.put("adc", "����Ӣ��");
	    hashMap.put("apc", "ħ��Ӣ��");
	    hashMap.put("t", "̹��");
	    hashMap.put("zc", "���");
	     
	    VS t = new VS();
	    System.out.println(hashMap);
	    t.reverseHashmap(hashMap);
	    System.out.println(hashMap);
	}
	
}