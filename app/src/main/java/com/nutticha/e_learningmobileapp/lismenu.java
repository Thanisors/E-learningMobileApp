package com.nutticha.e_learningmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lismenu extends AppCompatActivity implements View.OnClickListener {
    private Button chapter3 , chapter4 , chapter5 , chapter6 , chapter7 , chapter8 , chapter9 , chapter10 , chapter11 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lismenu);

        chapter3 = (Button) findViewById(R.id.Chapter3);
        chapter4 = (Button) findViewById(R.id.Chapter4);
        chapter5 = (Button) findViewById(R.id.Chapter5);
        chapter6 = (Button) findViewById(R.id.Chapter6);
        chapter7 = (Button) findViewById(R.id.Chapter7);
        chapter8 = (Button) findViewById(R.id.Chapter8);
        chapter9 = (Button) findViewById(R.id.Chapter9);
        chapter10 = (Button) findViewById(R.id.Chapter10);
        chapter11 = (Button) findViewById(R.id.Chapter11);

        chapter3.setOnClickListener(this);
        chapter4.setOnClickListener(this);
        chapter5.setOnClickListener(this);
        chapter6.setOnClickListener(this);
        chapter7.setOnClickListener(this);
        chapter8.setOnClickListener(this);
        chapter9.setOnClickListener(this);
        chapter10.setOnClickListener(this);
        chapter11.setOnClickListener(this);
    }

    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.Chapter3){
            Chapter3();
        }
        else if (id == R.id.Chapter4){
            Chapter4();
        }
        else if (id == R.id.Chapter5){
            Chapter5();
        }
        else if (id == R.id.Chapter6){
            Chapter6();
        }
        else if (id == R.id.Chapter7){
            Chapter7();
        }
        else if (id == R.id.Chapter8){
            Chapter8();
        }
        else if (id == R.id.Chapter9){
            Chapter9();
        }
        else if (id == R.id.Chapter10){
            Chapter10();
        }
        else if (id == R.id.Chapter11){
            Chapter11();
        }
    }
    public void Chapter3(){
        Intent Chapter3 = new Intent(lismenu.this, Chapter3.class);
        startActivity(Chapter3);
    }
    public void Chapter4(){
        Intent Chapter4 = new Intent(lismenu.this , Chapter4.class);
        startActivity(Chapter4);
    }
    public void Chapter5(){
        Intent Chapter5 = new Intent(lismenu.this , Chapter5.class);
        startActivity(Chapter5);
    }
    public void Chapter6(){
        Intent Chapter6 = new Intent(lismenu.this , Chapter6.class);
        startActivity(Chapter6);
    }
    public void Chapter7(){
        Intent Chapter7 = new Intent(lismenu.this , Chapter7.class);
        startActivity(Chapter7);
    }
    public void Chapter8(){
        Intent Chapter8 = new Intent(lismenu.this , Chapter8.class);
        startActivity(Chapter8);
    }
    public void Chapter9(){
        Intent Chapter9 = new Intent(lismenu.this , Chapter9.class);
        startActivity(Chapter9);
    }
    public void Chapter10(){
        Intent Chapter10 = new Intent(lismenu.this , Chapter10.class);
        startActivity(Chapter10);
    }
    public void Chapter11(){
        Intent Chapter11 = new Intent(lismenu.this , Chapter11.class);
        startActivity(Chapter11);
    }
}