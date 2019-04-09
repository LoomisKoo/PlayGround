package com.koo.loomis.playground.designpatterns;

/**
 * @ProjectName: OtherTest
 * @Package: com.koo.loomis.othertest.designpatterns
 * @ClassName: Builder
 * @Description: java类作用描述    Builder模式
 * @Author: koo
 * @CreateDate: 2019/4/8 11:01
 * @UpdateUser:
 * @UpdateDate: 2019/4/8 11:01
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Builder {
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 身高
     */
    private String height;
    /**
     * 体重
     */
    private String weight;
    /**
     * 爱好
     */
    private String hobby;

    private Builder(InnerBuilder innerBuilder) {
        this.name = innerBuilder.name;
        this.gender = innerBuilder.gender;
        this.height = innerBuilder.height;
        this.weight = innerBuilder.weight;
        this.hobby = innerBuilder.hobby;
    }


    public static class InnerBuilder {
        /**
         * 姓名
         */
        private String name;
        /**
         * 性别
         */
        private String gender;
        /**
         * 身高
         */
        private String height;
        /**
         * 体重
         */
        private String weight;
        /**
         * 爱好
         */
        private String hobby;

        public InnerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public InnerBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public InnerBuilder setHeight(String height) {
            this.height = height;
            return this;
        }

        public InnerBuilder setWeight(String weight) {
            this.weight = weight;
            return this;
        }

        public InnerBuilder setHobby(String hobby) {
            this.hobby = hobby;
            return this;
        }

        public Builder build() {
            return new Builder(this);
        }
    }

    @Override
    public String toString() {
        System.out.println("name:" + name + "   gender:" + gender + "   height:" + height + "   weight:" + "   hobby:" + hobby);
        return super.toString();
    }
}
