package com.example.main;

import android.support.v7.app.ActionBarActivity;

import com.example.R;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends ActionBarActivity {

    @Bean
    MainPresenter presenter;
}
