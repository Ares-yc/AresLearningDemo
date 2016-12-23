package com.ares.builderpatterns.one;

/**
 * # 经典的Builder模式
 *   抽象接口
 * Created by Ares on 2016/12/23.
 */

public interface Builder {

    public void buildPartOne();

    public void buildPartTwo();

    public Product getProduct();
}
