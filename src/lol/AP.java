package lol;

public interface AP {
	public static final int resistPhysic = 100;  
    //resistMagic����û����ʽ������Ϊ public static final
    //����ȻĬ��Ϊpublic static final
    int resistMagic = 0;
	public void magicAttack();
	default public void attack1() {
        System.out.println("ħ������");
    }
}
