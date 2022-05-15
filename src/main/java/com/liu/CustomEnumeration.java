package com.liu;

/**
 * @program: Enum
 * @description: 自定义枚举
 * @author: 刘帅彪
 * @create: 2022-05-15 12:05
 **/


public class CustomEnumeration {
    public static void main(String[] args) {
        Season02.AUTUMN.getDesc();
    }




}
class Season02{
    private  String name;
    protected  String desc;
//    final代表不可改变，static代表可以直接通过对象.访问
    public final static Season02 SPRING=new Season02("春天","描述");
    public final static Season02 SUMMER=new Season02("夏天","描述");
    public final static Season02 AUTUMN=new Season02("秋天","描述");
    public final static Season02 WINTER=new Season02("冬天","描述");
    /*
    有参构造方法设置为私有
    属性写死在内部
    外部只能使用这几个属性，不能修改
     */
    private  Season02(String name,String desc){
        this.name=name;
        this.desc=desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season02{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
