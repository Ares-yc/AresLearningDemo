package com.ares.builderpatterns.two;

/**
 * # Builder模式的变种
 * Created by Ares on 2016/12/23.
 */

public class User3 {

    private final String mFirstName; //必选
    private final String mLastName;  //必选
    private final String mGender;    //可选
    private final int mAge;          //可选
    private final String mPhoneNo;   //可选

    private User3(UserBuilder builder){
        mFirstName = builder.firstName;
        mLastName = builder.lastName;
        mGender = builder.gender;
        mAge = builder.age;
        mPhoneNo = builder.phoneNo;
    }

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

    public static class UserBuilder{

        private final String firstName;
        private final String lastName;
        private String gender;
        private int age;
        private String phoneNo;

        public UserBuilder(String firstName,String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder gender(String gender){
            this.gender = gender;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder phoneNo(String phoneNo){
            this.phoneNo = phoneNo;
            return this;
        }

        public User3 build(){
            return new User3(this);
        }
    }
}
