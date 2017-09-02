package com.example.aishwarya.myapplication.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.example.aishwarya.myapplication.R;
import com.example.aishwarya.myapplication.adapter.ViewPagerAdapter;
import com.example.aishwarya.myapplication.common.BaseActivity;

public class HomeScreenActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        setStatusBarColor(this);
        initToolBar();
        setToolBarTitle(getString(R.string.home));
        initTabs();
    }

    private void initTabs() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        if (tabLayout != null) {
            tabLayout.setTabMode(TabLayout.MODE_FIXED);
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
            tabLayout.setupWithViewPager(viewPager);
        }
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }


}
