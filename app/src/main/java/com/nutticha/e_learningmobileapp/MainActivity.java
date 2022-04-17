package com.nutticha.e_learningmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button OnlineClass , Chapter , Quiz , AllMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnlineClass = (Button) findViewById(R.id.OnlineClass);
        Chapter = (Button) findViewById(R.id.Chapter);
        Quiz = (Button) findViewById(R.id.Quiz);
        AllMenu = (Button) findViewById(R.id.AllMenu);
        OnlineClass.setOnClickListener(this);
        Chapter.setOnClickListener(this);
        Quiz.setOnClickListener(this);
        AllMenu.setOnClickListener(this);
    }
    public void onClick(View v){
        int id = v.getId();
        if (id == R.id.OnlineClass){
            OnlineClass();
        }
        else if(id == R.id.Chapter){
            Chapter();
        }
        else if (id == R.id.Quiz){
            Quiz();
        }
        else if (id == R.id.AllMenu){
            AllMenu();
        }
    }

    public void AllMenu(){
        Intent listMenu = new Intent(MainActivity.this , lismenu.class);
        startActivity(listMenu);
    }
    public void OnlineClass(){
        Intent onlineClass = new Intent(MainActivity.this , OnlineClass.class);
        startActivity(onlineClass);
    }
    public void Quiz(){
        Intent Quiz = new Intent(MainActivity.this , Quiz.class);
        startActivity(Quiz);
    }
    public void Chapter(){
        Intent Chapter = new Intent(MainActivity.this , Chapter.class);
        startActivity(Chapter);
    }
}

