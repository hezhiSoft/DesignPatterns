package com.jg.strategy.behavior;

import com.jg.strategy.behavior.QuackBehavior;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/8/31$ 下午2:30$
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class Gua implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("我会呱呱叫...");
    }
}
