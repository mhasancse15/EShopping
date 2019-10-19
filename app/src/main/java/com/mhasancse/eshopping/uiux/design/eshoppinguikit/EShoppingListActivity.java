package com.mhasancse.eshopping.uiux.design.eshoppinguikit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mhasancse.eshopping.Adapter.EShoppingListRecycleAdapter;
import com.mhasancse.eshopping.ModelClass.EShoppingModelClass;
import com.mhasancse.eshopping.R;

import java.util.ArrayList;



public class EShoppingListActivity extends AppCompatActivity {

    private ArrayList<EShoppingModelClass> eShoppingModelClasses;
    private RecyclerView recyclerView;
    private EShoppingListRecycleAdapter bAdapter;

    private String txt[]={"1.SignUp Activity","2.SignIn Activity","3.Homepage Activity","4.Navigation Activity","5.ProductList Activity","6.ProductGrid Activity",
    "7.ProdcutDetail Activity","8.Cart Activity","9.Address Activity","10.Payment Activity","11.MyOrder Activity","12.Sucessfull Order Activity"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eshopping_list);


        /*recyclerview code is here*/


        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(EShoppingListActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        eShoppingModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            EShoppingModelClass beanClassForRecyclerView_contacts = new EShoppingModelClass(txt[i]);
            eShoppingModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new EShoppingListRecycleAdapter(EShoppingListActivity.this,eShoppingModelClasses);
        recyclerView.setAdapter(bAdapter);
    }
}
