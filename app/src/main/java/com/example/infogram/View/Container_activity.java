package com.example.infogram.View;


import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.infogram.R;
import com.example.infogram.View.fragment.HomeFragment;
import com.example.infogram.View.fragment.ProfileFragment;
import com.example.infogram.View.fragment.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Container_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container_activity);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener(){
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        Fragment selectedFragment = null;
                        switch (item.getItemId()){
                            case R.id.search:
                                selectedFragment= new SearchFragment();
                                break;

                            case R.id.casa:
                                selectedFragment = new HomeFragment();
                                break;

                            case R.id.profile:
                                selectedFragment=new ProfileFragment();
                                break;
                        }
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container_frame, selectedFragment)
                                .commit();

                        return true;
                    }
                }
        );
    }
}