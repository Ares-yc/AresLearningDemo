package com.ares.builderpatterns.two;

/**
 * # 插件InnerBuilder生成，只需确定成员变量即可
 * Created by Ares on 2016/12/23.
 */

public class User4 {

    private final String mFirstName; //必选
    private final String mLastName;  //必选
    private final String mGender;    //可选
    private final int mAge;          //可选
    private final String mPhoneNo;   //可选

    private User4(Builder builder) {
        mFirstName = builder.mFirstName;
        mLastName = builder.mLastName;
        mGender = builder.mGender;
        mAge = builder.mAge;
        mPhoneNo = builder.mPhoneNo;
    }


    public static final class Builder {
        private String mFirstName;
        private String mLastName;
        private String mGender;
        private int mAge;
        private String mPhoneNo;

        public Builder() {
        }

        public Builder mFirstName(String val) {
            mFirstName = val;
            return this;
        }

        public Builder mLastName(String val) {
            mLastName = val;
            return this;
        }

        public Builder mGender(String val) {
            mGender = val;
            return this;
        }

        public Builder mAge(int val) {
            mAge = val;
            return this;
        }

        public Builder mPhoneNo(String val) {
            mPhoneNo = val;
            return this;
        }

        public User4 build() {
            return new User4(this);
        }
    }
}
