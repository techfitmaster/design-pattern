package com.huzhengxing;

/**
 * @author 2020/8/19 16:03  zhengxing.hu
 * @version 1.0.0
 * @file AudiFactory
 * @brief
 * @par
 * @warning
 * @par 杭州锘崴信息科技有限公司版权所有©2020版权所有
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car productCar() {
        return new Audi();
    }
}
