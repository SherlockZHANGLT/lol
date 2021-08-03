package lol;
import Item.Item;
import Item.LifePotion;

public class ADHero extends Hero implements AD,Mortal{
	int moveSpeed=400; //�ƶ��ٶ�
    @Override
    public void physicAttack() {
        System.out.println("����������");
    }
    @Override
    public void attack() {
        physicAttack();
        System.out.println(name + " ������һ�ι��� �����ǲ�ȷ������˭��");
    }
    public void attack(Hero h1) {
        System.out.println(name + "��" + h1.name + "������һ�ι��� ");
    }
 
    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "ͬʱ��" + h1.name + "��" + h2.name + "�����˹��� ");
    }
    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " ������ " + heros[i].name);
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
        //System.out.println("AD Hero�Ĺ��췽��");
    }
	public ADHero(String name){
        super(name);
        //System.out.println("AD Hero�Ĺ��췽��");
    }
	public ADHero(String name,float herohp){
        super(name,herohp);
        //System.out.println("AD Hero�Ĺ��췽��");
    }
	public ADHero(String name,float herohp,float heroarmor){
        super(name,herohp,heroarmor);
        //System.out.println("AD Hero�Ĺ��췽��");
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
        bh.name = "�ͽ�����";
 
        Hero h1 = new Hero();
        h1.name = "����";
        Hero h2 = new Hero();
        h2.name = "��Ī";
 
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
    	/*System.out.println(h.toString());//ֱ�Ӵ�ӡ������Ǵ�ӡ�ö����toString()����ֵ
        System.out.println(h);*/
    }
 
}