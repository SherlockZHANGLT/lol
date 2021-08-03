package lol;

import Item.Item;
import Item.LifePotion;
import Item.MagicPotion;

public abstract class Hero{   
	public static final int itemTotalNumber = 6;//��Ʒ��������
    public String name="hero1"; //���� 
    
    double attackSpeed;//����
    double mana;//����ֵ
    double attack;//������
    double rangeAttack;//�������
    private double resistance;//ħ��
    public float hp; //Ѫ��  
    public float armor; //����  
    int moveSpeed; //�ƶ��ٶ�  
    
    static String copyright;//������,��̬����
    {
    	name="hero3";
    }
    public Hero(){
    	name="hero2";
    	//System.out.println("Hero�Ĺ��췽�� ");
    }
  //��һ�������Ĺ��췽��
    public Hero(String heroname){ 
    	//System.out.println("Hero����һ�������Ĺ��췽�� ");
        name = heroname;
    }     
    //�����������Ĺ��췽��
    public Hero(String heroname,float herohp){ 
        name = heroname;
        hp = herohp;
    }
    public Hero(String name,float hp,float heroArmor){
        this(name);
        System.out.println("���������Ĺ��췽��");
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
        System.out.println("�Ӷ��ѣ�");
    }
    float getArmor(){
    	  return armor;
    }
    void addSpeed(int speed){
    	//��ԭ���Ļ����������ƶ��ٶ�
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
        System.out.println("�ظ�Ѫ����"+blood+"����Ѫ����"+hp);
     }
    public void Output() {
    	System.out.println("Ӣ�����ƣ�"+name);
        System.out.println("����ֵ��"+hp);
        System.out.println("����ֵ��"+mana);
        System.out.println("��������"+attack);
        System.out.println("���٣�"+attackSpeed);
        System.out.println("����ֵ��"+armor);
        System.out.println("ħ����"+resistance);
        System.out.println("���٣�"+moveSpeed);
    }
    public void setName3(String name){
        //name������ǲ���name
        //this.name�����������name
        this.name = name;
    }
    public void huixue(int xp){
        hp = hp + xp;
        //��Ѫ��Ϻ�Ѫƿ=0
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
            throw new EnemyHeroIsDeadException(hero.name + " �Ѿ�����,����Ҫʩ�ż���" );
        }
        hero.hp = hero.hp - damage;
    }
    
    /*public Hero revive(Hero h){
        h = new Hero("��Ī",383);
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
        System.out.println("���Ӣ�����ڱ�����");
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
                System.out.println(name + "����");
            else
                System.out.println(name + "��δ����");
        }
    }
  //�з���ˮ��
    static class EnemyCrystal{
        int hp=5000;
         
        //���ˮ����Ѫ��Ϊ0��������ʤ��
        public void checkIfVictory(){
            if(hp==0){
                Hero.battleWin();
                 
                //��̬�ڲ��಻��ֱ�ӷ����ⲿ��Ķ�������
                //System.out.println(name + " win this game");
            }
        }
    }
    public static void main(String[] args) {
        /*Hero garen =  new Hero("����");
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        garen.addSpeed(100);
        System.out.println("Ӣ�����ƣ�"+garen.name+"��Ӣ��Ѫ����"+garen.hp);
        
        Hero teemo =  new Hero("��Ī");
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
        int xueping = 100;
        //��Īͨ�����Ѫƿ��Ѫ         
        teemo.huixue(xueping);         
        System.out.println(xueping);
        System.out.println(teemo.hp);
        
        Hero kaisa = new Hero("��ɯ",600,28,335);
        kaisa.mana = 344;
        kaisa.attack = 59;
        kaisa.attackSpeed = 0.644;
        kaisa.rangeAttack = 525;
        kaisa.resistance = 30;
        kaisa.Output();       
        System.out.println("Ӣ�����ƣ�"+kaisa.name+"��Ӣ��Ѫ����"+kaisa.hp+"��Ӣ�ۻ��ף�"+kaisa.armor+"��Ӣ�����٣�"+kaisa.moveSpeed);
        
        garen.attack(teemo, 100);
        System.out.println(teemo.hp);
        teemo.hp = teemo.hp - 400;
        teemo = teemo.revive(teemo);
        System.out.println(teemo.hp);//383
        
        Hero.copyright = "��Ȩ��Riot Games��˾����";
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
        //�ж�����h1ָ��Ķ����Ƿ���ADHero����
        System.out.println(h1 instanceof ADHero);    
        //�ж�����h2ָ��Ķ����Ƿ���APHero����
        System.out.println(h2 instanceof APHero);    
        //�ж�����h1ָ��Ķ����Ƿ���Hero��������
        System.out.println(h1 instanceof Hero);*/
    	
    	/*ADHero ad = new ADHero();
        AD adi = ad;*/
    	
    	/*Hero garen =  new Hero();
        garen.name = "����";     
        LifePotion lp =new LifePotion();
        MagicPotion mp =new MagicPotion();        
        garen.useLifePotion(lp);
        garen.useMagicPotion(mp);
        garen.useItem(lp);
        garen.useItem(mp);*/
    	
    	/*Hero garen=new Hero();
    	garen.name="����";
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
        garen.name = "����";
        BattleScore score = garen.new BattleScore();
        score.kill = 9;
        score.legendary();*/
    	
    	/*Hero.EnemyCrystal crystal = new Hero.EnemyCrystal();
    	crystal.hp=0;
        crystal.checkIfVictory();*/
    	
    	/*Hero h = new Hero(){
            //����ʵ��attack����
            public void attack() {
                System.out.println("�µĽ����ֶ�");
            }
        };
        h.attack();
        //ͨ����ӡh�����Կ���h�����������Hero$1��ôһ��ϵͳ�Զ����������         
        System.out.println(h);
        class SomeHero extends Hero{
            public void attack() {
                System.out.println( name+ " ���µĽ����ֶ�");
            }
        }   
        SomeHero h1  =new SomeHero();
        h1.name ="�ز�ʦ";
        h1.attack();
        
        int damage = 5;
        class AnonymousHero extends Hero{
            int damage;
            public AnonymousHero(int damage){
                this.damage = damage;
            }
            public void attack() {
                damage = 10;
                System.out.printf("�����µĽ����ֶΣ����%d���˺�",this.damage );
            }
        }
        Hero h2 = new AnonymousHero(damage);
        h2.attack();*/
    	Hero garen =  new ADHero();
        garen.name = "����";
        garen.hp = 616;
 
        Hero teemo =  new ADHero();
        teemo.name = "��Ī";
        teemo.hp = 0;
         
        try {
            garen.attack(teemo,500);
             
        } catch (EnemyHeroIsDeadException e) {
            // TODO Auto-generated catch block
            System.out.println("�쳣�ľ���ԭ��:"+e.getMessage());
            e.printStackTrace();
        }
         
    }
    	
}