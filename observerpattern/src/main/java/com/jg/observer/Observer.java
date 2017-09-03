package com.jg.observer;

/**
 * 所有观察者都必须实现此接口，以实现观察者接口
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/8/31$ 下午9:46$
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public interface Observer {

    /**
     * 当气象观测值改变时，主题会把这些状态值当作方法的参数，传送给观察者
     * <p>
     * author: hezhiWu
     * created at 2017/8/31 下午9:51
     */
    void update(float temp, float humidity, float pressure);
}
