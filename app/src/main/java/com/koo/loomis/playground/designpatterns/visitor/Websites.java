package com.koo.loomis.playground.designpatterns.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.visitor
 * @ClassName: Websites
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 11:42
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 11:42
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Websites {
    /**
     * 元素集合
     */
    List<Web> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        Iterator<Web> iterator = list.iterator();
        //迭代遍历访问
        while (iterator.hasNext()) {
            iterator.next()
                    .accept(visitor);
        }
    }

    public void addWeb(Web web) {
        list.add(web);
    }
}
