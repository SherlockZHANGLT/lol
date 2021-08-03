package Lamba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import lol.ADHero;

public class TestLambda {
	
	public static boolean testHero(ADHero h) {
        return h.hp>100 && h.armor<50;
    }
	public boolean testHero1(ADHero h) {
        return h.hp>100 && h.armor<50;
    }
	/*public static void main(String[] args) {
        Random r = new Random();
        List<ADHero> heros = new ArrayList<ADHero>();
        for (int i = 0; i < 10; i++) {
            heros.add(new ADHero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("��ʼ����ļ��ϣ�");
        System.out.println(heros);
        /*System.out.println("ɸѡ�� hp>100 && damange<50��Ӣ��");
        filter(heros);
        
        HeroChecker checker = new HeroChecker() {
            @Override
            public boolean test(ADHero h) {
                return (h.hp>100 && h.armor<50);
            }
        };  
        //filter(heros,checker);
        
        /*System.out.println("ʹ��Lamdba�ķ�ʽ��ɸѡ�� hp>100 && damange<50��Ӣ��");
        filter(heros,h->h.hp>100 && h.armor<50);
        
        System.out.println("ʹ�����������");
        filter(heros, checker);
        System.out.println("ʹ��Lambda���ʽ");
        filter(heros, h->h.hp>100 && h.armor<50);
        System.out.println("��Lambda���ʽ��ʹ�þ�̬����");
        filter(heros, h -> TestLambda.testHero(h) );
        System.out.println("ֱ�����þ�̬����");
        filter(heros, TestLambda::testHero);
        System.out.println("ʹ�����ö��󷽷�  �Ĺ��˽����");
        //ʹ����Ķ��󷽷�
        TestLambda testLambda = new TestLambda();
        filter(heros, testLambda::testHero1);
        
        System.out.println("Lambda���ʽ�е��������еĶ����matched������");       
        filter(heros,h-> h.matched() );
  
        System.out.println("���������ж���ķ��� ֮���˽����");       
        filter(heros, ADHero::matched);
    }
  
    /*private static void filter(List<ADHero> heros) {
        for (ADHero hero : heros) {
            if(hero.hp>100 && hero.armor<50)
                System.out.println(hero);
        }
    }*/
	public static void main(String[] args) {
	    Supplier<List> s = new Supplier<List>() {
	        public List get() {
	            return new ArrayList();
	        }
	    };
	 
	    //������
	    List list1 = getList(s);
	    //Lambda���ʽ
	    List list2 = getList(()->new ArrayList());
	    //���ù�����
	    List list3 = getList(ArrayList::new);
	    }
	    public static List getList(Supplier<List> s){
	        return s.get();
	    }
	    
	private static void filter(List<ADHero> heros,HeroChecker checker) {
        for (ADHero hero : heros) {
            if(checker.test(hero))
                System.out.println(hero);
        }
    }

}
