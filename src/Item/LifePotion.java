package Item;

public class LifePotion extends Item{
	public void effect(){
        System.out.println("Ѫƿʹ�ú󣬿��Ի�Ѫ");
    }
	@Override
    public boolean disposable() {
    	return true;
    }
	public static void main(String[] args) {
        /*Item i = new Item();
        i.effect();*/
         
        LifePotion lp =new LifePotion();
        lp.effect();
    }
}
