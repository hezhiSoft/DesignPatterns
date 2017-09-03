package com.jg.observer;

/**
 * 订阅者
 * <p>
 * author: hezhiWu <wuhezhi007@gmail.com>
 * version: V1.0
 * created at 2017/8/31$ 下午10:44$
 * <p>
 * Copyright (c) 2017 Shenzhen O&M Cloud Co., Ltd. All rights reserved.
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humi;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject subject) {
        this.weatherData = subject;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humi = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + " F degress and " + humi + "% humidity");
    }
}
