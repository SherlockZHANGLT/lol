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
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        /*System.out.println("筛选出 hp>100 && damange<50的英雄");
        filter(heros);
        
        HeroChecker checker = new HeroChecker() {
            @Override
            public boolean test(ADHero h) {
                return (h.hp>100 && h.armor<50);
            }
        };  
        //filter(heros,checker);
        
        /*System.out.println("使用Lamdba的方式，筛选出 hp>100 && damange<50的英雄");
        filter(heros,h->h.hp>100 && h.armor<50);
        
        System.out.println("使用匿名类过滤");
        filter(heros, checker);
        System.out.println("使用Lambda表达式");
        filter(heros, h->h.hp>100 && h.armor<50);
        System.out.println("在Lambda表达式中使用静态方法");
        filter(heros, h -> TestLambda.testHero(h) );
        System.out.println("直接引用静态方法");
        filter(heros, TestLambda::testHero);
        System.out.println("使用引用对象方法  的过滤结果：");
        //使用类的对象方法
        TestLambda testLambda = new TestLambda();
        filter(heros, testLambda::testHero1);
        
        System.out.println("Lambda表达式中调用容器中的对象的matched方法：");       
        filter(heros,h-> h.matched() );
  
        System.out.println("引用容器中对象的方法 之过滤结果：");       
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
	 
	    //匿名类
	    List list1 = getList(s);
	    //Lambda表达式
	    List list2 = getList(()->new ArrayList());
	    //引用构造器
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
