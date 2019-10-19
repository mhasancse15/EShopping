package com.mhasancse.eshopping.uiux.design.eshoppinguikit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mhasancse.eshopping.R;

public class AddAddressActivity extends AppCompatActivity {

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);

        title = findViewById(R.id.title);
        title.setText("Add New Address");
    }
}
