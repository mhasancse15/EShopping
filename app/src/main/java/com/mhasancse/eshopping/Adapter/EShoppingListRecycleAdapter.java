package com.mhasancse.eshopping.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mhasancse.eshopping.ModelClass.EShoppingModelClass;
import com.mhasancse.eshopping.R;
import com.mhasancse.eshopping.uiux.design.eshoppinguikit.AddAddressActivity;
import com.mhasancse.eshopping.uiux.design.eshoppinguikit.HomePageActivity;
import com.mhasancse.eshopping.uiux.design.eshoppinguikit.LoginActivity;
import com.mhasancse.eshopping.uiux.design.eshoppinguikit.MyCartActivity;
import com.mhasancse.eshopping.uiux.design.eshoppinguikit.MyOrderActivity;
import com.mhasancse.eshopping.uiux.design.eshoppinguikit.NavigationActivity;
import com.mhasancse.eshopping.uiux.design.eshoppinguikit.PaymentActivity;
import com.mhasancse.eshopping.uiux.design.eshoppinguikit.ProductDetailActivity;
import com.mhasancse.eshopping.uiux.design.eshoppinguikit.ProductGridActivity;
import com.mhasancse.eshopping.uiux.design.eshoppinguikit.ProductListActivity;
import com.mhasancse.eshopping.uiux.design.eshoppinguikit.SignupActivity;
import com.mhasancse.eshopping.uiux.design.eshoppinguikit.SucessfullActivity;

import java.util.ArrayList;
import java.util.List;



public class EShoppingListRecycleAdapter extends RecyclerView.Adapter<EShoppingListRecycleAdapter.MyViewHolder> {

    Context context;


    private List<EShoppingModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public EShoppingListRecycleAdapter(Context context, ArrayList<EShoppingModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public EShoppingListRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_eshopping_list, parent, false);


        return new EShoppingListRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        EShoppingModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, SignupActivity.class);
                    context.startActivity(i);

                }else if(position == 1) {
                    Intent i = new Intent(context, LoginActivity.class);
                    context.startActivity(i);
                }else if(position == 2) {
                    Intent i = new Intent(context, HomePageActivity.class);
                    context.startActivity(i);
                }else if(position == 3) {
                    Intent i = new Intent(context, NavigationActivity.class);
                    context.startActivity(i);
                }else if(position == 4) {
                    Intent i = new Intent(context, ProductListActivity.class);
                    context.startActivity(i);
                }else if(position == 5) {
                    Intent i = new Intent(context, ProductGridActivity.class);
                    context.startActivity(i);
                }else if(position == 6) {
                    Intent i = new Intent(context, ProductDetailActivity.class);
                    context.startActivity(i);
                }else if(position == 7) {
                    Intent i = new Intent(context, MyCartActivity.class);
                    context.startActivity(i);
                }else if(position == 8) {
                    Intent i = new Intent(context, AddAddressActivity.class);
                    context.startActivity(i);
                }else if(position == 9) {
                    Intent i = new Intent(context, PaymentActivity.class);
                    context.startActivity(i);
                }else if(position == 10) {
                    Intent i = new Intent(context, MyOrderActivity.class);
                    context.startActivity(i);
                }else if(position == 11) {
                    Intent i = new Intent(context, SucessfullActivity.class);
                    context.startActivity(i);
                }
            }

        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


