package lol;

public final class ADAPHero extends Hero implements AD,AP,Mortal{
	@Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
  
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    @Override
    public void attack() {
        System.out.println("既可以进行物理攻击，也可以进行魔法攻击");
    }
    @Override
	public void die() {
		System.out.println("some APADHero died!");
	}
    @Override
	public void attack1() {
		// TODO Auto-generated method stub
		AD.super.attack1();
	}

	public static void main(String[] args) {
    	ADAPHero i=new ADAPHero();
    	i.attack1();
    }
}
