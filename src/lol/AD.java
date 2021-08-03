package lol;

public interface AD {
	public void physicAttack();
	default public void attack1() {
        System.out.println("ÎïÀí¹¥»÷");
    }
}
