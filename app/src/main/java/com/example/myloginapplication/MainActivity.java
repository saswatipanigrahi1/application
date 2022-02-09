package com.example.myloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected Button login;
    protected EditText Username;
    protected EditText password;
    protected String input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Username=findViewById(R.id.username);
        Username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        init();
    }

    public void init() {
        login = findViewById(R.id.loginbtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = "Hello " + Username.getText().toString().trim();
                Toast.makeText(MainActivity.this, input, Toast.LENGTH_LONG).show();
                // Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
                // Log.v("hello",);
            }
        });


    }
}