package com.example.main;

import android.app.Activity;

import com.example.R;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @Bean
    MainPresenter presenter;
}
