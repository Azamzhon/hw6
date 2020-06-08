package com.geektech.hw6;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements IShowText {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new TextViewFragment(), "TAG")
                .add(R.id.container1, new ButtonsFragment(), "TAG1")
                .commit();
    }


    @Override
    public void showText(String s) {
        TextViewFragment textViewFragment = (TextViewFragment) getSupportFragmentManager().findFragmentByTag("TAG");
        assert textViewFragment != null;
        textViewFragment.showText(s);
    }

    @Override
    public String getText() {
        TextViewFragment textViewFragment = (TextViewFragment) getSupportFragmentManager().findFragmentByTag("TAG");
        assert textViewFragment != null;
        return textViewFragment.getTextView().getText().toString();
    }
}