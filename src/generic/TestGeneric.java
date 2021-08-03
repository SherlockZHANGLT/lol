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
        //? extends Hero ��ʾ����һ��Hero���͵����෺��
        //heroList �ķ��Ϳ�����Hero
        //heroList �ķ��Ϳ���ʹAPHero
        //heroList �ķ��Ϳ���ʹADHero
        //����ȷ����ǣ���heroListȡ�����Ķ���һ���ǿ���ת�ͳ�Hero��
        Hero h= heroList.get(0);
        System.out.print(h);
        //���ǣ�����������Ŷ���
        //heroList.add(new ADHero()); //���������ΪheroList�ķ��� �п�����APHero
        
        ArrayList<? super Hero> heroList1 = new ArrayList<Object>();
        //? super Hero ��ʾ heroList�ķ�����Hero�����丸�෺��
        //heroList �ķ��Ϳ�����Hero
        //heroList �ķ��Ϳ�����Object
        //���ԾͿ��Բ���Hero
        heroList1.add(new ADAPHero());
        //Ҳ���Բ���Hero������
        heroList1.add(new APHero());
        heroList1.add(new ADHero());
        //���ǣ����ܴ�����ȡ���ݳ���,��Ϊ�䷺�Ϳ�����Object,��Object��ǿתHero��ʧ��
        //Hero h= heroList1.get(0);
        
        ArrayList<APHero> apHeroList1 = new ArrayList<APHero>();
        //?����ͨ�������ʾ���ⷺ��
        ArrayList<?> generalList = apHeroList1;
        //?��ȱ��1�� ��Ȼ?�������ⷺ�ͣ���ô���仰˵����Ͳ�֪���������������ʲô����
        //����ֻ����Object����ʽȡ����
        Object o = generalList.get(0);
        //?��ȱ��2�� ��Ȼ?�������ⷺ�ͣ���ô���п�����Hero,Ҳ�п�����Item
        //���ԣ������ֶ����ȥ�����з��գ������ʲôʲô���͵Ķ��󣬶����ܷŽ�ȥ
        //generalList.add(new Item()); //������� ��Ϊ?�������ⷺ�ͣ����п��ܲ���Item
        //generalList.add(new Hero()); //������� ��Ϊ?�������ⷺ�ͣ����п��ܲ���Hero
        //generalList.add(new APHero()); //�������  ��Ϊ?�������ⷺ�ͣ����п��ܲ���APHero*/
		
		ArrayList<Hero> hs = new ArrayList<>();
        ArrayList<APHero> aphs = new ArrayList<>();
        ArrayList<ADHero> adhs = new ArrayList<>();
        
        iterate(hs);
        iterate(aphs);
        iterate(adhs);
    }
}
