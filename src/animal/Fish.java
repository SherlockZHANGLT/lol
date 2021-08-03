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
		System.out.print("我像只鱼儿在你的荷塘");
	}
	public void eat() {
		System.out.print("鱼鱼吃饭饭啦！");
	}
	public void walk() {
		System.out.print("鱼没有腿，可走不了路");
	}
	public static void main(String[] args) {
		Fish fish=new Fish();
		fish.walk();
	}
}
