package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{
    boolean ismicrophone=true;
    public void change(View view){
        ImageView imageView6=findViewById(R.id.imageView6);
        ImageView imageView2=findViewById(R.id.imageView2);
        if(ismicrophone) {
            imageView6.animate().alpha(1).setDuration(2000);
            imageView2.animate().alpha(0).setDuration(2000);
            ismicrophone = false;
        }else{
            imageView6.animate().alpha(0).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
            ismicrophone=true;
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.imageView2);
        imageView.animate().setDuration(2000).rotation(360);
    }
}