package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner dropDown = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> majorAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.majorParts));
        dropDown.setAdapter(majorAdapter);
        // Button to go to next screen
     //   goToPartsScreen();


    }

  /*  private void goToPartsScreen()
    {
        Button partsScreen = (Button) findViewById(R.id.stretchScreen);
        partsScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Log.i("My btn", "Button pressed");
               // Toast.makeText(getApplicationContext(), "Its working", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Calves.class));
            }
        });
    }*/


}