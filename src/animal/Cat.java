package animal;

public class Cat extends Animal implements pet{
	String name;
	public Cat(String name) {
		super(4);
		this.name=name;
	}
	public Cat() {
		this("");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void play() {
		System.out.print("èè����棬����");
	}
	public void eat() {
		System.out.print("èè�Է�������");
	}
	public static void main(String[] args) {
		Cat cat=new Cat("�۹���");
		System.out.print(cat.getName());
	}
}
