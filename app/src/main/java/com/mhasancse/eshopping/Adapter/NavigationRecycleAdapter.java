package com.mhasancse.eshopping.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



import com.mhasancse.eshopping.ModelClass.EShoppingModelClass;
import com.mhasancse.eshopping.R;



public class NavigationRecycleAdapter extends RecyclerView.Adapter<NavigationRecycleAdapter.MyViewHolder> {

    Context context;


    private List<EShoppingModelClass> OfferList;

    int myPos = 0;

    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public NavigationRecycleAdapter(Context context, ArrayList<EShoppingModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public NavigationRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_navigation_list, parent, false);


        return new NavigationRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        EShoppingModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());

        if (myPos == position){
            holder.title.setTextColor(Color.parseColor("#38393f"));


        }else {

            holder.title.setTextColor(Color.parseColor("#acacac"));

        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPos = position;
                notifyDataSetChanged();

            }


        });



    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


