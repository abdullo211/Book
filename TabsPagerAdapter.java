package com.application.book;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.application.book.Settings.SettingFragment;

public class TabsPagerAdapter extends FragmentPagerAdapter {


    public SettingFragment settingFragment = new SettingFragment();
    public BookmarkFragment bookmarkFragment = new BookmarkFragment();
    public Info info = new Info();

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return info;
            case 1:
                return settingFragment;
            case 2:
                return bookmarkFragment;

        }


        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
