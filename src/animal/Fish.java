package animal;

public class Fish extends Animal implements pet{
	private String name;
	public Fish() {
		super(0);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void play() {
		System.out.print("����ֻ�������ĺ���");
	}
	public void eat() {
		System.out.print("����Է�������");
	}
	public void walk() {
		System.out.print("��û���ȣ����߲���·");
	}
	public static void main(String[] args) {
		Fish fish=new Fish();
		fish.walk();
	}
}
