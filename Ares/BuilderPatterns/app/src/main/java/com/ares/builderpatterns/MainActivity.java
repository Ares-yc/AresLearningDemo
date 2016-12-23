package com.ares.builderpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ares.builderpatterns.two.User3;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User3 user = new User3.UserBuilder("ares","yc")
                .gender("Man")
                .age(24)
                .phoneNo("110")
                .build();
    }
}
