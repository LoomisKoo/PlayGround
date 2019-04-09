package com.koo.loomis.playground.designpatterns.bridge;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.bridge
 * @ClassName: Student
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 17:06
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 17:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Student extends Person {

    @Override
    public void dress() {
        System.out.println("学生穿上" + mClothes.getName());
    }
}
