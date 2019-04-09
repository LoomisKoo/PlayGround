package com.koo.loomis.playground.designpatterns.iterator;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.iterator
 * @ClassName: DeliveryIterator
 * @Description: java类作用描述   快递迭代类
 * @Author: koo
 * @CreateDate: 2019/4/9 11:10
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 11:10
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class DeliveryIterator implements Iterator {
    /**
     * 容器对象
     */
    private Aggregate aggregate;
    /**
     * 当前索引
     */
    private int       index;

    public DeliveryIterator(Aggregate aggregate) {
        //初始化容器对象
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        //是否存在下一条记录
        if (index < aggregate.size()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Object next() {
        //返回当前记录并移到下一条记录
        return aggregate.get(index++);
    }
}