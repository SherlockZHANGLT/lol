package animal;

public class Spider extends Animal{
	public Spider() {
		super(8);
	}
	public void eat() {
		System.out.print("蜘蛛正在吃东西");
	}
	public static void main(String[] args) {
    	Spider spider=new Spider();
    	spider.eat();
    }
}
