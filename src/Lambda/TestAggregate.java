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
	 
	        /*System.out.println("��ʼ����ļ��ϣ�");
	        System.out.println(heros);
	        System.out.println("��ѯ������hp>100 && armor<50");
	        System.out.println("ͨ����ͳ������ʽ�ҳ��������������ݣ�");
	 
	        for (ADHero h : heros) {
	            if (h.hp > 100 && h.armor < 50)
	                System.out.println(h.name);
	        }
	 
	        System.out.println("ͨ���ۺϲ�����ʽ�ҳ��������������ݣ�");
	        heros
	            .stream()
	            .filter(h -> h.hp > 100 && h.armor < 50)
	            .forEach(h -> System.out.println(h.name));
	        
	      //�ܵ�Դ������
	        ADHero hs[] = heros.toArray(new ADHero[heros.size()]);
	        Arrays.stream(hs)
	        .filter(h -> h.hp > 100 && h.armor < 50)
	        .forEach(h->System.out.println(h.name));
	 
	    }*/
	      /*//����һ���ظ�����
	        heros.add(heros.get(0));
	        System.out.println("��ʼ�����Ϻ������ (���һ�������ظ�)��");
	        System.out.println(heros);
	        System.out.println("��������hp>100&&armor<50������");
	          
	        heros
	            .stream()
	            .filter(h->h.hp>100&&h.armor<50)
	            .forEach(h->System.out.println(h));
	          
	        System.out.println("ȥ���ظ������ݣ�ȥ����׼�ǿ�equals");
	        heros
	            .stream()
	            .distinct()
	            .forEach(h->System.out.println(h));
	        System.out.println("����Ѫ������");
	        heros
	            .stream()
	            .sorted((h1,h2)->h1.hp>=h2.hp?1:-1)
	            .forEach(h->System.out.println(h));
	          
	        System.out.println("����3��");
	        heros
	            .stream()
	            .limit(3)
	            .forEach(h->System.out.println(h));
	          
	        System.out.println("����ǰ3��");
	        heros
	            .stream()
	            .skip(3)
	            .forEach(h->System.out.println(h));
	          
	        System.out.println("ת��Ϊdouble��Stream");
	        heros
	            .stream()
	            .mapToDouble(ADHero::getHp)
	            .forEach(h->System.out.println(h));
	          
	        System.out.println("ת���������͵�Stream");
	        heros
	            .stream()
	            .map((h)-> h.name + " - " + h.hp + " - " + h.armor)
	            .forEach(h->System.out.println(h));*/
	        
	        System.out.println("���������е�ÿ������");
	        heros
	            .stream()
	            .forEach(h->System.out.print(h));
	        System.out.println("����һ������");
	        Object[] hs= heros
	            .stream()
	            .toArray();
	        System.out.println(Arrays.toString(hs));
	        System.out.println("���ػ�����͵��Ǹ�Ӣ��");
	        ADHero minDamageHero =
	        heros
	            .stream()
	            .min((h1,h2)->(int)(h1.armor-h2.armor))
	            .get();
	        System.out.print(minDamageHero);
	        System.out.println("���ػ�����ߵ��Ǹ�Ӣ��");
	 
	        ADHero mxnDamageHero =
	                heros
	                .stream()
	                .max((h1,h2)->(int)(h1.armor-h2.armor))
	                .get();
	        System.out.println(mxnDamageHero);     
	         
	        System.out.println("�������ݵ�����");
	        long count = heros
	                .stream()
	                .count();
	        System.out.println(count);
	 
	        System.out.println("��һ��Ӣ��");
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
	        System.out.println("��ʽ�����ߣ�" + third);
	          
	    }

}
