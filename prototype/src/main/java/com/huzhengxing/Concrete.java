package com.huzhengxing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: Albert
 * @Date: 2019/12/23 23:56
 * @Contact: 1092144169@qq.com
 * @Description:
 */
public class Concrete implements Cloneable{
    public String var;
    public Set<Long> set;

    @Override
    protected Concrete clone() {
        try {
            return (Concrete) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {
        Concrete concrete = new Concrete();
        concrete.var = "1";
        concrete.set = new HashSet<Long>(Arrays.<Long>asList(1L));
        Concrete concrete1 = concrete.clone();
        concrete1.var = "2";
        Concrete concrete2 = concrete;
        concrete2.var = "3";

        System.out.println(concrete.var);
        System.out.println(concrete1.var);
        System.out.println(concrete2.var);
    }
}
