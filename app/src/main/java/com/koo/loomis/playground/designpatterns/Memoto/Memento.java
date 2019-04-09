package com.koo.loomis.playground.designpatterns.Memoto;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.Memoto
 * @ClassName: Memento
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 11:23
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 11:23
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Memento {//备忘录类
    public int level;//等级
    public int coin;//金币数量

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getLevel() {
        return level;
    }

    public int getCoin() {
        return coin;
    }
}