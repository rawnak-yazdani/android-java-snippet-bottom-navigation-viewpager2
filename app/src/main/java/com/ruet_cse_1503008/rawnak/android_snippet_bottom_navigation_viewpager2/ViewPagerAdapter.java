package com.ruet_cse_1503008.rawnak.android_snippet_bottom_navigation_viewpager2;

//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jaison on 23/10/16.
 */


//public class ViewPagerAdapter extends FragmentStatePagerAdapter {
//    private final List<Fragment> mFragmentList = new ArrayList<>();
//
//    public ViewPagerAdapter(FragmentManager manager) {
//        super(manager);
//    }
//    @Override
//    public Fragment getItem(int position) {
//        return mFragmentList.get(position);
//    }
//
//    @Override
//    public int getCount() {
//        return mFragmentList.size();
//    }
//
//    public void addFragment(Fragment fragment) {
//        mFragmentList.add(fragment);
//    }
//
//}

public class ViewPagerAdapter extends FragmentStateAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();

//        public ViewPagerAdapter(FragmentManager fm, Lifecycle b ) {
//            super(fm,b);
//
//        }

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, Lifecycle b ) {
        super(fragmentManager,b);
    }
//        public ViewPagerAdapter(@NonNull FragmentManager fm,
//                                    int behavior) {
//            super(fm,behavior);
//        }

//        @Override
//        public Fragment getItem(int position) {
//            return mFragmentList.get(position);
//        }

//        @Override
//        public int getCount() {
//            return mFragmentList.size();
//        }

    public void addFragment(Fragment fragment) {
        mFragmentList.add(fragment);
    }





    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        return mFragmentList.size();
    }

}
