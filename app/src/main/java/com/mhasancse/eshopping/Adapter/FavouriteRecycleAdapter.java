package com.mhasancse.eshopping.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



import com.mhasancse.eshopping.ModelClass.FavouriteModelClass;
import com.mhasancse.eshopping.R;



public class FavouriteRecycleAdapter extends RecyclerView.Adapter<FavouriteRecycleAdapter.MyViewHolder> {

    Context context;


    private List<FavouriteModelClass> OfferList;

    boolean showingfirst = true;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView image,like;
        TextView title,price;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView)view.findViewById(R.id.image);
            like = (ImageView)view.findViewById(R.id.like);
            title = (TextView) view.findViewById(R.id.title);
            price = (TextView) view.findViewById(R.id.price);


        }

    }


    public FavouriteRecycleAdapter(Context context, ArrayList<FavouriteModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public FavouriteRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_favourite_list, parent, false);


        return new FavouriteRecycleAdapter.MyViewHolder(itemView);




    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        final FavouriteModelClass lists = OfferList.get(position);
        holder.image.setImageResource(lists.getImage());
        holder.title.setText(lists.getTitle());
        holder.price.setText(lists.getPrice());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (lists.isSelected() == true){
                    lists.setSelected(false);

                    holder.like.setImageResource(R.drawable.ic_dark_like);

                }else {
                    lists.setSelected(true);
                    holder.like.setImageResource(R.drawable.ic_heart_light);
                }



            }
        });

    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


