package List;

import java.util.ArrayList;
import java.util.List;

public class Node <T extends Comparable> {
	// 左子节点
    public Node<T> leftNode;
    // 右子节点
    public Node<T> rightNode;
    // 值
    public T value;
    // 插入 数据  
    public void nums(List<Integer> a){
        // 随机生成4万个数
        for (int i = 0; i <40000; i++) {
            int num = (int) (Math.random()*(999 + 1));
            a.add(num);
        }   
    }
    public void add(T v) {
        // 如果当前节点没有值，就把数据放在当前节点上
        if (null == value)
            value = v;
        // 如果当前节点有值，就进行判断，新增的值与当前值的大小关系
        else {
            // 新增的值，比当前值小或者相同
            if ((Integer) v -((Integer)value) <= 0) {
                if (null == leftNode)
                    leftNode = new Node<>();
                leftNode.add(v);
            }
            // 新增的值，比当前值大
            else {
                if (null == rightNode)
                    rightNode = new Node<>();
                rightNode.add(v);
            }
        }
    }
 // 中序遍历所有的节点
    public List<T> values() {
        List<T> values = new ArrayList<>();
        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());
        // 当前节点
        values.add( value);
        // 右节点的遍历结果
        if (null != rightNode)
            values.addAll(rightNode.values());
        return values;
    }
    
 // 冒泡排序
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
      
    // 选择排序
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
        // 插入数据
        node.nums(a);
        
        long start = System.currentTimeMillis();
        for (int c: a)
            node.add(c); 
        long start1 = System.currentTimeMillis();
        // 二叉树排序性能
        node.values();
        long end = System.currentTimeMillis();
        System.out.printf("二叉树创建用时%d，排序用时%d，总共耗时 %d 毫秒 %n", start1-start, end-start1, end - start);
        
        start = System.currentTimeMillis();
        // 冒泡排序性能
        node.mpNums(a);
        end = System.currentTimeMillis();
        System.out.printf("冒泡排序总共耗时 %d 毫秒 %n", end - start);
        
        start = System.currentTimeMillis();
        // 选择排序性能
        node.xzNums(a);
        end = System.currentTimeMillis();
        System.out.printf("选择排序总共耗时 %d 毫秒 %n", end - start);
    }
}
