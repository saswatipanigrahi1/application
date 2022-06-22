package com.example.myloginapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    protected RecyclerView recycler_list;
    protected LinearLayoutManager linearLayoutManager;
    protected ArrayList<String> nameList = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recycler_list = findViewById(R.id.recycler_list);
        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recycler_list.setLayoutManager(linearLayoutManager);
        nameList.add("saswati");
        nameList.add("riki");
        nameList.add("disha");
        nameList.add("lucky");

    }
}