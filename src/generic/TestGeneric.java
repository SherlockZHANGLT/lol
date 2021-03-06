package generic;

import java.util.ArrayList;

import lol.ADAPHero;
import lol.ADHero;
import lol.APHero;
import lol.Hero;

public class TestGeneric {
	
	public static void iterate(ArrayList<? extends Hero> list) {
        for (Hero hero : list) {
            System.out.println(hero.name);
        }
    }
	
	public static void main(String[] args) {
        
        /*ArrayList<APHero> apHeroList = new ArrayList<APHero>();
        apHeroList.add(new APHero()); 
        ArrayList<? extends Hero> heroList = apHeroList;
        //? extends Hero 表示这是一个Hero泛型的子类泛型
        //heroList 的泛型可以是Hero
        //heroList 的泛型可以使APHero
        //heroList 的泛型可以使ADHero
        //可以确凿的是，从heroList取出来的对象，一定是可以转型成Hero的
        Hero h= heroList.get(0);
        System.out.print(h);
        //但是，不能往里面放东西
        //heroList.add(new ADHero()); //编译错误，因为heroList的泛型 有可能是APHero
        
        ArrayList<? super Hero> heroList1 = new ArrayList<Object>();
        //? super Hero 表示 heroList的泛型是Hero或者其父类泛型
        //heroList 的泛型可以是Hero
        //heroList 的泛型可以是Object
        //所以就可以插入Hero
        heroList1.add(new ADAPHero());
        //也可以插入Hero的子类
        heroList1.add(new APHero());
        heroList1.add(new ADHero());
        //但是，不能从里面取数据出来,因为其泛型可能是Object,而Object是强转Hero会失败
        //Hero h= heroList1.get(0);
        
        ArrayList<APHero> apHeroList1 = new ArrayList<APHero>();
        //?泛型通配符，表示任意泛型
        ArrayList<?> generalList = apHeroList1;
        //?的缺陷1： 既然?代表任意泛型，那么换句话说，你就不知道这个容器里面是什么类型
        //所以只能以Object的形式取出来
        Object o = generalList.get(0);
        //?的缺陷2： 既然?代表任意泛型，那么既有可能是Hero,也有可能是Item
        //所以，放哪种对象进去，都有风险，结果就什么什么类型的对象，都不能放进去
        //generalList.add(new Item()); //编译错误 因为?代表任意泛型，很有可能不是Item
        //generalList.add(new Hero()); //编译错误 因为?代表任意泛型，很有可能不是Hero
        //generalList.add(new APHero()); //编译错误  因为?代表任意泛型，很有可能不是APHero*/
		
		ArrayList<Hero> hs = new ArrayList<>();
        ArrayList<APHero> aphs = new ArrayList<>();
        ArrayList<ADHero> adhs = new ArrayList<>();
        
        iterate(hs);
        iterate(aphs);
        iterate(adhs);
    }
}
