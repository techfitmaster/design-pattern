package com.huzhengxing;

import javafx.scene.input.DataFormat;

import javax.crypto.KeyGenerator;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * @author 2020/8/19 15:20  zhengxing.hu
 * @version 1.0.0
 * @file Test
 * @brief
 * @par
 * @warning
 * @par 杭州锘崴信息科技有限公司版权所有©2020版权所有
 */
public class Test {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        //原始 --------------
        BWM bwm = new BWM();
        bwm.drive();
        Audi audi = new Audi();
        audi.drive();

        //使用简单工厂
        /**
         *  特点：
         *  1. 通过参数来获取不痛的实例
         *  2. 直接通过接口调用使用的方法
         *
         *  优点：
         *  1. 客户端只需记得传入参数就行，无需知道哪个实现类
         *  2. 可通过配置参数，实现动态获取不通产品。
         *
         *
         *
         *
         *
         */
        CarFactory carFactory = new CarFactory();
        Car bwm1 = carFactory.productCar("BWM");
        bwm1.drive();
        Car audi1 = carFactory.productCar("Audi");
        audi1.drive();

        //Java 源码
        Calendar.getInstance();
        KeyGenerator deSede = KeyGenerator.getInstance("DESede");
        DateFormat dateInstance = DateFormat.getDateInstance(1);


    }
}
