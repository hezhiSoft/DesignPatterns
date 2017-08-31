package com.jg.strategy.behavior;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/8/31$ 下午4:25$
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class SwimmingInWater implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("我会在水里游...");
    }
}
