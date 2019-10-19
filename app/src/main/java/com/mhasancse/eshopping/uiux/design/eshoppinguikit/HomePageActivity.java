package com.mhasancse.eshopping.uiux.design.eshoppinguikit;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.mhasancse.eshopping.Adapter.FavouriteRecycleAdapter;
import com.mhasancse.eshopping.Adapter.SmartPhoneRecycleAdapter;
import com.mhasancse.eshopping.ModelClass.FavouriteModelClass;
import com.mhasancse.eshopping.R;

import java.util.ArrayList;



public class HomePageActivity extends AppCompatActivity {


    /*Favourite Recyclerview data is here*/

    private ArrayList<FavouriteModelClass> favouriteModelClasses;
    private RecyclerView recyclerView;
    private FavouriteRecycleAdapter bAdapter;

    private int image[] = {R.drawable.headphone,R.drawable.reybane,R.drawable.shoesfila,R.drawable.headphone,R.drawable.reybane,R.drawable.shoesfila};
    private String title[] = {"Headphone","Rayban","Shoes","Headphone","Rayban","Shoes"};
    private String price[] = {"Rs 500","Rs 550","Rs 750","Rs 500","Rs 550","Rs 750"};



     /*Smartphones Recyclerview data is here*/

    private ArrayList<FavouriteModelClass> favouriteModelClasses1;
    private RecyclerView recyclerView1;
    private SmartPhoneRecycleAdapter bAdapter1;

    private int image1[] = {R.drawable.s9plus,R.drawable.iphnx,R.drawable.vivo11,R.drawable.googlepixel,R.drawable.s9plus,R.drawable.iphnx};
    private String title1[] = {"Samsung S9+","I Phone X","Vivo V11","Google Pixel 3","Samsung S9+","I Phone X"};
    private String price1[] = {"Rs 45,000","Rs 55,000","Rs 25,000","Rs 40,000","Rs 43,000","Rs 51,000"};


    EditText editext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        editext = findViewById(R.id.editext);


        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);


        /*Favourite recyclerview code is here*/

        recyclerView = findViewById(R.id.favourit_recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HomePageActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        favouriteModelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            FavouriteModelClass beanClassForRecyclerView_contacts = new FavouriteModelClass(image[i],title[i],price[i]);
            favouriteModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new FavouriteRecycleAdapter(HomePageActivity.this,favouriteModelClasses);
        recyclerView.setAdapter(bAdapter);




         /*Smartphones recyclerview code is here*/

        recyclerView1 = findViewById(R.id.smartphone_recyclerview);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(HomePageActivity.this);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        favouriteModelClasses1 = new ArrayList<>();

        for (int i = 0; i < image1.length; i++) {
            FavouriteModelClass beanClassForRecyclerView_contacts = new FavouriteModelClass(image1[i],title1[i],price1[i]);
            favouriteModelClasses1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter1 = new SmartPhoneRecycleAdapter(HomePageActivity.this,favouriteModelClasses1);
        recyclerView1.setAdapter(bAdapter1);





    }


}
