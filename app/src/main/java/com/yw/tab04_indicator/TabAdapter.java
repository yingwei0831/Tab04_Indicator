package com.yw.tab04_indicator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jiahe008 on 2016/5/31.
 */
public class TabAdapter extends FragmentPagerAdapter {

    public static final String[] TITLES = new String[]{"课程","问答","求课","学习","计划"};

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = TabFragment.newInstance(TITLES[position]);
        return fragment;
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }
}
