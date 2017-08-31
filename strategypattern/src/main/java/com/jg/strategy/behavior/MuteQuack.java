package com.jg.strategy.behavior;


/**
 * 不会叫行为
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/8/31$ 下午2:29$
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("我不会呱呱叫...");
    }
}
