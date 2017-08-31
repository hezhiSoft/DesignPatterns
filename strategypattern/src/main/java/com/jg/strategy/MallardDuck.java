package com.jg.strategy;

import com.jg.strategy.behavior.FlyWithWings;
import com.jg.strategy.behavior.Gua;
import com.jg.strategy.behavior.MuteQuack;
import com.jg.strategy.behavior.SwimmingInWater;

/**
 * 绿头鸭
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/8/24$ 下午8:34$
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class MallardDuck extends Duck{

    MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Gua());
        setSwimBehavior(new SwimmingInWater());
    }

    @Override
    void display() {
        System.out.println("我是绿头鸭...");
    }
}
