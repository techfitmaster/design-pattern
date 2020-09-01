package com.huzhengxing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 2020/8/19 16:04  zhengxing.hu
 * @version 1.0.0
 * @file Test
 * @brief
 * @par
 * @warning
 * @par 杭州锘崴信息科技有限公司版权所有©2020版权所有
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        CarFactory bwmFactory = new BWMFactory();
        bwmFactory.productCar().drive();
        new AudiFactory().productCar().drive();

        //源码使用
        String url = "";
        Connection connection = DriverManager.getConnection(url);
        
    }
}
