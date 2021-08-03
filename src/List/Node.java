package List;

import java.util.ArrayList;
import java.util.List;

public class Node <T extends Comparable> {
	// ���ӽڵ�
    public Node<T> leftNode;
    // ���ӽڵ�
    public Node<T> rightNode;
    // ֵ
    public T value;
    // ���� ����  
    public void nums(List<Integer> a){
        // �������4�����
        for (int i = 0; i <40000; i++) {
            int num = (int) (Math.random()*(999 + 1));
            a.add(num);
        }   
    }
    public void add(T v) {
        // �����ǰ�ڵ�û��ֵ���Ͱ����ݷ��ڵ�ǰ�ڵ���
        if (null == value)
            value = v;
        // �����ǰ�ڵ���ֵ���ͽ����жϣ�������ֵ�뵱ǰֵ�Ĵ�С��ϵ
        else {
            // ������ֵ���ȵ�ǰֵС������ͬ
            if ((Integer) v -((Integer)value) <= 0) {
                if (null == leftNode)
                    leftNode = new Node<>();
                leftNode.add(v);
            }
            // ������ֵ���ȵ�ǰֵ��
            else {
                if (null == rightNode)
                    rightNode = new Node<>();
                rightNode.add(v);
            }
        }
    }
 // ����������еĽڵ�
    public List<T> values() {
        List<T> values = new ArrayList<>();
        // ��ڵ�ı������
        if (null != leftNode)
            values.addAll(leftNode.values());
        // ��ǰ�ڵ�
        values.add( value);
        // �ҽڵ�ı������
        if (null != rightNode)
            values.addAll(rightNode.values());
        return values;
    }
    
 // ð������
    public void mpNums(List<Integer> a) {
        for (int n = 0; n < a.size(); n++) {
        	    int i=0;
                for (int m = 0; m < a.size()-n-1; m++){
                        if (a.get(m).compareTo(a.get(m+1))==1){ 
                            Integer t = a.get(m);
                            a.set(m, a.get(m+1));
                            a.set(m + 1, t);
                            i=1;
                            }
                }
                if(i==0)
                	break;
    }
    }
      
    // ѡ������
    public void xzNums(List<Integer> a) {
        for (int k = 0;k < a.size(); k++)
            for(int l = k + 1; l < a.size(); l++)
                if (a.get(k).compareTo(a.get(l))==1){ 
                    Integer t = a.get(k);
                    a.set(k, a.get(l));
                    a.set(l, t);
                    }
    }
    
    public static void main(String[] args) {
        /*int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
        Node roots = new Node();
        for (int number : randoms) {
            roots.add(number);
        }
        System.out.println(roots.values());
    }*/
		Node node = new Node(); 
        List<Integer> a = new ArrayList<>();
        // ��������
        node.nums(a);
        
        long start = System.currentTimeMillis();
        for (int c: a)
            node.add(c); 
        long start1 = System.currentTimeMillis();
        // ��������������
        node.values();
        long end = System.currentTimeMillis();
        System.out.printf("������������ʱ%d��������ʱ%d���ܹ���ʱ %d ���� %n", start1-start, end-start1, end - start);
        
        start = System.currentTimeMillis();
        // ð����������
        node.mpNums(a);
        end = System.currentTimeMillis();
        System.out.printf("ð�������ܹ���ʱ %d ���� %n", end - start);
        
        start = System.currentTimeMillis();
        // ѡ����������
        node.xzNums(a);
        end = System.currentTimeMillis();
        System.out.printf("ѡ�������ܹ���ʱ %d ���� %n", end - start);
    }
}
