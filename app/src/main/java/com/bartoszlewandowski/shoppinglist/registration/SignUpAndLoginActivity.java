package com.bartoszlewandowski.shoppinglist.registration;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.bartoszlewandowski.shoppinglist.R;
import com.bartoszlewandowski.shoppinglist.registration.adapters.TabAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpAndLoginActivity extends AppCompatActivity {

    @BindView(R.id.sign_up_or_log_in_toolbar)
    Toolbar toolbar;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_and_login);

        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
