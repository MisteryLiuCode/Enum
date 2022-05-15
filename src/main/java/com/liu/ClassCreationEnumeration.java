package com.liu;

/**
 * @program: Enum
 * @description: 使用类进行创建枚举
 * @author: 刘帅彪
 * @create: 2022-05-15 11:21
 **/


public class ClassCreationEnumeration {
    public static void main(String[] args) {
        Season spring = new Season("春天", "温暖");
        Season summer = new Season("夏天", "炎热");
        Season autumn = new Season("春天", "凉爽");
        Season winter = new Season("冬天", "寒冷");
        /*
        存在的问题：
        1、对于季节，人们普遍认为只有春，夏，秋，冬。这样的方法，构造方法里面可以填写任意内容
        2、对于每个季节，可以使用spring.setName()改变里面的属性，任何人都可以改变里面的属性名称（当然可以不开放set方法）
         */
    }
}
class Season{
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
