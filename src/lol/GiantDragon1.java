package lol;
//����ʽ
public class GiantDragon1 {
	//˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
    private GiantDragon1(){        
    }
    //׼��һ�������ԣ�ָ��һ��ʵ�������� ��Ϊ�������ԣ�����ֻ��һ��
    private static GiantDragon1 instance = new GiantDragon1();   
    //public static �������ṩ�������߻�ȡ12�ж���Ķ���
    public static GiantDragon1 getInstance(){
        return instance;
    }
}
