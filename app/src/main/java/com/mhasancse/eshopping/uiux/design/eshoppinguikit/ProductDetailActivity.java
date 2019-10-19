package com.mhasancse.eshopping.uiux.design.eshoppinguikit;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mhasancse.eshopping.Adapter.ProductDetailPagerAdapter;
import com.mhasancse.eshopping.Adapter.ReviewsRecycleAdapter;
import com.mhasancse.eshopping.ModelClass.ReviewModelClass;
import com.mhasancse.eshopping.R;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


import me.relex.circleindicator.CircleIndicator;

public class ProductDetailActivity extends AppCompatActivity implements View.OnClickListener {

    TextView title;

    private ViewPager viewPager;
    private ProductDetailPagerAdapter productDetailPagerAdapter;
    private int currentPage;
    private static final int NUM_PAGES = 5;

    LinearLayout linear1,linear2,linear3,linear4,linear5,linear6,linear_red,linear_green,linear_black;
    TextView text1,text2,text3,text6,text4,text5;
    ImageView red_tick,green_tick,black_tick;


    /*recycler data is here*/

    private ArrayList<ReviewModelClass> reviewModelClasses;
    private RecyclerView recyclerview;
    private ReviewsRecycleAdapter mAdapter2;

    private String title1[] = {"Mark Henry","Jemes Bond","Steve Hong"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);






        //      Product Detail  Recyclerview Code is here

        recyclerview = (RecyclerView)findViewById(R.id.recyclerview);

        reviewModelClasses = new ArrayList<>();



        for (int i = 0; i < title1.length; i++) {
            ReviewModelClass beanClassForRecyclerView_contacts = new ReviewModelClass(title1[i]);

            reviewModelClasses.add(beanClassForRecyclerView_contacts);
        }



        mAdapter2 = new ReviewsRecycleAdapter(ProductDetailActivity.this,reviewModelClasses);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(ProductDetailActivity.this);
        recyclerview.setLayoutManager(mLayoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.setAdapter(mAdapter2);


        linear1 = findViewById(R.id.linear1);
        linear2 = findViewById(R.id.linear2);
        linear3 = findViewById(R.id.linear3);
        linear4 = findViewById(R.id.linear4);
        linear5 = findViewById(R.id.linear5);
        linear6 = findViewById(R.id.linear6);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        text6 = findViewById(R.id.text6);


        linear_red = findViewById(R.id.linear_red);
        linear_green = findViewById(R.id.linear_green);
        linear_black = findViewById(R.id.linear_black);


        red_tick = findViewById(R.id.red_tick);
        green_tick = findViewById(R.id.green_tick);
        black_tick = findViewById(R.id.black_tick);

        linear_red.setOnClickListener(this);
        linear_green.setOnClickListener(this);
        linear_black.setOnClickListener(this);


        linear1.setOnClickListener(this);
        linear2.setOnClickListener(this);
        linear3.setOnClickListener(this);
        linear4.setOnClickListener(this);
        linear5.setOnClickListener(this);
        linear6.setOnClickListener(this);


        title = findViewById(R.id.title);
        title.setText("Product Detail");

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);


         /*view pager and indicator code is here*/


        productDetailPagerAdapter = new ProductDetailPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(productDetailPagerAdapter);

        productDetailPagerAdapter.registerDataSetObserver(indicator.getDataSetObserver());

        indicator.setViewPager(viewPager);


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                currentPage = viewPager.getCurrentItem();


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });





    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.linear1:

                linear1.setBackgroundResource(R.drawable.size_red_rect);
                linear2.setBackgroundResource(R.drawable.size_rect);
                linear3.setBackgroundResource(R.drawable.size_rect);
                linear4.setBackgroundResource(R.drawable.size_rect);
                linear5.setBackgroundResource(R.drawable.size_rect);
                linear6.setBackgroundResource(R.drawable.size_rect);


                text1.setTextColor(Color.parseColor("#dc143c"));
                text2.setTextColor(Color.parseColor("#8f909e"));
                text3.setTextColor(Color.parseColor("#8f909e"));
                text4.setTextColor(Color.parseColor("#8f909e"));
                text5.setTextColor(Color.parseColor("#8f909e"));
                text6.setTextColor(Color.parseColor("#8f909e"));


                break;


            case R.id.linear2:

                linear1.setBackgroundResource(R.drawable.size_rect);
                linear2.setBackgroundResource(R.drawable.size_red_rect);
                linear3.setBackgroundResource(R.drawable.size_rect);
                linear4.setBackgroundResource(R.drawable.size_rect);
                linear5.setBackgroundResource(R.drawable.size_rect);
                linear6.setBackgroundResource(R.drawable.size_rect);


                text1.setTextColor(Color.parseColor("#8f909e"));
                text2.setTextColor(Color.parseColor("#dc143c"));
                text3.setTextColor(Color.parseColor("#8f909e"));
                text4.setTextColor(Color.parseColor("#8f909e"));
                text5.setTextColor(Color.parseColor("#8f909e"));
                text6.setTextColor(Color.parseColor("#8f909e"));


                break;


            case R.id.linear3:

                linear1.setBackgroundResource(R.drawable.size_rect);
                linear2.setBackgroundResource(R.drawable.size_rect);
                linear3.setBackgroundResource(R.drawable.size_red_rect);
                linear4.setBackgroundResource(R.drawable.size_rect);
                linear5.setBackgroundResource(R.drawable.size_rect);
                linear6.setBackgroundResource(R.drawable.size_rect);


                text1.setTextColor(Color.parseColor("#8f909e"));
                text2.setTextColor(Color.parseColor("#8f909e"));
                text3.setTextColor(Color.parseColor("#dc143c"));
                text4.setTextColor(Color.parseColor("#8f909e"));
                text5.setTextColor(Color.parseColor("#8f909e"));
                text6.setTextColor(Color.parseColor("#8f909e"));


                break;


            case R.id.linear4:

                linear1.setBackgroundResource(R.drawable.size_rect);
                linear2.setBackgroundResource(R.drawable.size_rect);
                linear3.setBackgroundResource(R.drawable.size_rect);
                linear4.setBackgroundResource(R.drawable.size_red_rect);
                linear5.setBackgroundResource(R.drawable.size_rect);
                linear6.setBackgroundResource(R.drawable.size_rect);


                text1.setTextColor(Color.parseColor("#8f909e"));
                text2.setTextColor(Color.parseColor("#8f909e"));
                text3.setTextColor(Color.parseColor("#8f909e"));
                text4.setTextColor(Color.parseColor("#dc143c"));
                text5.setTextColor(Color.parseColor("#8f909e"));
                text6.setTextColor(Color.parseColor("#8f909e"));


                break;


            case R.id.linear5:

                linear1.setBackgroundResource(R.drawable.size_rect);
                linear2.setBackgroundResource(R.drawable.size_rect);
                linear3.setBackgroundResource(R.drawable.size_rect);
                linear4.setBackgroundResource(R.drawable.size_rect);
                linear5.setBackgroundResource(R.drawable.size_red_rect);
                linear6.setBackgroundResource(R.drawable.size_rect);


                text1.setTextColor(Color.parseColor("#8f909e"));
                text2.setTextColor(Color.parseColor("#8f909e"));
                text3.setTextColor(Color.parseColor("#8f909e"));
                text4.setTextColor(Color.parseColor("#8f909e"));
                text5.setTextColor(Color.parseColor("#dc143c"));
                text6.setTextColor(Color.parseColor("#8f909e"));


                break;

            case R.id.linear6:

                linear1.setBackgroundResource(R.drawable.size_rect);
                linear2.setBackgroundResource(R.drawable.size_rect);
                linear3.setBackgroundResource(R.drawable.size_rect);
                linear4.setBackgroundResource(R.drawable.size_rect);
                linear5.setBackgroundResource(R.drawable.size_rect);
                linear6.setBackgroundResource(R.drawable.size_red_rect);


                text1.setTextColor(Color.parseColor("#8f909e"));
                text2.setTextColor(Color.parseColor("#8f909e"));
                text3.setTextColor(Color.parseColor("#8f909e"));
                text4.setTextColor(Color.parseColor("#8f909e"));
                text5.setTextColor(Color.parseColor("#8f909e"));
                text6.setTextColor(Color.parseColor("#dc143c"));

                break;


            case R.id.linear_red:

                red_tick.setVisibility(View.VISIBLE);
                green_tick.setVisibility(View.GONE);
                black_tick.setVisibility(View.GONE);


                break;

            case R.id.linear_green:

                red_tick.setVisibility(View.GONE);
                green_tick.setVisibility(View.VISIBLE);
                black_tick.setVisibility(View.GONE);


                break;

            case R.id.linear_black:

                red_tick.setVisibility(View.GONE);
                green_tick.setVisibility(View.GONE);
                black_tick.setVisibility(View.VISIBLE);


                break;


        }
    }
}
