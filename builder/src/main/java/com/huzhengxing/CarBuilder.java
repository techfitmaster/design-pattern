package com.huzhengxing;

/**
 * @Auther: Albert
 * @Date: 2019/12/26 22:20
 * @Contact: 1092144169@qq.com
 * @Description: 车部件的建造者
 */
public abstract class CarBuilder {

    public Car car;

    void setCar(Car car) {
        this.car = car;
    }

    abstract void buildEngine();

    abstract void buildGearbox();

    abstract void buildChassis();

    Car getCar() {
        return car;
    }
}
