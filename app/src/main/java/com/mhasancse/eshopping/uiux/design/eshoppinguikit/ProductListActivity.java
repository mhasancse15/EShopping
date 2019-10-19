package com.mhasancse.eshopping.uiux.design.eshoppinguikit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mhasancse.eshopping.Adapter.RecycleAdapteProductList;
import com.mhasancse.eshopping.ModelClass.ProductListModellClass;
import com.mhasancse.eshopping.R;

import java.util.ArrayList;



public class ProductListActivity extends AppCompatActivity {


    private ArrayList<ProductListModellClass> productListModellClasses;
    private RecyclerView recyclerview;
    private RecycleAdapteProductList mAdapter2;
    private Integer image1[]={R.drawable.s9plus, R.drawable.iphnx,R.drawable.googlepixel,R.drawable.vivo11};
    private String title1[] ={"Samsung S9 Plus","I Phone X","Google Pixel 3","Vivo V-11 Pro",};
    private Integer like[] = {R.drawable.ic_heart_light,R.drawable.ic_dark_like,R.drawable.ic_dark_like,R.drawable.ic_heart_light,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);



        //      Product List  Recyclerview Code is here

        recyclerview = (RecyclerView)findViewById(R.id.recyclerview);

        productListModellClasses = new ArrayList<>();



        for (int i = 0; i < image1.length; i++) {
            ProductListModellClass beanClassForRecyclerView_contacts = new ProductListModellClass(image1[i],title1[i],like[i]);

            productListModellClasses.add(beanClassForRecyclerView_contacts);
        }



        mAdapter2 = new RecycleAdapteProductList(ProductListActivity.this,productListModellClasses);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(ProductListActivity.this);
        recyclerview.setLayoutManager(mLayoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.setAdapter(mAdapter2);



    }
}
