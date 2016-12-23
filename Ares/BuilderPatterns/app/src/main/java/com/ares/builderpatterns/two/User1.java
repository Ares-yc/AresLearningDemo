package com.ares.builderpatterns.two;

/**
 * # Builder模式的变种
 * Created by Ares on 2016/12/23.
 */

public class User1 {

    private final String mFirstName; //必选
    private final String mLastName;  //必选
    private final String mGender;    //可选
    private final int mAge;          //可选
    private final String mPhoneNo;   //可选

    public User1(String mFirstName, String mLastName) {
        this(mFirstName,mLastName,"");
    }

    public User1(String mFirstName, String mLastName, String mGender) {
        this(mFirstName,mLastName,mGender,0);
    }

    public User1(String mFirstName, String mLastName, String mGender, int mAge) {
        this(mFirstName,mLastName,mGender,mAge,"");
    }

    public User1(String mFirstName, String mLastName, String mGender, int mAge, String mPhoneNo) {
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
        this.mGender = mGender;
        this.mAge = mAge;
        this.mPhoneNo = mPhoneNo;
    }
}
