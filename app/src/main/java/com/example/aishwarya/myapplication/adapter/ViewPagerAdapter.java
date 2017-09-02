package com.example.aishwarya.myapplication.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.aishwarya.myapplication.common.Constants;
import com.example.aishwarya.myapplication.ui.MyBlogFragment;
import com.example.aishwarya.myapplication.ui.VideosListingFragment;

/**
 * Created by techjini on 6/8/17.
 */

public class ViewPagerAdapter  extends FragmentPagerAdapter {


    public static final int NUMBER_OF_TABS = 2;

    public ViewPagerAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case Constants.FIRST_TAB:
                return VideosListingFragment.getInstance();
            case Constants.SECOND_TAB:
                return MyBlogFragment.getInstance();
            default:
                return VideosListingFragment.getInstance();
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_TABS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch(position) {
            case Constants.FIRST_TAB:
                title = "Home";
                break;
            case Constants.SECOND_TAB:
                title = "Blog";
                break;
        }
        return title;
    }
}


