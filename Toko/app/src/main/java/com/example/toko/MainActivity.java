package com.example.toko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;



import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private SliderAdapter mSliderAdapter;

    private int[] nImageIds = {R.drawable.iklan1, R.drawable.iklan2, R.drawable.iklan3, R.drawable.iklan4,};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.viewPager);
        mSliderAdapter = new SliderAdapter(this, nImageIds);
        mViewPager.setAdapter(mSliderAdapter);
    }
}