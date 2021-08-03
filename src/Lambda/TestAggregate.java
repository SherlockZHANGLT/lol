package Lamba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import lol.ADHero;

public class TestAggregate {
	 public static void main(String[] args) {
	        Random r = new Random();
	        List<ADHero> heros = new ArrayList<ADHero>();
	        for (int i = 0; i < 5; i++) {
	            heros.add(new ADHero("hero " + i, r.nextInt(1000), r.nextInt(100)));
	        }
	 
	        /*System.out.println("初始化后的集合：");
	        System.out.println(heros);
	        System.out.println("查询条件：hp>100 && armor<50");
	        System.out.println("通过传统操作方式找出满足条件的数据：");
	 
	        for (ADHero h : heros) {
	            if (h.hp > 100 && h.armor < 50)
	                System.out.println(h.name);
	        }
	 
	        System.out.println("通过聚合操作方式找出满足条件的数据：");
	        heros
	            .stream()
	            .filter(h -> h.hp > 100 && h.armor < 50)
	            .forEach(h -> System.out.println(h.name));
	        
	      //管道源是数组
	        ADHero hs[] = heros.toArray(new ADHero[heros.size()]);
	        Arrays.stream(hs)
	        .filter(h -> h.hp > 100 && h.armor < 50)
	        .forEach(h->System.out.println(h.name));
	 
	    }*/
	      /*//制造一个重复数据
	        heros.add(heros.get(0));
	        System.out.println("初始化集合后的数据 (最后一个数据重复)：");
	        System.out.println(heros);
	        System.out.println("满足条件hp>100&&armor<50的数据");
	          
	        heros
	            .stream()
	            .filter(h->h.hp>100&&h.armor<50)
	            .forEach(h->System.out.println(h));
	          
	        System.out.println("去除重复的数据，去除标准是看equals");
	        heros
	            .stream()
	            .distinct()
	            .forEach(h->System.out.println(h));
	        System.out.println("按照血量排序");
	        heros
	            .stream()
	            .sorted((h1,h2)->h1.hp>=h2.hp?1:-1)
	            .forEach(h->System.out.println(h));
	          
	        System.out.println("保留3个");
	        heros
	            .stream()
	            .limit(3)
	            .forEach(h->System.out.println(h));
	          
	        System.out.println("忽略前3个");
	        heros
	            .stream()
	            .skip(3)
	            .forEach(h->System.out.println(h));
	          
	        System.out.println("转换为double的Stream");
	        heros
	            .stream()
	            .mapToDouble(ADHero::getHp)
	            .forEach(h->System.out.println(h));
	          
	        System.out.println("转换任意类型的Stream");
	        heros
	            .stream()
	            .map((h)-> h.name + " - " + h.hp + " - " + h.armor)
	            .forEach(h->System.out.println(h));*/
	        
	        System.out.println("遍历集合中的每个数据");
	        heros
	            .stream()
	            .forEach(h->System.out.print(h));
	        System.out.println("返回一个数组");
	        Object[] hs= heros
	            .stream()
	            .toArray();
	        System.out.println(Arrays.toString(hs));
	        System.out.println("返回护甲最低的那个英雄");
	        ADHero minDamageHero =
	        heros
	            .stream()
	            .min((h1,h2)->(int)(h1.armor-h2.armor))
	            .get();
	        System.out.print(minDamageHero);
	        System.out.println("返回护甲最高的那个英雄");
	 
	        ADHero mxnDamageHero =
	                heros
	                .stream()
	                .max((h1,h2)->(int)(h1.armor-h2.armor))
	                .get();
	        System.out.println(mxnDamageHero);     
	         
	        System.out.println("流中数据的总数");
	        long count = heros
	                .stream()
	                .count();
	        System.out.println(count);
	 
	        System.out.println("第一个英雄");
	        ADHero firstHero =
	                heros
	                .stream()
	                .findFirst()
	                .get();
	         
	        System.out.println(firstHero);
	        
	        ADHero third = heros
	                .stream()
	                .sorted(((o1, o2) -> (int)(o1.hp-o2.hp)))
	                .skip(2)
	                .findFirst()
	                .get();
	        System.out.println("流式第三高：" + third);
	          
	    }

}
