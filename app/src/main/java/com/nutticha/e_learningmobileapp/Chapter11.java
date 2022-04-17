package com.nutticha.e_learningmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Chapter11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter11);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.chapter03:
                Chapter3();
                return true;
            case R.id.chapter04:
                Chapter4();
                return true;
            case R.id.chapter05:
                Chapter5();
                return true;
            case R.id.chapter06:
                Chapter6();
                return true;
            case R.id.chapter07:
                Chapter7();
                return true;
            case R.id.chapter08:
                Chapter8();
                return true;
            case R.id.chapter09:
                Chapter9();
                return true;
            case R.id.chapter010:
                Chapter10();
                return true;
            case R.id.chapter011:
                return true;
            case R.id.ExitToMain:
                ExitToMain();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void Chapter4(){
        Intent Chapter4 = new Intent(Chapter11.this , Chapter4.class);
        startActivity(Chapter4);
    }
    public void Chapter5(){
        Intent Chapter5 = new Intent(Chapter11.this , Chapter5.class);
        startActivity(Chapter5);
    }
    public void Chapter3(){
        Intent Chapter3 = new Intent(Chapter11.this , Chapter3.class);
        startActivity(Chapter3);
    }
    public void Chapter6(){
        Intent Chapter6 = new Intent(Chapter11.this , Chapter6.class);
        startActivity(Chapter6);
    }
    public void Chapter7(){
        Intent Chapter7 = new Intent(Chapter11.this , Chapter7.class);
        startActivity(Chapter7);
    }
    public void Chapter8(){
        Intent Chapter8 = new Intent(Chapter11.this , Chapter8.class);
        startActivity(Chapter8);
    }
    public void Chapter9(){
        Intent Chapter9 = new Intent(Chapter11.this , Chapter9.class);
        startActivity(Chapter9);
    }
    public void Chapter10(){
        Intent Chapter10 = new Intent(Chapter11.this , Chapter10.class);
        startActivity(Chapter10);
    }
    public void ExitToMain(){
        Intent ExitToMain = new Intent(Chapter11.this , lismenu.class);
        startActivity(ExitToMain);
    }
}