package com.mhasancse.eshopping.uiux.design.eshoppinguikit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.mhasancse.eshopping.Adapter.MyOrderRecycleAdapter;
import com.mhasancse.eshopping.ModelClass.MyOrderModelClass;
import com.mhasancse.eshopping.R;

import java.util.ArrayList;



public class MyOrderActivity extends AppCompatActivity {

    TextView title;

    private ArrayList<MyOrderModelClass> myOrderModelClasses;
    private RecyclerView recyclerview;
    private MyOrderRecycleAdapter mAdapter2;

    private Integer image[] = {R.drawable.s9plus,R.drawable.shoesfila};
    private String title1[] = {"Samsung Galaxy S9 Plus","Fila Super"};
    private String price[] = {"Rs. 30,000","Rs. 2500"};
    private String qty[] = {"1","1"};
    private String date [] = {"28/01/2019 5:00PM","12/02/2019 11:00 AM"};
    private String order_no[] = {"#412458","#154352"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        title = findViewById(R.id.title);
        title.setText("My Order");



        //      MyOrder  Recyclerview Code is here

        recyclerview = (RecyclerView)findViewById(R.id.recyclerView);

        myOrderModelClasses = new ArrayList<>();



        for (int i = 0; i < image.length; i++) {
            MyOrderModelClass beanClassForRecyclerView_contacts = new MyOrderModelClass(image[i],title1[i],price[i],qty[i],date[i],order_no[i]);

            myOrderModelClasses.add(beanClassForRecyclerView_contacts);
        }



        mAdapter2 = new MyOrderRecycleAdapter(MyOrderActivity.this,myOrderModelClasses);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MyOrderActivity.this);
        recyclerview.setLayoutManager(mLayoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.setAdapter(mAdapter2);

    }
}
