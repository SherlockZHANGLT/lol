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
        /*//LinkedList��һ��˫������ṹ��list
        LinkedList<Hero> ll =new LinkedList<Hero>();
        //���Կ��Ժܷ������ͷ����β����������
        //���������µ�Ӣ��
        ll.addLast(new ADHero("hero1"));
        ll.addLast(new ADHero("hero2"));
        ll.addLast(new ADHero("hero3"));
        System.out.println(ll);
        //����ǰ������µ�Ӣ��
        ll.addFirst(new ADHero("heroX"));
        System.out.println(ll);
        //�鿴��ǰ���Ӣ��
        System.out.println(ll.getFirst());
        //�鿴������Ӣ��
        System.out.println(ll.getLast());
        //�鿴���ᵼ��Ӣ�۱�ɾ��
        System.out.println(ll);
        //ȡ����ǰ���Ӣ��
        System.out.println(ll.removeFirst());
        //ȡ��������Ӣ��
        System.out.println(ll.removeLast());
        //ȡ���ᵼ��Ӣ�۱�ɾ��
        System.out.println(ll);*/
         
    	//��ArrayListһ����LinkedListҲʵ����List�ӿ�
        /*List ll =new LinkedList<Hero>();
        //����ͬ����LinkedList��ʵ����Deque��������ʵ����Queue����ӿ�
        //Queue����FIFO �Ƚ��ȳ��Ķ���
        Queue<Hero> q= new LinkedList<Hero>();
        //���ڶ��е������
        System.out.print("��ʼ�����У�\t");
        q.offer(new ADHero("Hero1"));
        q.offer(new ADHero("Hero2"));
        q.offer(new ADHero("Hero3"));
        q.offer(new ADHero("Hero4"));
        System.out.println(q);
        System.out.print("�ѵ�һ��Ԫ��ȡpoll()����:\t");
        //ȡ����һ��Hero��FIFO �Ƚ��ȳ�
        Hero h = q.poll();
        System.out.println(h);
        System.out.print("ȡ����һ��Ԫ��֮��Ķ���:\t");
        System.out.println(q); 
        //�ѵ�һ���ó�����һ�������ǲ�ȡ����
        h=q.peek();
        System.out.print("�鿴peek()��һ��Ԫ��:\t");
        System.out.println(h);
        System.out.print("�鿴�����ᵼ�µ�һ��Ԫ�ر�ȡ����:\t");
        System.out.println(q);*/
    	
    	/*HashMap<String,String> dictionary = new HashMap<>();
        dictionary.put("adc", "����Ӣ��");
        dictionary.put("apc", "ħ��Ӣ��");
        dictionary.put("t", "̹��");
         
        System.out.println(dictionary.get("t"));*/
    	
    	/*HashMap<String,Hero> heroMap = new HashMap<String,Hero>();
        heroMap.put("gareen", new ADHero("gareen1"));
        System.out.println(heroMap);
        //keyΪgareen�Ѿ���value�ˣ�����gareen��Ϊkey�������ݣ��ᵼ��ԭӢ�ۣ�������
        //���������µ�Ԫ�ص�Map��
        heroMap.put("gareen", new ADHero("gareen2"));
        System.out.println(heroMap);
        //���map
        heroMap.clear();
        Hero gareen = new ADHero("gareen");
        //ͬһ�����������Ϊֵ���뵽map�У�ֻҪ��Ӧ��key��һ��
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
    	// 1.forѭ������
    	int i=0;
    	for (Hero h: ad) {
    	        if (h.equals(adc))
    	            i++;
    	}
    	System.out.println(i);
    	long end = System.currentTimeMillis();
        System.out.printf("forѭ�������ܹ���ʱ %d ���� %n", end - start);
        
    	// 2. HashMapͨ��forѭ����Ѱ��  . HashMap��ʱû���������ֵͬ��Ӧ���ķ���
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
        System.out.printf("һ���ҵ�%d��Ӣ�ۣ���ʱ��%d����",result.size(),(end1-start1));*/
    	
    	/*HashSet<String> names = new HashSet<String>();
        names.add("gareen");
        System.out.println(names);
        //�ڶ��β���ͬ�������ݣ��ǲ岻��ȥ�ģ�������ֻ�ᱣ��һ��
        names.add("gareen");
        System.out.println(names);
        
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        // Set�е�Ԫ�����У����ǰ��ղ���˳��
        System.out.println(numbers);
        
        HashSet<Integer> numbers1 = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            numbers1.add(i);
        } 
        //Set���ṩget��������ȡָ��λ�õ�Ԫ��
        //numbers.get(0)
        //����Set���Բ��õ�����iterator
        for (Iterator<Integer> iterator = numbers1.iterator(); iterator.hasNext();) {
            Integer i = (Integer) iterator.next();
            System.out.println(i);
        }
        //���߲�����ǿ��forѭ��
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
            System.out.println("û���ظ����ַ���");
        else {
            System.out.printf("�ܹ���%d���ظ����ַ���\n", +c);
            System.out.println("�ֱ���:");
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
        //HashSet�е����ݲ��ǰ��ղ���˳����
        numberSet1.add(88);
        numberSet1.add(8);
        numberSet1.add(888);
        System.out.println(numberSet1);
          
        LinkedHashSet<Integer> numberSet2 =new LinkedHashSet<Integer>();
        //LinkedHashSet�е������ǰ��ղ���˳����
        numberSet2.add(88);
        numberSet2.add(8);
        numberSet2.add(888);
        System.out.println(numberSet2);
        
        TreeSet<Integer> numberSet3 =new TreeSet<Integer>();
        //TreeSet �е������ǽ����������
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
    	System.out.printf("��ʱ%d����", end-start);
    	
    	HashMap<String,ADHero> heroMap = new HashMap<String,ADHero>();
        for (int j = 0; j < 2000000; j++) {
            ADHero h = new ADHero("Hero " + j);
            heroMap.put(h.getName(), h);
        }
        System.out.println("����׼�����");
        for (int i = 0; i < 10; i++) {
            start = System.currentTimeMillis(); 
            //����������Hero 1000000�Ķ���
            ADHero tar = heroMap.get("Hero 1000000");
            System.out.println("�ҵ��� hero!" + tar.getName());
            end = System.currentTimeMillis();
            long elapsed = end - start;
            System.out.println("һ�����ˣ�" + elapsed + " ����");
        }*/
    	
    	/*for(int i=0;i<100;i++) {
    		String str=rantoString();
    		int su=hashcode(str);
    		System.out.printf(su + "\t");
    	}*/
    	Random r =new Random();
        List<Heroing> heros = new ArrayList<Heroing>();
            
        for (int i = 0; i < 10; i++) {
            //ͨ�����ֵʵ����hero��hp��damage
            heros.add(new Heroing("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println("��ʼ����ļ��ϣ�");
        System.out.println(heros);
            
        //ֱ�ӵ���sort����ֱ��������ΪHero�и�������
        //���װ����������Խ��бȽϣ�CollectionsҲ��֪������ȷ��������û����
        //Collections.sort(heros);
            
        //����Comparator��ָ���Ƚϵ��㷨
        /*Comparator<Heroing> c = new Comparator<Heroing>() {
            @Override
            public int compare(Heroing h1, Heroing h2) {
                //����hp��������
                if(h1.hp>=h2.hp)
                    return 1;  //������ʾh1��h2Ҫ��
                else
                    return -1;
            }
        };*/
        //Collections.sort(heros,c);
        Collections.sort(heros);
        System.out.println("����Ѫ�������ļ��ϣ�");
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
