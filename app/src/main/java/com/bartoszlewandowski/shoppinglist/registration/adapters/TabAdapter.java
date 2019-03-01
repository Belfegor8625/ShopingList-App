package com.bartoszlewandowski.shoppinglist.registration.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bartoszlewandowski.shoppinglist.registration.fragments.LogInFragment;
import com.bartoszlewandowski.shoppinglist.registration.fragments.SignUpFragment;

/**
 * Created by Bartosz Lewandowski on 01.03.2019.
 */
public class TabAdapter extends FragmentPagerAdapter {

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int tabPosition) {
        switch (tabPosition) {
            case 0:
                return new SignUpFragment();
            case 1:
                return new LogInFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Sign up";
            case 1:
                return "Log in";
            default:
                return null;
        }
    }
}
