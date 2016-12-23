package com.ares.builderpatterns.one;

/**
 * # 经典的Builder模式
 *   被构造的复杂对象
 * Created by Ares on 2016/12/23.
 */

public class Product {

    private String partOne;
    private String partTwo;

    public String getPartOne() {
        return partOne;
    }

    public void setPartOne(String partOne) {
        this.partOne = partOne;
    }

    public String getPartTwo() {
        return partTwo;
    }

    public void setPartTwo(String partTwo) {
        this.partTwo = partTwo;
    }
}
