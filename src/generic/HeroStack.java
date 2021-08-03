package generic;

import java.util.LinkedList;

import lol.ADHero;
import lol.Hero;

public class HeroStack {
	LinkedList<Hero> heros = new LinkedList<Hero>();
    
    public void push(Hero h) {
        heros.addLast(h);
    }
   
    public Hero pull() {
        return heros.removeLast();
    }
   
    public Hero peek() {
        return heros.getLast();
    }
       
    public static void main(String[] args) {
           
        HeroStack heroStack = new HeroStack();
        for (int i = 0; i < 5; i++) {
            Hero h = new ADHero("hero name " + i);
            System.out.println("Ñ¹Èë hero:" + h);
            heroStack.push(h);
        }
        for (int i = 0; i < 5; i++) {
            Hero h =heroStack.pull();
            System.out.println("µ¯³ö hero" + h);
        }
    }

}
