package com.huzhengxing;

/**
 * @Auther: Albert
 * @Date: 2019/12/26 22:23
 * @Contact: 1092144169@qq.com
 * @Description:
 */
public class BWMBuilder extends CarBuilder {


    public void buildEngine() {
        car.chassis();
    }

    public void buildGearbox() {
        car.gearbox();
    }

    public void buildChassis() {
        car.chassis();
    }

}
