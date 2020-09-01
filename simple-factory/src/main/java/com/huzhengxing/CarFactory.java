package com.huzhengxing;

/**
 * @author 2020/8/19 15:19  zhengxing.hu
 * @version 1.0.0
 * @file CarFactory
 * @brief
 * @par
 * @warning
 * @par 杭州锘崴信息科技有限公司版权所有©2020版权所有
 */
public class CarFactory {

    public CarFactory() {
    }

    public Car productCar(String carName) {
        switch (carName) {
            case "BWM":
                return new BWM();
            case "Audi":
                return new Audi();
            default:
                return null;
        }
    }

}
