package com.example.my_cats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Dogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs);

        Button dog = (Button) findViewById(R.id.dog_back_btn);
        dog.setOnClickListener(v -> HomeActivity());
    }

    public  void  HomeActivity(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}