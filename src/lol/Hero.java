package lol;

import Item.Item;
import Item.LifePotion;
import Item.MagicPotion;

public abstract class Hero{   
	public static final int itemTotalNumber = 6;//物品栏的数量
    public String name="hero1"; //姓名 
    
    double attackSpeed;//攻速
    double mana;//法力值
    double attack;//攻击力
    double rangeAttack;//攻击射程
    private double resistance;//魔抗
    public float hp; //血量  
    public float armor; //护甲  
    int moveSpeed; //移动速度  
    
    static String copyright;//类属性,静态属性
    {
    	name="hero3";
    }
    public Hero(){
    	name="hero2";
    	//System.out.println("Hero的构造方法 ");
    }
  //带一个参数的构造方法
    public Hero(String heroname){ 
    	//System.out.println("Hero的有一个参数的构造方法 ");
        name = heroname;
    }     
    //带两个参数的构造方法
    public Hero(String heroname,float herohp){ 
        name = heroname;
        hp = herohp;
    }
    public Hero(String name,float hp,float heroArmor){
        this(name);
        System.out.println("三个参数的构造方法");
        this.hp = hp;
        this.armor=heroArmor;
    }
    public Hero(String heroName,float heroHP,float heroArmor,int heroMoveSpeed) {
    	name=heroName;
    	hp=heroHP;
    	armor=heroArmor;
    	moveSpeed=heroMoveSpeed;
    }
    
    void keng(){
        System.out.println("坑队友！");
    }
    float getArmor(){
    	  return armor;
    }
    void addSpeed(int speed){
    	//在原来的基础上增加移动速度
    	moveSpeed = moveSpeed + speed;
    }
    public void legendary(){
        System.out.println("God Like!");
     }
    public float getHp(){
        return hp;
     }
    public void recovery(float blood){
        hp = hp + blood;
        System.out.println("回复血量："+blood+"，总血量："+hp);
     }
    public void Output() {
    	System.out.println("英雄名称："+name);
        System.out.println("生命值："+hp);
        System.out.println("法力值："+mana);
        System.out.println("攻击力："+attack);
        System.out.println("攻速："+attackSpeed);
        System.out.println("护甲值："+armor);
        System.out.println("魔抗："+resistance);
        System.out.println("移速："+moveSpeed);
    }
    public void setName3(String name){
        //name代表的是参数name
        //this.name代表的是属性name
        this.name = name;
    }
    public void huixue(int xp){
        hp = hp + xp;
        //回血完毕后，血瓶=0
        xp=0;
    }
    class EnemyHeroIsDeadException extends Exception{
        
        public EnemyHeroIsDeadException(){
             
        }
        public EnemyHeroIsDeadException(String msg){
            super(msg);
        }
    }
    public void attack(Hero hero, int damage) throws EnemyHeroIsDeadException{
    	if(hero.hp == 0){
            throw new EnemyHeroIsDeadException(hero.name + " 已经挂了,不需要施放技能" );
        }
        hero.hp = hero.hp - damage;
    }
    
    /*public Hero revive(Hero h){
        h = new Hero("提莫",383);
        return h;
    }*/
    
    public static void battleWin(){
        System.out.println("battle win");
    }
    
    public void useLifePotion(LifePotion lp){
        lp.effect();
    }
    public void useMagicPotion(MagicPotion mp){
        mp.effect();
    }
    public void useItem(Item i){
    	System.out.println("hero use item");
        i.effect();
    }
    
    public void kill(Mortal m) {
    	m.die();
    }
    public String toString(){
        return name;
    }    
    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }
    public boolean equals(Object o){
        if(o instanceof Hero){
            Hero h = (Hero) o;
            return this.name == h.name;
        }
        return false;
    }
    public abstract void attack();
    class BattleScore {
        int kill;
        int die;
        int assit;
 
        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "超神！");
            else
                System.out.println(name + "尚未超神！");
        }
    }
  //敌方的水晶
    static class EnemyCrystal{
        int hp=5000;
         
        //如果水晶的血量为0，则宣布胜利
        public void checkIfVictory(){
            if(hp==0){
                Hero.battleWin();
                 
                //静态内部类不能直接访问外部类的对象属性
                //System.out.println(name + " win this game");
            }
        }
    }
    public static void main(String[] args) {
        /*Hero garen =  new Hero("盖伦");
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        garen.addSpeed(100);
        System.out.println("英雄名称："+garen.name+"，英雄血量："+garen.hp);
        
        Hero teemo =  new Hero("提莫");
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
        int xueping = 100;
        //提莫通过这个血瓶回血         
        teemo.huixue(xueping);         
        System.out.println(xueping);
        System.out.println(teemo.hp);
        
        Hero kaisa = new Hero("卡莎",600,28,335);
        kaisa.mana = 344;
        kaisa.attack = 59;
        kaisa.attackSpeed = 0.644;
        kaisa.rangeAttack = 525;
        kaisa.resistance = 30;
        kaisa.Output();       
        System.out.println("英雄名称："+kaisa.name+"，英雄血量："+kaisa.hp+"，英雄护甲："+kaisa.armor+"，英雄移速："+kaisa.moveSpeed);
        
        garen.attack(teemo, 100);
        System.out.println(teemo.hp);
        teemo.hp = teemo.hp - 400;
        teemo = teemo.revive(teemo);
        System.out.println(teemo.hp);//383
        
        Hero.copyright = "版权由Riot Games公司所有";
        //garen.copyright = "Blizzard Entertainment Enterprise";
        System.out.println(garen.copyright);
        System.out.println(teemo.copyright);
        Hero.battleWin();
        
        Hero someHero=new Hero();
        System.out.println(someHero.name);*/
    	
    	/*ADHero ad = new ADHero();
        APHero ap = new APHero();         
        Hero h1= ad;
        Hero h2= ap;       
        //判断引用h1指向的对象，是否是ADHero类型
        System.out.println(h1 instanceof ADHero);    
        //判断引用h2指向的对象，是否是APHero类型
        System.out.println(h2 instanceof APHero);    
        //判断引用h1指向的对象，是否是Hero的子类型
        System.out.println(h1 instanceof Hero);*/
    	
    	/*ADHero ad = new ADHero();
        AD adi = ad;*/
    	
    	/*Hero garen =  new Hero();
        garen.name = "盖伦";     
        LifePotion lp =new LifePotion();
        MagicPotion mp =new MagicPotion();        
        garen.useLifePotion(lp);
        garen.useMagicPotion(mp);
        garen.useItem(lp);
        garen.useItem(mp);*/
    	
    	/*Hero garen=new Hero();
    	garen.name="盖伦";
    	ADHero ad=new ADHero();
    	APHero ap=new APHero();
    	ADAPHero ad_ap=new ADAPHero();
    	garen.kill(ad);
    	garen.kill(ap);
    	garen.kill(ad_ap);*/
    	
    	/*Hero h;
        for (int i = 0; i < 1000; i++) {
            h = new Hero();*/
    	
    	/*Hero h1= new Hero();
        h1.hp = 300;
        Hero h2= new Hero();
        h2.hp = 400;
        Hero h3= new Hero();
        h3.hp = 300;  
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
        System.out.println(h1==h2);
        System.out.println(h1==h3);*/
        
    	/*final Hero h;
        h  =new Hero();
        h.hp = 5;*/
    	
    	/*Hero garen = new ADHero();
        garen.name = "盖伦";
        BattleScore score = garen.new BattleScore();
        score.kill = 9;
        score.legendary();*/
    	
    	/*Hero.EnemyCrystal crystal = new Hero.EnemyCrystal();
    	crystal.hp=0;
        crystal.checkIfVictory();*/
    	
    	/*Hero h = new Hero(){
            //当场实现attack方法
            public void attack() {
                System.out.println("新的进攻手段");
            }
        };
        h.attack();
        //通过打印h，可以看到h这个对象属于Hero$1这么一个系统自动分配的类名         
        System.out.println(h);
        class SomeHero extends Hero{
            public void attack() {
                System.out.println( name+ " 新新的进攻手段");
            }
        }   
        SomeHero h1  =new SomeHero();
        h1.name ="地卜师";
        h1.attack();
        
        int damage = 5;
        class AnonymousHero extends Hero{
            int damage;
            public AnonymousHero(int damage){
                this.damage = damage;
            }
            public void attack() {
                damage = 10;
                System.out.printf("新新新的进攻手段，造成%d点伤害",this.damage );
            }
        }
        Hero h2 = new AnonymousHero(damage);
        h2.attack();*/
    	Hero garen =  new ADHero();
        garen.name = "盖伦";
        garen.hp = 616;
 
        Hero teemo =  new ADHero();
        teemo.name = "提莫";
        teemo.hp = 0;
         
        try {
            garen.attack(teemo,500);
             
        } catch (EnemyHeroIsDeadException e) {
            // TODO Auto-generated catch block
            System.out.println("异常的具体原因:"+e.getMessage());
            e.printStackTrace();
        }
         
    }
    	
}