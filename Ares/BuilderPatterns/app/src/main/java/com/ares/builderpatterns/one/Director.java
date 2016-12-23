package com.ares.builderpatterns.one;

/**
 * # 经典的Builder模式
 *   Builder接口的构造者和使用者
 * Created by Ares on 2016/12/23.
 */

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.buildPartOne();
        this.builder.buildPartTwo();
    }

    public Product getProduct(){
        return this.builder.getProduct();
    }
}
