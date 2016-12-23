package com.ares.builderpatterns.two;

/**
 * # Builder模式的变种
 * Created by Ares on 2016/12/23.
 */

public class User2 {

    private String mFirstName; //必选
    private String mLastName;  //必选
    private String mGender;    //可选
    private int mAge;          //可选
    private String mPhoneNo;   //可选

    public String getmFirstName() {
        return mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public String getmGender() {
        return mGender;
    }

    public int getmAge() {
        return mAge;
    }

    public String getmPhoneNo() {
        return mPhoneNo;
    }

}
