package lol;

public class APHero extends Hero implements AP,Mortal{
	@Override
    public void magicAttack() {
        System.out.println("����ħ������");
    }
	@Override
    public void attack() {
        magicAttack();
    }
	@Override
	public void die() {
		System.out.println("some APHero died!");
	}
}
