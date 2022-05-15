# Enum
# 枚举

## 什么是枚举

枚举：枚举是指有穷序列集的所有成员的程序，比如星期，只有星期一到星期日，季节，只有春夏秋冬等。

## 为什么需要枚举

枚举的重点在于有穷，而且这些是比较固定的，不希望被人任意设置。假如是在一个类之中，一般使用private static final来表示，但这有一个问题是，他只能使用在单个类文件中，可以使用在短信接口的账号密码等云上服务时，通常会要求提供账号密码进行验签，但是它无法使用在全局之中。 

### 传统的实现

对于单个文件，一般使用 private static final，对于全局，一般使用类。

## 传统方式代码实现

创建一个季节对象，传统的写法是创建一个季节类，两个属性，季节名称和描述。

![image-20220515111457523](https://misteryliu.oss-cn-beijing.aliyuncs.com/image/image-20220515111457523.png)

### 使用类进行创建

![image-20220515114020270](https://misteryliu.oss-cn-beijing.aliyuncs.com/image/image-20220515114020270.png)

### 存在的问题

1. 对于季节，人们普遍认为只有春，夏，秋，冬。这样的方法，构造方法里面可以填写任意内容
2. 对于每个季节，可以使用spring.setName()改变里面的属性，任何人都可以改变里面的属性名称（当然可以不开放set方法）

枚举

## 自定义枚举解决上述问题

使用自定义枚举要满足的要求：

1. 属性要写死再类里面，程序员直接拿来用，不能让程序员自定义，把构造方法私有化。
2. 不能让程序员修改对象里面的属性，把set方法关闭

### 代码：

![image-20220515134056702](https://misteryliu.oss-cn-beijing.aliyuncs.com/image/image-20220515134056702.png)

上述方法可以实现所有的要求，也许枚举类的出现只是简化了上面这种方式。

1. 简化定义变量
2. 不再需要toString方法就可以输出属性
3. 作为标识，看到enum类就知道这里面的属性是全局的，而且基本是不变的。

## 枚举类实现

![image-20220515134803401](https://misteryliu.oss-cn-beijing.aliyuncs.com/image/image-20220515134803401.png)

## 枚举底层

使用javap反编译enum对象

![image-20220515135702177](https://misteryliu.oss-cn-beijing.aliyuncs.com/image/image-20220515135702177.png)

可以看出来：

1. 里面的属性仍然转化成了public static final
2. 里面默认内置了toString方法
3. 这个类是一个final类，不能被继承，并且继承了Enum类

## 全文代码地址
https://github.com/MisteryLiuCode/Enum


