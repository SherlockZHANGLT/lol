package List;

import java.util.ArrayList;
import java.util.List;

import lol.ADHero;

public class HeroNode {
	// 左子节点
    public HeroNode leftNode;
    // 右子节点
    public HeroNode rightNode;
    // 值
    public ADHero h;
    // 插入 数据
    
    public void add(ADHero adh) {
        // 如果当前节点没有值，就把数据放在当前节点上
        if (null == h)
            h = adh;
        // 如果当前节点有值，就进行判断，新增的值与当前值的大小关系
        else {
            // 新增的值，比当前值小或者相同
            if (adh.getHp() -h.getHp() <= 0) {
                if (null == leftNode)
                    leftNode = new HeroNode();
                leftNode.add(adh);
            }
            // 新增的值，比当前值大
            else {
                if (null == rightNode)
                    rightNode = new HeroNode();
                rightNode.add(adh);
            }
        }
    }
    
    public List<Object> values() {
        List<Object> values = new ArrayList<>();
        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());
        // 当前节点
        values.add(h.getHp());
        // 右节点的遍历结果
        if (null != rightNode)
            values.addAll(rightNode.values());
        return values;
    }
    public List<Object> name() {
        List<Object> values = new ArrayList<>();
        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.name());
        // 当前节点
        values.add(h.getName());
        // 右节点的遍历结果
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
