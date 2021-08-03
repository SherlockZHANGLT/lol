package lol;

public class Support extends Hero implements Healer{
	@Override
	public void heal() {
		System.out.println(name + " 进行了一次治疗 ，但是不确定治疗谁了");
	}
	public void heal(Hero h1) {
		System.out.println(name + "对" + h1.name + "进行了一次治疗量为50的治疗 ");
	}
	public void heal(Hero h1,int m) {
		System.out.println(name + "对" + h1.name + "进行了一次治疗量为"+m+"的治疗");
	}
	public void heal(Hero...heros) {
		for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " 治疗了 " + heros[i].name);
        }
	}
	@Override
    public void attack() {
		heal();
        System.out.println("圣击后回血");
    }
	
	public static void main(String[] args) {
		/*Support sh = new Support();
        sh.name = "天使";       
        Hero h = new Hero();
        h.name = "阿狸";
        sh.heal();
        sh.heal(h);
        sh.heal(h,500);
        final int hp;
        hp = 5;*/
    }
}
