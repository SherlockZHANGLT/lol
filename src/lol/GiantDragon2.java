package lol;
//����ʽ
public class GiantDragon2 {
	//˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
    private GiantDragon2(){       
    }
  
    //׼��һ�������ԣ�����ָ��һ��ʵ�������󣬵�����ʱָ��null
    private static GiantDragon2 instance;
      
    //public static ����������ʵ������
    public static GiantDragon2 getInstance(){
        //��һ�η��ʵ�ʱ�򣬷���instanceû��ָ���κζ�����ʱʵ����һ������
        if(null==instance){
            instance = new GiantDragon2();
        }
        //���� instanceָ��Ķ���
        return instance;
    }
}
