package com.koo.loomis.playground.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.iterator
 * @ClassName: DeliveryAggregate
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 11:11
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 11:11
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class DeliveryAggregate implements Aggregate {
    /**
     * 内部使用list来存储数据
     */
    private List<String> list = new ArrayList<>();

    @Override
    public int size() {
        //容器大小
        return list.size();
    }

    @Override
    public String get(int location) {
        return list.get(location);
    }

    @Override
    public void add(String tel) {
        list.add(tel);
    }

    @Override
    public void remove(String tel) {
        list.remove(tel);
    }

    @Override
    public Iterator iterator() {
        //返回迭代器
        return new DeliveryIterator(this);
    }
}