package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Item.Item;
import lol.ADHero;
import lol.Hero;

public class TestCollection {
	@SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        /*//������ArrayList�����ڴ�Ŷ���
        ArrayList<ADHero> heros = new ArrayList<ADHero>();
        heros.add( new ADHero("����"));
        System.out.println(heros.size());
         
        //����������"capacity"�����Ŷ�������ӣ��Զ�����
        //ֻ��Ҫ����������������Ӣ�ۼ��ɣ����õ��Ļ��������ı߽����⡣
        heros.add( new ADHero("��Ī"));
        System.out.println(heros.size());  
    }*/
	/*ArrayList<ADHero> heros = new ArrayList<ADHero>();
    // ��5��������뵽ArrayList��
    for (int i = 0; i < 5; i++) {
        heros.add(new ADHero("hero " + i,50));
    }
    System.out.println(heros);

    // ��ָ��λ�����Ӷ���
    ADHero specialHero = new ADHero("special hero");
    heros.add(3, specialHero);
    System.out.println(heros.toString());
    
    System.out.print("��Ȼһ���µĶ�������Ҳ�� hero 1������contains�ķ�����:");
    System.out.println(heros.contains(new ADHero("hero 5",10)));
    System.out.println(heros.toString());
    System.out.print("����specialHero���жϣ�contains�ķ�����:");
    System.out.println(heros.contains(specialHero));
    System.out.println(heros.get(5));
    System.out.println("specialHero������λ��:"+heros.indexOf(specialHero));
    heros.remove(2);
    System.out.println("ɾ���±���2�Ķ���");
    System.out.println(heros);
    System.out.println("ɾ��special hero");
    heros.remove(specialHero);
    System.out.println(heros);
    heros.remove(new ADHero("hero 4",50));
    System.out.println(heros);
    System.out.println("���±���5��Ԫ�أ��滻Ϊ\"hero 5\"");
    heros.set(2, new ADHero("hero 5"));
    System.out.println(heros);
    ADHero hs[] = (ADHero[])heros.toArray(new ADHero[]{});
    System.out.println("����:" +hs);
    
    ArrayList<ADHero> anotherHeros = new ArrayList<ADHero>();
    anotherHeros.add(new ADHero("hero a"));
    anotherHeros.add(new ADHero("hero b"));
    anotherHeros.add(new ADHero("hero c"));
    System.out.println("anotherHeros heros:\t" + anotherHeros);
    heros.addAll(anotherHeros);
    System.out.println("����һ��ArrayList��Ԫ�ض����뵽��ǰArrayList:");
    System.out.println("ArrayList heros:\t" + heros);
    System.out.println("ʹ��clear���");
    heros.clear();
    System.out.println("ArrayList heros:\t" + heros);*/
		
	/*List<ADHero> heros = new ArrayList<ADHero>();
    heros.add( new ADHero("����"));
    System.out.println(heros.size());*/
		
	/*//���ڲ�ʹ�÷��͵������������������Ӣ�ۣ�Ҳ�������������Ʒ
    List heros = new ArrayList();
    heros.add(new ADHero("����"));
    //�������ڴ��Ӣ�۵�����������Ҳ���Դ����Ʒ��
    heros.add(new Item("����"));
    
  //���뷺��Generic
    //����������ʱ�򣬾�ָ��������������ֻ�ܷ�Hero���������ľͻ����
    List<Hero> genericheros = new ArrayList<Hero>();
    genericheros.add(new ADHero("����"));
    //�������Hero���ͣ������ͷŲ���ȥ
    //genericheros.add(new Item("����"));
    Hero h = genericheros.get(0);
    System.out.println(h);
    List<Hero> genericheros1 = new ArrayList<Hero>();
    List<Hero> genericheros2 = new ArrayList<>();*/
		
		/*List<Hero> heros = new ArrayList<Hero>();
        
        //��5��Hero��������
        for (int i = 0; i < 5; i++) {
            heros.add(new ADHero("hero name " +i));
        }
         
        //�ڶ��ֱ�����ʹ�õ�����
        System.out.println("--------ʹ��while��iterator-------");
        Iterator<Hero> it= heros.iterator();
        //���ʼ��λ���ж�"��һ��"λ���Ƿ�������
        //����о�ͨ��nextȡ���������Ұ�ָ�������ƶ�
        //ֱ��"��һ��"λ��û������
        while(it.hasNext()){
            Hero h = it.next();
            System.out.println(h);
        }
        //��������forд��
        System.out.println("--------ʹ��for��iterator-------");
        for (Iterator<Hero> iterator = heros.iterator(); iterator.hasNext();) {
            Hero hero = (Hero) iterator.next();
            System.out.println(hero);
        }
     // �����֣���ǿ��forѭ��
        System.out.println("--------��ǿ��forѭ��-------");
        for (Hero h : heros) {
            System.out.println(h);
        }*/
	List<Hero> heros=new ArrayList<Hero>();
	for (int i = 0; i < 100; i++) {
        heros.add(new ADHero("hero name " +i));
    }
	for(int i=1;i<(int)(100/8);i++) {
		heros.remove(i*8);
	}
	System.out.println(heros);
}
}
