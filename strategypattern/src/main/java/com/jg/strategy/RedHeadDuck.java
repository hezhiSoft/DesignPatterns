package com.jg.strategy;

import com.jg.strategy.behavior.FlyWithWings;
import com.jg.strategy.behavior.Gua;
import com.jg.strategy.behavior.SwimmingInWater;

/**
 * 红头鸭
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/8/21$ 下午9:25$
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class RedHeadDuck extends Duck {

    RedHeadDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Gua());
        setSwimBehavior(new SwimmingInWater());
    }

    @Override
    void display() {
        System.out.println("我是红头鸭...");
    }

}
