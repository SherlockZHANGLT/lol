package Item;

public class MagicPotion extends Item{
	public void effect(){
        System.out.println("��ƿʹ�ú󣬿��Ի�ħ��");
    }
	@Override
    public boolean disposable() {
    	return true;
    }
}
