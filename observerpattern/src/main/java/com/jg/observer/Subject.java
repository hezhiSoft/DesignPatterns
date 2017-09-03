package com.jg.observer;

/**
 * 定义主题
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/8/31$ 下午9:47$
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public interface Subject {

    /**
     * 注册观察者
     * <p>
     * author: hezhiWu
     * created at 2017/8/31 下午9:50
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     * <p>
     * author: hezhiWu
     * created at 2017/8/31 下午9:49
     */
    void removeObserver(Observer observer);

    /**
     * 当主题改变时，这个方法会被调用，以通知所有的观察者
     * <p>
     * author: hezhiWu
     * created at 2017/8/31 下午9:49
     */
    void notifyObserver();
}
