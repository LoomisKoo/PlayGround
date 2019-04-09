package com.koo.loomis.playground.designpatterns.combination;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns.combination
 * @ClassName: SafeNode
 * @Description: java类作用描述
 * @Author: koo
 * @CreateDate: 2019/4/9 16:29
 * @UpdateUser:
 * @UpdateDate: 2019/4/9 16:29
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SafeNode extends SafeComponent {
    private static final String              TAG  = SafeNode.class.getSimpleName();
    private              List<SafeComponent> list = new ArrayList<>();

    public SafeNode(String name) {
        super(name);
    }

    @Override
    public void print() {
        Log.d(TAG, name);
        for (SafeComponent safeComponent : list) {
            safeComponent.print();
        }
    }

    public void addChild(SafeComponent safeComponent) {
        list.add(safeComponent);
    }

    public void removeChild(SafeComponent safeComponent) {
        list.remove(safeComponent);
    }

    public SafeComponent getChild(int index) {
        return list.get(index);
    }
}
