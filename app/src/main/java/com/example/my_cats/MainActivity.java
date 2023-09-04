package com.example.my_cats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Username, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.login_btn);
        button.setOnClickListener(v -> Login());

    }

    public  void  Login(){
        Username = (EditText) findViewById(R.id.username_input);
        Password = (EditText) findViewById(R.id.password_input);
        if (Username.getText().toString().equals("admin") && Password.getText().toString().equals("1234")) {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Username or Password is Incorrect!", Toast.LENGTH_LONG).show();
        }
    }
}