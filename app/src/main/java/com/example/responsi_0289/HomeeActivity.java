package com.example.responsi_0289;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeeActivity extends AppCompatActivity {


    Button btn_fragpertama, btn_fragkedua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homee);


        btn_fragpertama = findViewById(R.id.btn_fragpertama);
        btn_fragkedua = findViewById(R.id.btn_fragkedua);

        Intent intent = getIntent();in
        btn_fragpertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment (new FragmentOne());
            }
        });
        btn_fragkedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FragmentTwo());
            }
        });
    }
    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}
