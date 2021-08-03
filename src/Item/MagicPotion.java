package Item;

public class MagicPotion extends Item{
	public void effect(){
        System.out.println("蓝瓶使用后，可以回魔法");
    }
	@Override
    public boolean disposable() {
    	return true;
    }
}
