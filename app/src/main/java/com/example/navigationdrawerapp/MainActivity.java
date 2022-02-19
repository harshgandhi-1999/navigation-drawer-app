package com.example.navigationdrawerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        MaterialToolbar topAppBar = findViewById(R.id.topAppBar);
        NavigationView navigationView = findViewById(R.id.navigationView);

        topAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);

            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                drawerLayout.closeDrawer(GravityCompat.START);
                String message = "";
                switch (id){
                    case R.id.homeMenuItem:
                        message = "Home is clicked";
                        break;
                    case R.id.messagesMenuItem:
                        message = "Messages is clicked";
                        break;
                    case R.id.syncMenuItem:
                        message = "Sync is clicked";
                        break;
                    case R.id.trashMenuItem:
                        message = "Trash is clicked";
                        break;
                    case R.id.settingsMenuItem:
                        message = "Settings is clicked";
                        break;
                    case R.id.loginMenuItem:
                        message = "Login is clicked";
                        break;
                    case R.id.shareMenuItem:
                        message = "Share is clicked";
                        break;
                    case R.id.rateMenuItem:
                        message = "Rate Us is clicked";
                        break;
                }

                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}