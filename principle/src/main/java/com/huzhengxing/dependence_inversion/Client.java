package com.huzhengxing.dependence_inversion;

import org.jmock.integration.junit4.JUnit4Mockery;

/**
 * @Auther: Albert
 * @Date: 2019/12/21 20:16
 * @Contact: 1092144169@qq.com
 * @Description:
 */
public class Client {


    public static void main(String[] args) {
        Person person = new Albert();
        JUnit4Mockery mockery = new JUnit4Mockery();
        Car bwm = new BWM();
        Car car = mockery.mock(Car.class);
        person.drive(bwm);
    }

}
