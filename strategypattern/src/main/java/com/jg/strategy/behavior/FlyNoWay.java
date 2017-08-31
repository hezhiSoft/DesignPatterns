package com.jg.strategy.behavior;

import com.jg.strategy.behavior.FlyBehavior;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/8/31$ 下午2:32$
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        //do nothing
        System.out.println("我不会飞...");
    }
}
