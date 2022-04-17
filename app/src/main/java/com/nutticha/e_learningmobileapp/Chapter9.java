package com.nutticha.e_learningmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

public class Chapter9 extends AppCompatActivity implements View.OnClickListener{
    private Button btnList9 , btnCustom9 , btnGrid9 , btnWeb9 , btnSearch9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter9);
        btnList9 = (Button) findViewById(R.id.btnList9);
        btnCustom9 = (Button) findViewById(R.id.btnCustom9);
        btnGrid9 = (Button) findViewById(R.id.btnGrid9);
        btnWeb9 = (Button) findViewById(R.id.btnWeb9);
        btnSearch9 = (Button) findViewById(R.id.btnSearch9);
        btnList9.setOnClickListener(this);
        btnCustom9.setOnClickListener(this);
        btnGrid9.setOnClickListener(this);
        btnWeb9.setOnClickListener(this);
        btnSearch9.setOnClickListener(this);
    }

    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btnList9){
            ListView();
        }
        else if (id == R.id.btnCustom9){
            CustomListview();
        }
        else if (id == R.id.btnGrid9){
            GridView();
        }
        else if (id == R.id.btnWeb9){
            WebView();
        }
        else if (id == R.id.btnSearch9) {
            SearchView();
        }
    }

    public void ListView(){
        Intent ListView = new Intent(Chapter9.this , ListView.class);
        startActivity(ListView);
    }
    public void CustomListview(){
        Intent CustomListview = new Intent(Chapter9.this , CustomListview.class);
        startActivity(CustomListview);
    }
    public void GridView(){
        Intent GridView = new Intent(Chapter9.this , GridView.class);
        startActivity(GridView);
    }
    public void WebView(){
        Intent WebView = new Intent(Chapter9.this , WebView.class);
        startActivity(WebView);
    }
    public void SearchView(){
        Intent SearchView = new Intent(Chapter9.this , SearchView.class);
        startActivity(SearchView);
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
                return true;
            case R.id.chapter010:
                Chapter10();
                return true;
            case R.id.chapter011:
                Chapter11();
                return true;
            case R.id.ExitToMain:
                ExitToMain();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void Chapter4(){
        Intent Chapter4 = new Intent(Chapter9.this , Chapter4.class);
        startActivity(Chapter4);
    }
    public void Chapter5(){
        Intent Chapter5 = new Intent(Chapter9.this , Chapter5.class);
        startActivity(Chapter5);
    }
    public void Chapter3(){
        Intent Chapter3 = new Intent(Chapter9.this , Chapter3.class);
        startActivity(Chapter3);
    }
    public void Chapter6(){
        Intent Chapter6 = new Intent(Chapter9.this , Chapter6.class);
        startActivity(Chapter6);
    }
    public void Chapter7(){
        Intent Chapter7 = new Intent(Chapter9.this , Chapter7.class);
        startActivity(Chapter7);
    }
    public void Chapter8(){
        Intent Chapter8 = new Intent(Chapter9.this , Chapter8.class);
        startActivity(Chapter8);
    }
    public void Chapter10(){
        Intent Chapter10 = new Intent(Chapter9.this , Chapter10.class);
        startActivity(Chapter10);
    }
    public void Chapter11(){
        Intent Chapter11 = new Intent(Chapter9.this , Chapter11.class);
        startActivity(Chapter11);
    }
    public void ExitToMain(){
        Intent ExitToMain = new Intent(Chapter9.this , lismenu.class);
        startActivity(ExitToMain);
    }
}