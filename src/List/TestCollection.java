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
        /*//容器类ArrayList，用于存放对象
        ArrayList<ADHero> heros = new ArrayList<ADHero>();
        heros.add( new ADHero("盖伦"));
        System.out.println(heros.size());
         
        //容器的容量"capacity"会随着对象的增加，自动增长
        //只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。
        heros.add( new ADHero("提莫"));
        System.out.println(heros.size());  
    }*/
	/*ArrayList<ADHero> heros = new ArrayList<ADHero>();
    // 把5个对象加入到ArrayList中
    for (int i = 0; i < 5; i++) {
        heros.add(new ADHero("hero " + i,50));
    }
    System.out.println(heros);

    // 在指定位置增加对象
    ADHero specialHero = new ADHero("special hero");
    heros.add(3, specialHero);
    System.out.println(heros.toString());
    
    System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
    System.out.println(heros.contains(new ADHero("hero 5",10)));
    System.out.println(heros.toString());
    System.out.print("而对specialHero的判断，contains的返回是:");
    System.out.println(heros.contains(specialHero));
    System.out.println(heros.get(5));
    System.out.println("specialHero所处的位置:"+heros.indexOf(specialHero));
    heros.remove(2);
    System.out.println("删除下标是2的对象");
    System.out.println(heros);
    System.out.println("删除special hero");
    heros.remove(specialHero);
    System.out.println(heros);
    heros.remove(new ADHero("hero 4",50));
    System.out.println(heros);
    System.out.println("把下标是5的元素，替换为\"hero 5\"");
    heros.set(2, new ADHero("hero 5"));
    System.out.println(heros);
    ADHero hs[] = (ADHero[])heros.toArray(new ADHero[]{});
    System.out.println("数组:" +hs);
    
    ArrayList<ADHero> anotherHeros = new ArrayList<ADHero>();
    anotherHeros.add(new ADHero("hero a"));
    anotherHeros.add(new ADHero("hero b"));
    anotherHeros.add(new ADHero("hero c"));
    System.out.println("anotherHeros heros:\t" + anotherHeros);
    heros.addAll(anotherHeros);
    System.out.println("把另一个ArrayList的元素都加入到当前ArrayList:");
    System.out.println("ArrayList heros:\t" + heros);
    System.out.println("使用clear清空");
    heros.clear();
    System.out.println("ArrayList heros:\t" + heros);*/
		
	/*List<ADHero> heros = new ArrayList<ADHero>();
    heros.add( new ADHero("盖伦"));
    System.out.println(heros.size());*/
		
	/*//对于不使用泛型的容器，可以往里面放英雄，也可以往里面放物品
    List heros = new ArrayList();
    heros.add(new ADHero("盖伦"));
    //本来用于存放英雄的容器，现在也可以存放物品了
    heros.add(new Item("冰杖"));
    
  //引入泛型Generic
    //声明容器的时候，就指定了这种容器，只能放Hero，放其他的就会出错
    List<Hero> genericheros = new ArrayList<Hero>();
    genericheros.add(new ADHero("盖伦"));
    //如果不是Hero类型，根本就放不进去
    //genericheros.add(new Item("冰杖"));
    Hero h = genericheros.get(0);
    System.out.println(h);
    List<Hero> genericheros1 = new ArrayList<Hero>();
    List<Hero> genericheros2 = new ArrayList<>();*/
		
		/*List<Hero> heros = new ArrayList<Hero>();
        
        //放5个Hero进入容器
        for (int i = 0; i < 5; i++) {
            heros.add(new ADHero("hero name " +i));
        }
         
        //第二种遍历，使用迭代器
        System.out.println("--------使用while的iterator-------");
        Iterator<Hero> it= heros.iterator();
        //从最开始的位置判断"下一个"位置是否有数据
        //如果有就通过next取出来，并且把指针向下移动
        //直到"下一个"位置没有数据
        while(it.hasNext()){
            Hero h = it.next();
            System.out.println(h);
        }
        //迭代器的for写法
        System.out.println("--------使用for的iterator-------");
        for (Iterator<Hero> iterator = heros.iterator(); iterator.hasNext();) {
            Hero hero = (Hero) iterator.next();
            System.out.println(hero);
        }
     // 第三种，增强型for循环
        System.out.println("--------增强型for循环-------");
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
