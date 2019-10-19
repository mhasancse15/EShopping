package com.mhasancse.eshopping.uiux.design.eshoppinguikit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.mhasancse.eshopping.Adapter.RecycleAdapteProductGrid;
import com.mhasancse.eshopping.ModelClass.ProductGridModellClass;
import com.mhasancse.eshopping.R;

import java.util.ArrayList;


public class ProductGridActivity extends AppCompatActivity {


    private ArrayList<ProductGridModellClass> productGridModellClasses;
    private RecyclerView recyclerview;
    private RecycleAdapteProductGrid mAdapter2;
    private Integer image1[]={R.drawable.s9plus,R.drawable.s9plus,R.drawable.s9plus,R.drawable.s9plus,R.drawable.s9plus,R.drawable.s9plus};

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_grid);

        title = findViewById(R.id.title);
        title.setText("Product Grid");

        //      New Arrival Kitchen  Recyclerview Code is here

        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);

        productGridModellClasses = new ArrayList<>();



        for (int i = 0; i < image1.length; i++) {
            ProductGridModellClass beanClassForRecyclerView_contacts = new ProductGridModellClass(image1[i]);
            productGridModellClasses.add(beanClassForRecyclerView_contacts);
        }



        mAdapter2 = new RecycleAdapteProductGrid(ProductGridActivity.this,productGridModellClasses);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(ProductGridActivity.this,2);
        recyclerview.setLayoutManager(mLayoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.setAdapter(mAdapter2);


    }
}
