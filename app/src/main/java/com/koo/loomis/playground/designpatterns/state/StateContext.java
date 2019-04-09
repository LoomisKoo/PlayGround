package com.koo.loomis.playground.designpatterns.state;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.state
 * @ClassName: StateContext
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 10:15
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 10:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class StateContext {
    private PersonState mPersonState;

    public void setPersonState(PersonState personState) {
        mPersonState = personState;
    }

    public void fallInLove() {
        System.out.println("恋爱了,陷入热恋状态:");
        setPersonState(new LoveState());
    }

    public void disappointmentInLove() {
        System.out.println("失恋了,变成单身狗状态:");
        setPersonState(new DogState());
    }

    public void movies() {
        mPersonState.movies();
    }

    public void shopping() {
        mPersonState.shopping();
    }
}