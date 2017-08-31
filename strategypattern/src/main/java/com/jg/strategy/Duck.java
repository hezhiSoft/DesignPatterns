package com.jg.strategy;

import com.jg.strategy.behavior.FlyBehavior;
import com.jg.strategy.behavior.QuackBehavior;
import com.jg.strategy.behavior.SwimBehavior;

/**
 * 鸭子超类
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/8/21$ 下午9:12$
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public abstract class Duck {

    public Duck(){}

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public SwimBehavior swimBehavior;


    /**
     *每个鸭子外观不一样，由子类实现
     * 
     *author: hezhiWu
     *created at 2017/8/21 下午9:26
     */
    abstract void display();

    /**
     *设置飞行行为
     *
     *author: hezhiWu
     *created at 2017/8/31 下午4:19
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     *设置叫行为
     *
     *author: hezhiWu
     *created at 2017/8/31 下午4:20
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     *设置游泳行为
     *
     *author: hezhiWu
     *created at 2017/8/31 下午4:28
     */
    public void setSwimBehavior(SwimBehavior swimBehavior){
        this.swimBehavior=swimBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performSwim(){
        swimBehavior.swim();
    }


}
