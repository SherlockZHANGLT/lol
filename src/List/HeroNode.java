package List;

import java.util.ArrayList;
import java.util.List;

import lol.ADHero;

public class HeroNode {
	// ���ӽڵ�
    public HeroNode leftNode;
    // ���ӽڵ�
    public HeroNode rightNode;
    // ֵ
    public ADHero h;
    // ���� ����
    
    public void add(ADHero adh) {
        // �����ǰ�ڵ�û��ֵ���Ͱ����ݷ��ڵ�ǰ�ڵ���
        if (null == h)
            h = adh;
        // �����ǰ�ڵ���ֵ���ͽ����жϣ�������ֵ�뵱ǰֵ�Ĵ�С��ϵ
        else {
            // ������ֵ���ȵ�ǰֵС������ͬ
            if (adh.getHp() -h.getHp() <= 0) {
                if (null == leftNode)
                    leftNode = new HeroNode();
                leftNode.add(adh);
            }
            // ������ֵ���ȵ�ǰֵ��
            else {
                if (null == rightNode)
                    rightNode = new HeroNode();
                rightNode.add(adh);
            }
        }
    }
    
    public List<Object> values() {
        List<Object> values = new ArrayList<>();
        // ��ڵ�ı������
        if (null != leftNode)
            values.addAll(leftNode.values());
        // ��ǰ�ڵ�
        values.add(h.getHp());
        // �ҽڵ�ı������
        if (null != rightNode)
            values.addAll(rightNode.values());
        return values;
    }
    public List<Object> name() {
        List<Object> values = new ArrayList<>();
        // ��ڵ�ı������
        if (null != leftNode)
            values.addAll(leftNode.name());
        // ��ǰ�ڵ�
        values.add(h.getName());
        // �ҽڵ�ı������
        if (null != rightNode)
            values.addAll(rightNode.name());
        return values;
    }
    public static void main(String[] args) {
        float randoms[] = new float[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
        HeroNode roots = new HeroNode();
        int i=0;
        for (float number : randoms) {
        	ADHero h=new ADHero("Hero"+i,number);
            roots.add(h);
        	System.out.println(h);
            i++;
        }
        System.out.println(roots.name());
        System.out.println(roots.values());
    }

}
