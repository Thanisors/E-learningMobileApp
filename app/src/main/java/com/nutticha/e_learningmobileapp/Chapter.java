package com.nutticha.e_learningmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Chapter extends AppCompatActivity implements View.OnClickListener {
    private Button btnCT3 , btnCT4 , btnCT5 , btnCT6 , btnCT7 , btnCT8 , btnCT9 , btnCT10 , btnCT11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);
        btnCT3 = (Button) findViewById(R.id.btnCT3);
        btnCT4 = (Button) findViewById(R.id.btnCT4);
        btnCT5 = (Button) findViewById(R.id.btnCT5);
        btnCT6 = (Button) findViewById(R.id.btnCT6);
        btnCT7 = (Button) findViewById(R.id.btnCT7);
        btnCT8 = (Button) findViewById(R.id.btnCT8);
        btnCT9 = (Button) findViewById(R.id.btnCT9);
        btnCT10 = (Button) findViewById(R.id.btnCT10);
        btnCT11 = (Button) findViewById(R.id.btnCT11);
        btnCT3.setOnClickListener(this);
        btnCT4.setOnClickListener(this);
        btnCT5.setOnClickListener(this);
        btnCT6.setOnClickListener(this);
        btnCT7.setOnClickListener(this);
        btnCT8.setOnClickListener(this);
        btnCT9.setOnClickListener(this);
        btnCT10.setOnClickListener(this);
        btnCT11.setOnClickListener(this);
    }

    public void onClick(View v){
        int id = v.getId();
        if (id == R.id.btnCT3){
            Chapter3();
        }
        else if (id == R.id.btnCT4){
            Chapter4();
        }
        else if (id == R.id.btnCT5){
            Chapter5();
        }
        else if (id == R.id.btnCT6){
            Chapter6();
        }
        else if (id == R.id.btnCT7){
            Chapter7();
        }
        else if (id == R.id.btnCT8){
            Chapter8();
        }
        else if (id == R.id.btnCT9){
            Chapter9();
        }
        else if (id == R.id.btnCT10){
            Chapter10();
        }
        else if (id == R.id.btnCT11){
            Chapter11();
        }
    }

    public void Chapter3(){
        Intent Chapter3 = new Intent(Chapter.this, Chapter3.class);
        startActivity(Chapter3);
    }
    public void Chapter4(){
        Intent Chapter4 = new Intent(Chapter.this, Chapter4.class);
        startActivity(Chapter4);
    }
    public void Chapter5(){
        Intent Chapter5 = new Intent(Chapter.this, Chapter5.class);
        startActivity(Chapter5);
    }
    public void Chapter6(){
        Intent Chapter6 = new Intent(Chapter.this, Chapter6.class);
        startActivity(Chapter6);
    }
    public void Chapter7(){
        Intent Chapter7 = new Intent(Chapter.this, Chapter7.class);
        startActivity(Chapter7);
    }
    public void Chapter8(){
        Intent Chapter8 = new Intent(Chapter.this, Chapter8.class);
        startActivity(Chapter8);
    }
    public void Chapter9(){
        Intent Chapter9 = new Intent(Chapter.this, Chapter9.class);
        startActivity(Chapter9);
    }
    public void Chapter10(){
        Intent Chapter10 = new Intent(Chapter.this, Chapter10.class);
        startActivity(Chapter10);
    }
    public void Chapter11(){
        Intent Chapter11 = new Intent(Chapter.this, Chapter11.class);
        startActivity(Chapter11);
    }
}