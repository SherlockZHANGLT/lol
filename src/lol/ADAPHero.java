package lol;

public final class ADAPHero extends Hero implements AD,AP,Mortal{
	@Override
    public void magicAttack() {
        System.out.println("����ħ������");
    }
  
    @Override
    public void physicAttack() {
        System.out.println("����������");
    }
    @Override
    public void attack() {
        System.out.println("�ȿ��Խ�����������Ҳ���Խ���ħ������");
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
