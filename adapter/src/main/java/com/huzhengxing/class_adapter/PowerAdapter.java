package com.huzhengxing.class_adapter;

/**
 * @Auther: Albert
 * @Date: 2019/12/23 22:00
 * @Contact: 1092144169@qq.com
 * @Description: 模拟一个电源适配器,Target是给笔记充电，Adaptee是电，适配器是电源适配器
 */
public class PowerAdapter extends PowerImpl implements Notebook {

    public void charge() {
        super.chargePower();
    }

    public static void main(String[] args) {
        Notebook notebook = new PowerAdapter();
        notebook.charge();
    }
}
