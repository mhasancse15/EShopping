package com.mhasancse.eshopping.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



import com.mhasancse.eshopping.ModelClass.MyOrderModelClass;
import com.mhasancse.eshopping.R;


public class MyOrderRecycleAdapter extends RecyclerView.Adapter<MyOrderRecycleAdapter.MyViewHolder> {

    Context context;


    private List<MyOrderModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView image;
        TextView title,qty,price,date,order_no;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            title = (TextView) view.findViewById(R.id.title);
            qty = (TextView) view.findViewById(R.id.qty);
            price = (TextView) view.findViewById(R.id.price);
            date = (TextView) view.findViewById(R.id.date);
            order_no = (TextView) view.findViewById(R.id.order_no);


        }

    }


    public MyOrderRecycleAdapter(Context context, ArrayList<MyOrderModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public MyOrderRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_my_order_list, parent, false);


        return new MyOrderRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        MyOrderModelClass lists = OfferList.get(position);
        holder.image.setImageResource(lists.getImage());
        holder.title.setText(lists.getTitle());
        holder.qty.setText(lists.getQuantity());
        holder.price.setText(lists.getPrice());
        holder.date.setText(lists.getDate());
        holder.order_no.setText(lists.getOrder_no());



    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


