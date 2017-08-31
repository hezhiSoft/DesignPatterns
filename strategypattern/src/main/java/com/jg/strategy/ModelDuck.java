package com.jg.strategy;

import com.jg.strategy.behavior.FlyNoWay;
import com.jg.strategy.behavior.MuteQuack;
import com.jg.strategy.behavior.SwimmingNotWater;

/**
 * 模型鸭
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/8/31$ 下午2:47$
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class ModelDuck extends Duck {
    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
        setSwimBehavior(new SwimmingNotWater());
    }

    @Override
    void display() {
        System.out.println("我是模型鸭...");
    }
}
