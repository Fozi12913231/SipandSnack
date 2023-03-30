package com.cust.sipnsnack.ManagerDashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.sipnsnack.R;
import com.google.android.material.tabs.TabLayout;

public class AllOrdersDetails extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ImageView backBtn, refreshBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_orders_details);

        backBtn = findViewById(R.id.backBTN);
        refreshBtn = findViewById(R.id.refreshBTN);
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));

        tabLayout.setupWithViewPager(viewPager);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DashBoard.class));
                finish();
            }
        });

        refreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getIntent());
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), DashBoard.class));
        finish();
    }
}