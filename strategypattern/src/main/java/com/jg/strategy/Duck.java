package com.jg.strategy;

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


    /**
     *每个鸭子外观不一样，由子类实现
     * 
     *author: hezhiWu
     *created at 2017/8/21 下午9:26
     */
    abstract void display();
    
    /**
     *鸭子行为-叫
     * 
     *author: hezhiWu
     *created at 2017/8/21 下午9:18
     */
    public void quack(){
        System.out.println("所有鸭子都会叫...");
    }
    
    /**
     *鸭子行为-游泳
     * 
     *author: hezhiWu
     *created at 2017/8/21 下午9:19
     */
    public void swim(){
        System.out.println("所有鸭子都会游泳...");
    }
}
