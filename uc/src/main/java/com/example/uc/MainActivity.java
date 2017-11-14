package com.example.uc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import adapter.ViewPagerAdapter;
import fragments.BaseFragment;
import fragments.FragmentA;
import fragments.FragmentB;
import fragments.FragmentC;

public class MainActivity extends AppCompatActivity {

    private List<Fragment> mFragments;

    private FragmentManager mFragmentManager;

    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initData();
    }

    private void initViews() {

        mViewPager = (ViewPager) findViewById(R.id.viewPager);

    }

    private void initData() {
        mFragmentManager = getSupportFragmentManager();
        mFragments = new ArrayList<>();
        mFragments.add(new FragmentA());
        mFragments.add(new FragmentB());
        mFragments.add(new FragmentC());
        mViewPagerAdapter = new ViewPagerAdapter(mFragmentManager, mFragments);
        mViewPager.setAdapter(mViewPagerAdapter);
    }
}
