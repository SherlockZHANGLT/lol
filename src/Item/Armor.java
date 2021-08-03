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
        cloth.name = "护甲";
        cloth.price = 300;
        cloth.ac = 15;
        lock.name = "锁子甲";
        lock.price = 500;
        lock.ac = 40;
        System.out.println("名称:"+cloth.name+"\t"+"价格:"+cloth.price+"\t"+"护甲等级:"+cloth.ac);
        System.out.println("名称:"+lock.name+"\t"+"价格:"+lock.price+"\t"+"护甲等级:"+lock.price);
    }   
}