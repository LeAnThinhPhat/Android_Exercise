package com.example.baitapandroid;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Tuan3_Bai2 extends AppCompatActivity {
    Button btnXong,btnXanh,btnDo,btnBac,btnDen;
    ImageView imageViewDT, imageView;
    TextView txt_Mau, txt_Gia, txt_Ti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan3__bai2);
        btnXong = findViewById(R.id.buttonXong);
        txt_Mau = findViewById(R.id.txt_color);
        txt_Gia = findViewById(R.id.txt_Gia);
        txt_Ti = findViewById(R.id.txt_Tiki);
        btnBac = findViewById(R.id.btn_bac);
        btnDo = findViewById(R.id.btn_do);
        btnXanh = findViewById(R.id.btn_blugray);
        btnDen = findViewById(R.id.btn_black);
        imageViewDT=findViewById(R.id.imageViewDT);
        imageView = findViewById(R.id.imageView);

        btnXong.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                imageViewDT = (ImageView) findViewById(R.id.imageViewDT);
                if (imageViewDT.getDrawable().getConstantState().equals(imageViewDT.getContext().getDrawable(R.drawable.vs_bac).getConstantState())) {
                    Intent act2 = new Intent(Tuan3_Bai2.this, Tuan3_Bai1.class);
                    act2.putExtra("Img_screen1", R.drawable.vs_bac);
                    startActivity(act2);
                }

                if (imageViewDT.getDrawable().getConstantState().equals(imageViewDT.getContext().getDrawable(R.drawable.vs_red).getConstantState())) {
                    Intent act2 = new Intent(Tuan3_Bai2.this, Tuan3_Bai1.class);
                    act2.putExtra("Img_screen1", R.drawable.vs_red);
                    startActivity(act2);
                }

                if (imageViewDT.getDrawable().getConstantState().equals(imageViewDT.getContext().getDrawable(R.drawable.vsmart_black).getConstantState())) {
                    Intent act2 = new Intent(Tuan3_Bai2.this, Tuan3_Bai1.class);
                    act2.putExtra("Img_screen1", R.drawable.vsmart_black);
                    startActivity(act2);
                }

                if (imageViewDT.getDrawable().getConstantState().equals(imageViewDT.getContext().getDrawable(R.drawable.vsmart_live_xanh_1).getConstantState())) {
                    Intent act2 = new Intent(Tuan3_Bai2.this, Tuan3_Bai1.class);
                    act2.putExtra("Img_screen1", R.drawable.vsmart_live_xanh_1);
                    startActivity(act2);
                }
            }
        });
        reTurn_bac(btnBac,new DienThoai("Mau: Bạc","Tiki","80.000đ",R.drawable.vs_bac));
        reTurn_red(btnDo,new DienThoai("Mau: Đỏ","Tiki","80.000đ",R.drawable.vs_red));
        reTurn_black(btnDen,new DienThoai("Mau: Đen","Tiki","80.000đ",R.drawable.vsmart_black));
        reTurn_blugray(btnXanh,new DienThoai("Mau: Xanh Đậm","Tiki","80.000đ",R.drawable.vsmart_live_xanh_1));
    }
    public void reTurn_bac(Button btn, DienThoai dt){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_Mau.setText(dt.getMau());
                txt_Gia.setText(dt.getGia());
                txt_Ti.setText(dt.getTiKi());
                imageViewDT.setImageResource(dt.getImage());
            }
        });
    }

    public void reTurn_red(Button btn, DienThoai dt){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_Mau.setText(dt.getMau());
                txt_Gia.setText(dt.getGia());
                txt_Ti.setText(dt.getTiKi());
                imageViewDT.setImageResource(dt.getImage());
            }
        });
    }

    public void reTurn_blugray(Button btn, DienThoai dt){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_Mau.setText(dt.getMau());
                txt_Gia.setText(dt.getGia());
                txt_Ti.setText(dt.getTiKi());
                imageViewDT.setImageResource(dt.getImage());
            }
        });
    }

    public void reTurn_black(Button btn, DienThoai dt){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_Mau.setText(dt.getMau());
                txt_Gia.setText(dt.getGia());
                txt_Ti.setText(dt.getTiKi());
                imageViewDT.setImageResource(dt.getImage());
            }
        });
    }
}