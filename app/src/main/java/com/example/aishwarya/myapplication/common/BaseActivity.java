package com.example.aishwarya.myapplication.common;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.aishwarya.myapplication.R;

public class BaseActivity extends AppCompatActivity {
    private static final String TAG = BaseActivity.class.getSimpleName();


    /**
     * function that sets toolbar text
     * @param title text to be displayed
     */
    public void setToolBarTitle(String title) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(getSupportActionBar() != null)
            getSupportActionBar().setTitle("");
        TextView titleView = (TextView) toolbar.findViewById(R.id.tv_toolbar_title);
        titleView.setText(title);
        titleView.setTextColor(Color.WHITE);
    }

    /**
     * function that initialises the toolbar
     */

    public void initToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /**
     * Function used to set the status bar color
     */

    public void setStatusBarColor(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            int color = ContextCompat.getColor(context, R.color.colorPrimaryDark);
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(color);
        }
    }


}
