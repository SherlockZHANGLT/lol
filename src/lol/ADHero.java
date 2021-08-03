package lol;
import Item.Item;
import Item.LifePotion;

public class ADHero extends Hero implements AD,Mortal{
	int moveSpeed=400; //移动速度
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    @Override
    public void attack() {
        physicAttack();
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }
    public void attack(Hero h1) {
        System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
    }
 
    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
    }
    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " 攻击了 " + heros[i].name);
        }
    }
    @Override
	public void die() {
		System.out.println("some ADHero died!");
	}
    
	public static void battleWin(){
        System.out.println("ad hero battle win");
    } 
	
	public ADHero(){
        //super("");
        //System.out.println("AD Hero的构造方法");
    }
	public ADHero(String name){
        super(name);
        //System.out.println("AD Hero的构造方法");
    }
	public ADHero(String name,float herohp){
        super(name,herohp);
        //System.out.println("AD Hero的构造方法");
    }
	public ADHero(String name,float herohp,float heroarmor){
        super(name,herohp,heroarmor);
        //System.out.println("AD Hero的构造方法");
    }
	public boolean matched(){
		   return this.hp>100 && this.armor<50;
		}
	public int getMoveSpeed(){
        return this.moveSpeed;
    }    
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    public String getName(){
        return super.name;
    }
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }
    public static void main(String[] args) {
        /*ADHero bh = new ADHero();
        bh.name = "赏金猎人";
 
        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";
 
        bh.attack(h1);
        bh.attack(h1, h2);*/
        
    	/*Hero.battleWin();
        ADHero.battleWin();
        Hero h =new ADHero();
        h.battleWin();*/
    	
    	//ADHero h= new ADHero();      
        /*System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());
        LifePotion lp = new LifePotion();
        h.useItem(lp);*/
    	/*System.out.println(h.toString());//直接打印对象就是打印该对象的toString()返回值
        System.out.println(h);*/
    }
 
}