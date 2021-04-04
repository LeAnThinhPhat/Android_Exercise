package com.example.baitapandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Tuan3_Bai1 extends AppCompatActivity {
    Button button;
    Intent i;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan3__bai1);
        button = findViewById(R.id.button_chon_mau);
        img =(ImageView)findViewById(R.id.imageView2);
        img.setImageResource(getIntent().getIntExtra("Img_screen1",R.drawable.vsmart_live_xanh_1));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Tuan3_Bai1.this, Tuan3_Bai2.class);
                startActivity(i);

            }
        });

    }

}