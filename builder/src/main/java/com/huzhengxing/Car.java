package com.huzhengxing;

/**
 * @Auther: Albert
 * @Date: 2019/12/26 22:12
 * @Contact: 1092144169@qq.com
 * @Description: 一个车的产品,汽车三大件
 */
public interface Car {

    /**
     * 发动机
     */
    void engine(String engine);

    /**
     * 变速箱
     */
    void gearbox(String gearbox);

    /**
     * 底盘
     */
    void chassis(String chassis);

}
