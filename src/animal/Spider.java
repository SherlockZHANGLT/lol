package animal;

public class Spider extends Animal{
	public Spider() {
		super(8);
	}
	public void eat() {
		System.out.print("֩�����ڳԶ���");
	}
	public static void main(String[] args) {
    	Spider spider=new Spider();
    	spider.eat();
    }
}
