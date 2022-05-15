package com.liu.Enum;

public enum Season {
    /*
    使用语法：
    1、自定义的常量对象必须放在前面
    2、常量之间使用逗号，而不是分号
     */
    SPRING("春天","描述"),
    SUMMER("春天","描述"),
    AUTUMN("春天","描述"),
    WINTER("春天","描述");


    private String name;
    private String desc;
    private Season(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
class Test{
    public static void main(String[] args) {
        System.out.println(Season.SPRING.getName());
    }
}
