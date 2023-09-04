package com.example.my_cats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton cat = (ImageButton) findViewById(R.id.cat_btn);
        cat.setOnClickListener(v -> CatsActivity());

        ImageButton dog = (ImageButton) findViewById(R.id.dog_btn);
        dog.setOnClickListener(v -> DogsActivity());

        ImageButton logout = (ImageButton) findViewById(R.id.logout_btn);
        logout.setOnClickListener(v -> MainActivity());
    }

    public  void  CatsActivity(){
        Intent intent = new Intent(this, Cats_2.class);
        startActivity(intent);
    }
    public  void  DogsActivity(){
        Intent intent = new Intent(this, Dogs.class);
        startActivity(intent);
    }

    public  void MainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}