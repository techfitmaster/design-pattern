package com.huzhengxing.dependence_inversion;

/**
 * @Auther: Albert
 * @Date: 2019/12/21 20:18
 * @Contact: 1092144169@qq.com
 * @Description:
 */
public class Albert implements Person {

    public void playGame(Game game) {
        System.out.println("ablert play game");
    }

    public void drive(Car car) {
        car.run();
        System.out.println("ablert drive");
    }
}
