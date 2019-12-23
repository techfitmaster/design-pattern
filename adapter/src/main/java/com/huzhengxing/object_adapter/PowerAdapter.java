package com.huzhengxing.object_adapter;

import com.huzhengxing.class_adapter.Notebook;
import com.huzhengxing.class_adapter.Power;

/**
 * @Auther: Albert
 * @Date: 2019/12/23 22:07
 * @Contact: 1092144169@qq.com
 * @Description: 类适配
 */
public class PowerAdapter implements Notebook {

    private Power power;

    public PowerAdapter(Power power) {
        this.power = power;
    }

    public void charge() {
        power.chargePower();
    }
}
