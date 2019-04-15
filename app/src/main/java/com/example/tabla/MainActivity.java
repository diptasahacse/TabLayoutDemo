package com.example.tabla;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tablayoutid);
        viewPager = findViewById(R.id.viewpagerid);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }
    class MyPagerAdapter extends FragmentPagerAdapter{
        String item[]={"Fashion","Phone","Laptop","Watch","Wallet"};


        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            if(i == 0)
            {
                return new FashionFrag();
            }
            if(i == 1)
            {
                return new MobileFrag();
            }
            if(i == 2)
            {
                return new LaptopFrag();
            }
            if(i == 3)
            {
                return new WatchFrag();
            }
            if(i == 4)
            {
                return new WalletFrag();
            }


            return null;
        }

        @Override
        public int getCount() {
            return item.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return item[position];
        }
    }
}
