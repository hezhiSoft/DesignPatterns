package com.jg.strategy;

/**
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/8/21$ 下午9:23$
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class StrategyPatternTest {

    public static void main(String args[]){
        RedHeadDuck redHeadDuck=new RedHeadDuck();
        redHeadDuck.quack();
        redHeadDuck.display();

    }
}
