package com.koo.loomis.playground.designpatterns;

import java.util.ArrayList;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns
 * @ClassName: Prototype
 * @Description: java类作用描述   原型模式
 * @Author: koo
 * @CreateDate: 2019/4/8 11:14
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 11:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Prototype implements Cloneable {
    /**
     * 文本
     */
    private String text;

    /**
     * 图片
     */
    private ArrayList<String> images = new ArrayList<>();

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public Prototype clone() {
        try {
            Prototype document = (Prototype) super.clone();
            document.text = this.text;
            document.images = (ArrayList<String>) images.clone();
            return document;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    /**
     * 打印内容
     */
    public void show() {
        System.out.println("Text : " + text);
        System.out.println("imgs: ");
        for (String name : images) {
            System.out.println("image name : " + name);
        }
    }
}
