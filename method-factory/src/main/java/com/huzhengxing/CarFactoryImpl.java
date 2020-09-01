package com.huzhengxing;

/**
 * @author 2020/8/19 18:29  zhengxing.hu
 * @version 1.0.0
 * @file CarFactoryImpl
 * @brief
 * @par
 * @warning
 * @par 杭州锘崴信息科技有限公司版权所有©2020版权所有
 */
public class CarFactoryImpl implements CarFactory{

    @Override
    public Car productCar() {
       return null;
    }

    @Override
    public <T extends Car> T create(Class<T> c) {
        Car car = null;
        try {
            car = (Car) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
