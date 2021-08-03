package List;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import lol.ADHero;
import lol.Hero;
 
public class TestCollection2 {
	
	public static  String rantoChar(){
        String s = "";
        char c = 0;
        for (int j = 0; j < 2; j++) {
            int i = (int)(Math.random()*(2 + 1));
            switch(i) {
                case 0:
                    c = (char)(Math.random()*('9' - '0' + 1) + '0');  
                    break;
                case 1:
                    c = (char)(Math.random()*('z' - 'a' + 1) + 'a');  
                    break;
                case 2:
                    c = (char)(Math.random()*('Z' - 'A' + 1) + 'A');  
                    break;
            }
            s += c;
        }
        return s;   
    }
 
    public static void main(String[] args) {
        /*//LinkedList是一个双向链表结构的list
        LinkedList<Hero> ll =new LinkedList<Hero>();
        //所以可以很方便的在头部和尾部插入数据
        //在最后插入新的英雄
        ll.addLast(new ADHero("hero1"));
        ll.addLast(new ADHero("hero2"));
        ll.addLast(new ADHero("hero3"));
        System.out.println(ll);
        //在最前面插入新的英雄
        ll.addFirst(new ADHero("heroX"));
        System.out.println(ll);
        //查看最前面的英雄
        System.out.println(ll.getFirst());
        //查看最后面的英雄
        System.out.println(ll.getLast());
        //查看不会导致英雄被删除
        System.out.println(ll);
        //取出最前面的英雄
        System.out.println(ll.removeFirst());
        //取出最后面的英雄
        System.out.println(ll.removeLast());
        //取出会导致英雄被删除
        System.out.println(ll);*/
         
    	//和ArrayList一样，LinkedList也实现了List接口
        /*List ll =new LinkedList<Hero>();
        //所不同的是LinkedList还实现了Deque，进而又实现了Queue这个接口
        //Queue代表FIFO 先进先出的队列
        Queue<Hero> q= new LinkedList<Hero>();
        //加在队列的最后面
        System.out.print("初始化队列：\t");
        q.offer(new ADHero("Hero1"));
        q.offer(new ADHero("Hero2"));
        q.offer(new ADHero("Hero3"));
        q.offer(new ADHero("Hero4"));
        System.out.println(q);
        System.out.print("把第一个元素取poll()出来:\t");
        //取出第一个Hero，FIFO 先进先出
        Hero h = q.poll();
        System.out.println(h);
        System.out.print("取出第一个元素之后的队列:\t");
        System.out.println(q); 
        //把第一个拿出来看一看，但是不取出来
        h=q.peek();
        System.out.print("查看peek()第一个元素:\t");
        System.out.println(h);
        System.out.print("查看并不会导致第一个元素被取出来:\t");
        System.out.println(q);*/
    	
    	/*HashMap<String,String> dictionary = new HashMap<>();
        dictionary.put("adc", "物理英雄");
        dictionary.put("apc", "魔法英雄");
        dictionary.put("t", "坦克");
         
        System.out.println(dictionary.get("t"));*/
    	
    	/*HashMap<String,Hero> heroMap = new HashMap<String,Hero>();
        heroMap.put("gareen", new ADHero("gareen1"));
        System.out.println(heroMap);
        //key为gareen已经有value了，再以gareen作为key放入数据，会导致原英雄，被覆盖
        //不会增加新的元素到Map中
        heroMap.put("gareen", new ADHero("gareen2"));
        System.out.println(heroMap);
        //清空map
        heroMap.clear();
        Hero gareen = new ADHero("gareen");
        //同一个对象可以作为值插入到map中，只要对应的key不一样
        heroMap.put("hero1", gareen);
        heroMap.put("hero2", gareen);
        System.out.println(heroMap);*/
    	//ArrayList<ADHero> ad=new ArrayList<ADHero>();
    	
    	/*for (int i = 0; i <30000; i++) {
            Integer num = (int)Math.round(Math.random() * 10000);
            ad.add(new ADHero("hero-"+num.toString()));//?
        } 
    	System.out.println(ad);
    	ADHero adc=new ADHero("hero-5555");
    	
    	long start = System.currentTimeMillis();
    	// 1.for循环查找
    	int i=0;
    	for (Hero h: ad) {
    	        if (h.equals(adc))
    	            i++;
    	}
    	System.out.println(i);
    	long end = System.currentTimeMillis();
        System.out.printf("for循环查找总共耗时 %d 毫秒 %n", end - start);
        
    	// 2. HashMap通过for循环，寻找  . HashMap暂时没有这个找相同值对应键的方法
        HashMap<String,List<Hero>> heroMap = new HashMap<String, List<Hero>>();
        for(ADHero h:ad){
            List<Hero> list = heroMap.get(h.getName());
            if(null==list){
                list = new ArrayList<>();
            }
            list.add(h);
            heroMap.put(h.getName(),list);
        }

        long start1 = System.currentTimeMillis();
        List<Hero> result = heroMap.get("hero-5555");
        long end1 = System.currentTimeMillis();
        System.out.printf("一共找到%d个英雄，耗时：%d毫秒",result.size(),(end1-start1));*/
    	
    	/*HashSet<String> names = new HashSet<String>();
        names.add("gareen");
        System.out.println(names);
        //第二次插入同样的数据，是插不进去的，容器中只会保留一个
        names.add("gareen");
        System.out.println(names);
        
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        // Set中的元素排列，不是按照插入顺序
        System.out.println(numbers);
        
        HashSet<Integer> numbers1 = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            numbers1.add(i);
        } 
        //Set不提供get方法来获取指定位置的元素
        //numbers.get(0)
        //遍历Set可以采用迭代器iterator
        for (Iterator<Integer> iterator = numbers1.iterator(); iterator.hasNext();) {
            Integer i = (Integer) iterator.next();
            System.out.println(i);
        }
        //或者采用增强型for循环
        for (Integer i : numbers1) {
            System.out.println(i);
        }*/
    	
    	/*String[] cs = new String[100];
        HashSet<String> strs = new HashSet<String>();
        HashSet<String> RepeStrs = new HashSet<String>();
         
        int c = 0; 
        for(int i = 0; i < 100; i++) {
            String s = rantoChar();
            cs[i] = s;
            if (strs.contains(s)) {
                c++;
                RepeStrs.add(s);
            }
            else
            	strs.add(s);
        }
        if (c == 0)
            System.out.println("没有重复的字符串");
        else {
            System.out.printf("总共有%d种重复的字符串\n", +c);
            System.out.println("分别是:");
            int j = 0;
            for(String ss : RepeStrs) {
                System.out.print(ss + " ");
                if(RepeStrs.size() > 20) {
                    if (j % 20 == 19)
                        System.out.println();
                }
                j++;
            }
    }*/
    	
    	/*HashSet<Integer> numberSet1 =new HashSet<Integer>();
        //HashSet中的数据不是按照插入顺序存放
        numberSet1.add(88);
        numberSet1.add(8);
        numberSet1.add(888);
        System.out.println(numberSet1);
          
        LinkedHashSet<Integer> numberSet2 =new LinkedHashSet<Integer>();
        //LinkedHashSet中的数据是按照插入顺序存放
        numberSet2.add(88);
        numberSet2.add(8);
        numberSet2.add(888);
        System.out.println(numberSet2);
        
        TreeSet<Integer> numberSet3 =new TreeSet<Integer>();
        //TreeSet 中的数据是进行了排序的
        numberSet3.add(88);
        numberSet3.add(8);
        numberSet3.add(888); 
        System.out.println(numberSet3);*/
    	
    	/*int i=0;
    	LinkedHashSet<Integer> num=new LinkedHashSet<Integer>();
    	while(i!=1000) {
    		num.add ((int)(Math.PI*Math.pow(10,i))%10);
    		//System.out.println(((int)(Math.PI*Math.pow(10,i)))%10);
    		i++;
    	}
    	//System.out.print((int)(Math.PI*Math.pow(10,3))%10);
    	System.out.println(num.size());
    	System.out.print(num);*/
    	
    	/*List<ADHero> heros=new ArrayList<ADHero>();
    	for(int i=0;i<2000000;i++){
    		ADHero ad=new ADHero("Hero "+i);
    		heros.add(ad);
    	}
    	Collections.shuffle(heros);
    	String target="Hero 10000";
    	long start=System.currentTimeMillis();
    	for(ADHero h:heros) {
    		if(h.getName().equals(target))
    			System.out.print("find it!");
    	}
    	long end=System.currentTimeMillis();
    	System.out.printf("用时%d毫秒", end-start);
    	
    	HashMap<String,ADHero> heroMap = new HashMap<String,ADHero>();
        for (int j = 0; j < 2000000; j++) {
            ADHero h = new ADHero("Hero " + j);
            heroMap.put(h.getName(), h);
        }
        System.out.println("数据准备完成");
        for (int i = 0; i < 10; i++) {
            start = System.currentTimeMillis(); 
            //查找名字是Hero 1000000的对象
            ADHero tar = heroMap.get("Hero 1000000");
            System.out.println("找到了 hero!" + tar.getName());
            end = System.currentTimeMillis();
            long elapsed = end - start;
            System.out.println("一共花了：" + elapsed + " 毫秒");
        }*/
    	
    	/*for(int i=0;i<100;i++) {
    		String str=rantoString();
    		int su=hashcode(str);
    		System.out.printf(su + "\t");
    	}*/
    	Random r =new Random();
        List<Heroing> heros = new ArrayList<Heroing>();
            
        for (int i = 0; i < 10; i++) {
            //通过随机值实例化hero的hp和damage
            heros.add(new Heroing("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
            
        //直接调用sort会出现编译错误，因为Hero有各种属性
        //到底按照哪种属性进行比较，Collections也不知道，不确定，所以没法排
        //Collections.sort(heros);
            
        //引入Comparator，指定比较的算法
        /*Comparator<Heroing> c = new Comparator<Heroing>() {
            @Override
            public int compare(Heroing h1, Heroing h2) {
                //按照hp进行排序
                if(h1.hp>=h2.hp)
                    return 1;  //正数表示h1比h2要大
                else
                    return -1;
            }
        };*/
        //Collections.sort(heros,c);
        Collections.sort(heros);
        System.out.println("按照血量排序后的集合：");
        System.out.println(heros);
    }  
    public static String rantoString() {
    	String s="";
    	char c=0;
    	int m=(int)(Math.random()*8+2);
    	for(int i=0;i<m;i++) {
    		c=(char)(Math.random()*(126 - 33 + 1) + 33);
    		s+=c;
    	}
    	return s;
    }
    public static int hashcode(String str) {
        char[] s = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < s.length; i++)
            sum += s[i];
        sum = sum*32;
        if (sum > 1999)
            sum = sum%2000;
        else if (sum < 0)
            sum = Math.abs(sum);
        return sum;
    }
}
