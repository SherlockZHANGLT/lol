package lol;

public class Support extends Hero implements Healer{
	@Override
	public void heal() {
		System.out.println(name + " ������һ������ �����ǲ�ȷ������˭��");
	}
	public void heal(Hero h1) {
		System.out.println(name + "��" + h1.name + "������һ��������Ϊ50������ ");
	}
	public void heal(Hero h1,int m) {
		System.out.println(name + "��" + h1.name + "������һ��������Ϊ"+m+"������");
	}
	public void heal(Hero...heros) {
		for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " ������ " + heros[i].name);
        }
	}
	@Override
    public void attack() {
		heal();
        System.out.println("ʥ�����Ѫ");
    }
	
	public static void main(String[] args) {
		/*Support sh = new Support();
        sh.name = "��ʹ";       
        Hero h = new Hero();
        h.name = "����";
        sh.heal();
        sh.heal(h);
        sh.heal(h,500);
        final int hp;
        hp = 5;*/
    }
}
