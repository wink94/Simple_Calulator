package com.sliit.simple_calc_constraint;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


/*    private TextView appName;
    private ImageView logo;*/
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("CODEFEST-Calculator");

        getSupportActionBar().setLogo(R.drawable.sliit_codefest);


    initializeFields();
    }

   private void initializeFields(){

        /*ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        LayoutInflater layoutInflater= (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View actionbarView=layoutInflater.inflate(R.layout.calc_actionbar_relative,null);
        actionBar.setCustomView(actionbarView);

        appName=(TextView) findViewById(R.id.title);
        logo=(ImageView) findViewById(R.id.logo);*/


    }


}
