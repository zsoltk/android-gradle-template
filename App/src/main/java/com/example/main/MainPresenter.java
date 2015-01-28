package com.example.main;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

@EBean
public class MainPresenter {

    @RootContext
    MainActivity view;
}
