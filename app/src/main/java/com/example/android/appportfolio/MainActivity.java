package com.example.android.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static String msgMoviesApp = "This button will launch my Movies app";
    public static String msgStockHawk= "This button will launch my Stock Hawk app";
    public static String msgBuildBiggerApp = "This button will make my App Bigger";
    public static String msgMaterialApp = "This button will transform my app using Material design";
    public static String msgUbiquitousApp = "This buttion will make my app ubiquitous";
    public static String msgCapstoneProjectApp = "This is my Capstone project";



    public void moviesAppButton(View view){
        Toast.makeText(this,msgMoviesApp,Toast.LENGTH_SHORT).show();

    }

    public void stockHawkAppButton(View view){
        Toast.makeText(this,msgStockHawk,Toast.LENGTH_SHORT).show();
    }

    public void buildBiggerAppButton(View view){
        Toast.makeText(this,msgBuildBiggerApp,Toast.LENGTH_SHORT).show();
    }

    public void materialAppButton(View view){
        Toast.makeText(this,msgMaterialApp,Toast.LENGTH_SHORT).show();
    }

    public void ubiquitousAppButton(View view){
        Toast.makeText(this,msgUbiquitousApp,Toast.LENGTH_SHORT).show();
    }

    public void capstoneProjectAppButton(View view){
        Toast.makeText(this,msgCapstoneProjectApp,Toast.LENGTH_SHORT).show();
    }

}
