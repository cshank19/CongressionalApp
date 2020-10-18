package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

// drop down imports
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Spinner dropDown = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> majorAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.majorParts));
        dropDown.setAdapter(majorAdapter);

        dropDown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    goToPartsScreen(0);
                }else if(i == 1){
                    goToPartsScreen(1);
                }else if(i == 2){
                    goToPartsScreen(2);
                }


            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                goToPartsScreen(1);
            }
        });
    }


    private void goToPartsScreen(final int arrayIndex)
    {
        Button partsScreen = (Button) findViewById(R.id.stretchScreen);
        partsScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(arrayIndex == 0){
                    //arms screen
                }else if(arrayIndex == 1){
                    //back scree
                }else if(arrayIndex == 2){
                    //legs screen
                   // startActivity(new Intent(MainActivity.this, Calves.class));
                }



            }
        });
    }
}

