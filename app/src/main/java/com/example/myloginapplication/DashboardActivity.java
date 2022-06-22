package com.example.myloginapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class DashboardActivity extends AppCompatActivity {

    protected String userName;
    public DrawerLayout drawerLayout;
    protected BottomSheetDialog bottomSheetDialog;
    protected Dialog dialog;
    Button algoButton, dialogButton;



    public ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        userName = getIntent().getStringExtra("username");
        drawerLayout = findViewById(R.id.my_drawer_layout);
        algoButton = findViewById(R.id.algo_button);
        dialogButton = findViewById(R.id.dialog_button);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        createOnClickListenerBottomSheet();
        createOnClickListenerForDialogButton();


    }

    private void createOnClickListenerBottomSheet() {
        algoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBottomSheet();
            }
        });
    }

    private void createOnClickListenerForDialogButton() {
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    private void openBottomSheet() {
        bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_layout);
        final Button bottomsheetButton = bottomSheetDialog.findViewById(R.id.close);

        bottomsheetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.show();
    }

    private void openDialog() {
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.bottom_dialog_layout);
        final Button dialog_close = dialog.findViewById(R.id.dialog_close);

        dialog_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });


        dialog.show();
    }


    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




    }







