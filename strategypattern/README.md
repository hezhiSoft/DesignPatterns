# 策略模式(Strategy Pattern)
#### 策略模式定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
#### 策略模式UML图

 ![image](https://lh3.googleusercontent.com/Dr3ftsrKtQ-nXFnJG9Cy8d9O-cRhS_kL4hFqA7rAptQOz0KgfRUGfIssvom7hTH7G5XdSw=s157)

##### 可以看到，策略模式中主要有以下几个角色：
###### Strategy 接口，用于定义算法的固定套路
###### ConcreteStrategyA , …..B , 等具体算法实现类
###### Context 外部调用类

Context 中引用的是 接口，因此当更换具体实现时，Context 不用修改代码，这就是针对接口编程的好处。

# Demo需求
    1、红头鸭：会飞,会呱呱叫,会游泳
    2、绿头鸭：会飞，会呱呱叫，会游泳
    3、模型鸭：不会飞，不会呱呱叫，不会游泳