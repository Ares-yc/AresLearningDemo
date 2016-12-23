package com.ares.builderpatterns.one;

/**
 * # 经典的Builder模式
 *   Builder接口的具体实现B
 *   实际构建Product对象的地方
 * Created by Ares on 2016/12/23.
 */

public class ConcreteBuilderB implements Builder {

    private Product product;

    @Override
    public void buildPartOne() {

    }

    @Override
    public void buildPartTwo() {

    }

    @Override
    public Product getProduct() {
        return product;
    }
}
