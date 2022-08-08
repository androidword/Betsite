package com.example.zinbet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    List<Pojo> list;
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         gridView = findViewById(R.id.grid_list);

         gridList();

         myAdapter = new MyAdapter(this, list);
         gridView.setAdapter(myAdapter);

    }
    private  void gridList(){
        list = new ArrayList<>();
        list.add(new Pojo(R.drawable.coffee, "2odds daily"));
        list.add(new Pojo(R.drawable.ten, "sure 10 odds"));
        list.add(new Pojo(R.drawable.ruby,"ruby"));
        list.add(new Pojo(R.drawable.hundred, "100 odds"));
        list.add(new Pojo(R.drawable.three, "three odds"));
        list.add(new Pojo(R.drawable.five, "five odds"));
        list.add(new Pojo(R.drawable.six, "six odds"));
        list.add(new Pojo(R.drawable.thirteen, "13 odds"));
        list.add(new Pojo(R.drawable.twentyone, "21 odds"));
        list.add(new Pojo(R.drawable.dribbble, "Baseketball"));
        list.add(new Pojo(R.drawable.bitcoin, "Pay with bitcoin"));
        list.add(new Pojo(R.drawable.whatsapp, "contact us on whatsapp"));
        list.add(new Pojo(R.drawable.fb, "follow us on facebook"));
        list.add(new Pojo(R.drawable.message, "send us a message"));
    }


}