package com.jg.strategy.behavior;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/8/31$ 下午4:27$
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class SwimmingNotWater implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("我不会在水里游...");
    }
}
