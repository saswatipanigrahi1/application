package com.example.myloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
        Username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        Username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (Username.getText().toString().trim().length() == 10){
                    password.setVisibility(View.VISIBLE);
                }else {
                    password.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });





        init();
    }


    public void init() {
        login = findViewById(R.id.loginbtn);
        login.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         // input = "Hello " + Username.getText().toString().trim();
                                         if (Username.getText().toString().isEmpty()) {
                                             input = "Username Field can't be empty";
                                             Toast.makeText(MainActivity.this, input, Toast.LENGTH_LONG).show();

                                             return;
                                         }


                                         if (password.getText().toString().isEmpty()) {
                                             input = "Password Field can't be empty";
                                             Toast.makeText(MainActivity.this, input, Toast.LENGTH_LONG).show();

                                             return;
                                         }

                                         Intent i;
                                         i = new Intent(MainActivity.this,DashboardActivity.class);
                                         i.putExtra("username",Username.getText().toString().trim());
                                         startActivity(i);

                                     }
                                 });

            }

}









