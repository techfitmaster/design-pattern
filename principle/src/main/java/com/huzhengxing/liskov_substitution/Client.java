package com.huzhengxing.liskov_substitution;

/**
 * @Auther: Albert
 * @Date: 2019/12/21 19:50
 * @Contact: 1092144169@qq.com
 * @Description:
 */
public class Client {


    public static void main(String[] args) {
//        Father var = new Father();
        Father var = new Son();
        var.doSomething();
    }
}
