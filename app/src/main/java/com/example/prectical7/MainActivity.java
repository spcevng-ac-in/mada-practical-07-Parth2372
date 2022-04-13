package com.example.prectical7;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageButton;

import android.view.View;

import com.google.android.material.internal.CheckableImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton KTM,TVS;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KTM= findViewById(R.id.KTM);
        TVS=findViewById(R.id.TVS);


        KTM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity .class);
                intent.putExtra("id", R.id.KTM);

                startActivity(intent);
            }
    });



        TVS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity .class);
                intent.putExtra("id", R.id.TVS);

                startActivity(intent);
            }
        });


        }


    }

