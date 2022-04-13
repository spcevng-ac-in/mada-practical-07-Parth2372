package com.example.prectical7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
      int id = intent.getIntExtra("id",0);
      Log.d("display", String.valueOf(id));
        ImageButton image = findViewById(R.id.temp);
      if (id == R.id.KTM)
        image.setImageResource(R.drawable.KTM);
       else if (id == R.id.TVS)
            image.setImageResource(R.drawable.TVS);

    }
}
