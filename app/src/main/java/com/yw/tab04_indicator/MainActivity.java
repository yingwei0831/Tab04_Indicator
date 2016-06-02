package com.yw.tab04_indicator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.viewpagerindicator.TabPageIndicator;

import java.util.List;

public class MainActivity extends FragmentActivity {

    private ViewPager mViewPager;
    private TabAdapter mAdapter;

    private List<Fragment> mFragments;

    private TabPageIndicator mTabPageIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();

    }

    private void initView() {
        mViewPager = (ViewPager)findViewById(R.id.viewpager);
        mAdapter = new TabAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);

        mTabPageIndicator = (TabPageIndicator)findViewById(R.id.id_indicator);
        mTabPageIndicator.setViewPager(mViewPager, 0);
    }

    private void initEvent() {

    }
}
