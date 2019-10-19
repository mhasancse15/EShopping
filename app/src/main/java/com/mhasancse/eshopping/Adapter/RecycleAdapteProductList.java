package com.mhasancse.eshopping.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


import com.mhasancse.eshopping.ModelClass.ProductListModellClass;
import com.mhasancse.eshopping.R;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapteProductList extends RecyclerView.Adapter<RecycleAdapteProductList.MyViewHolder> {
    Context context;


    private List<ProductListModellClass> moviesList;

    Dialog myDialog, slideDialog;
    RadioButton btn1,btn2,btn3,btn4,btn5,btn6,btn11,btn22,btn33,btn44;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        ImageView image,like;
        TextView title,offer;
        LinearLayout linear;




        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            like = (ImageView) view.findViewById(R.id.like);
            title = (TextView)view.findViewById(R.id.title);
            offer = (TextView) view.findViewById(R.id.offer);
           // linear = (LinearLayout) view.findViewById(R.id.linear);

        }

    }


    public RecycleAdapteProductList(Context context, ArrayList<ProductListModellClass> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product_list, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder,final int position) {
        ProductListModellClass movie = moviesList.get(position);
        holder.image.setImageResource(movie.getImage());
        holder.like.setImageResource(movie.getLike());
        holder.title.setText(movie.getTitle());



        holder.offer.setText("Rs 40000");
        holder.offer.setPaintFlags(holder.offer.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);



    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }



}


