package com.koo.loomis.playground.designpatterns.iterator;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.iterator
 * @ClassName: Aggregate
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 11:09
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 11:09
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Aggregate {
    /**
     * 容器大小
     */

    int size();

    /**
     * 获取获取中指定位置的号码
     */
    String get(int location);

    /**
     * 添加号码到容器中
     */

    void add(String tel);

    /**
     * 从容器中移除号码
     */
    void remove(String tel);

    /**
     * 返回容器的迭代器
     */

    Iterator iterator();
}
