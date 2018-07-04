package com.mireya.eventsandroid.domain.account.addmenu.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mireya.eventsandroid.R;

public class AddMenu extends AppCompatActivity implements AddMenuView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_menu);
    }
}
