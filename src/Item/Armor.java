package Item;
public class Armor extends Item {
	public Armor(){
        
    }
    public Armor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	int ac;
    @Override
    public boolean disposable() {
    	return false;
    }
    public static void main(String[] args) {
        Armor cloth = new Armor();
        Armor lock = new Armor();
        cloth.name = "����";
        cloth.price = 300;
        cloth.ac = 15;
        lock.name = "���Ӽ�";
        lock.price = 500;
        lock.ac = 40;
        System.out.println("����:"+cloth.name+"\t"+"�۸�:"+cloth.price+"\t"+"���׵ȼ�:"+cloth.ac);
        System.out.println("����:"+lock.name+"\t"+"�۸�:"+lock.price+"\t"+"���׵ȼ�:"+lock.price);
    }   
}