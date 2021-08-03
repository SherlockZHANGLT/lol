package List;

import java.util.Iterator;
import java.util.LinkedList;

import lol.ADHero;
import lol.Hero;

public class MyStack implements Stack{
	LinkedList<Hero> ll = new LinkedList<>();

	@Override
	public void push(Hero h) {
		// TODO Auto-generated method stub
		ll.addLast(h);
	}

	@Override
	public Hero pull() {
		// TODO Auto-generated method stub
		Hero h = ll.pollLast();
        return h;
	}

	@Override
	public Hero peek() {
		// TODO Auto-generated method stub
		Hero h = ll.peekLast();
        return h;
	}
	
	public static void main(String[] args) {
        
        MyStack stack = new MyStack();
        // ��MyStackջ��ѹ��5��Ӣ��
        for(int i = 0; i < 5; i++)
            stack.push(new ADHero("hero name" + i));
        System.out.println(stack.ll);
          
        // whileѭ�� ��MyStackջ�е���5��Ӣ��
        Iterator<Hero> it = stack.ll.iterator();
        while(it.hasNext()) {
            Hero h = stack.pull();
            System.out.println("����Ӣ��" + h + "\t");
        }
        System.out.println();
        System.out.println(stack.ll);
        
     /*// ��
        // forѭ�� ��MyStackջ�е���5��Ӣ��
        for(Iterator<Hero> iterator = stack.ll.iterator(); iterator.hasNext();) {
            Hero h = stack.pull();
            System.out.println("����Ӣ��" + h + "\t");
        }*/
    }
}
  


