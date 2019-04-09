package com.koo.loomis.playground.designpatterns.iterator;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.iterator
 * @ClassName: Iterator
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 11:08
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 11:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Iterator {
    /**
     * 是否存在下一条记录
     */
    boolean hasNext();

    /**
     * 返回当前记录并移到下一条记录
     */
    Object next();
}