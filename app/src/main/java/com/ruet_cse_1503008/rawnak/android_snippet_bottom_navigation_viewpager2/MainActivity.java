package com.ruet_cse_1503008.rawnak.android_snippet_bottom_navigation_viewpager2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.ruet_cse_1503008.rawnak.android_snippet_bottom_navigation_viewpager2.Fragment.FirstFragment;
import com.ruet_cse_1503008.rawnak.android_snippet_bottom_navigation_viewpager2.Fragment.SecondFragment;
import com.ruet_cse_1503008.rawnak.android_snippet_bottom_navigation_viewpager2.Fragment.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    //This is our viewPager
    private ViewPager2 viewPager2;

    //Fragments
    SecondFragment secondFragment;
    FirstFragment firstFragment;
    ThirdFragment thirdFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing viewPager
        viewPager2 = (ViewPager2) findViewById(R.id.viewpager);
        viewPager2.setPageTransformer(new ZoomOutPageTransformer());    // This gives a zoom out effect when the user slides the fragments/pages
//        viewPager2.setPageTransformer(new DepthPageTransformer());  // This gives a depth effect when the user slides the fragments/pages, however it needs api 21
//        viewPager2.setUserInputEnabled(false);  // This controls the user sliding the fragments/pages, but default it's true

        //Initializing the bottomNavigationView
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu_first:
                                viewPager2.setCurrentItem(0,false);  // false value will prevent effects while bottom menu is pressed
                                break;
                            case R.id.menu_second:
                                viewPager2.setCurrentItem(1,false);
                                break;
                            case R.id.menu_third:
                                viewPager2.setCurrentItem(2,false);
                                break;
                        }
                        return false;   // Restricts follow up calls
                    }
                });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);

                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.menu_first).setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.menu_second).setChecked(true);
                        break;
                    case 2:
                        bottomNavigationView.getMenu().findItem(R.id.menu_third).setChecked(true);
                        break;
                }
            }
        });


        setupViewPager(viewPager2);
    }

    private void setupViewPager(ViewPager2 viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), getLifecycle());
        firstFragment =new FirstFragment();
        secondFragment =new SecondFragment();
        thirdFragment=new ThirdFragment();
        adapter.addFragment(firstFragment);
        adapter.addFragment(secondFragment);
        adapter.addFragment(thirdFragment);
        viewPager.setAdapter(adapter);
    }
}