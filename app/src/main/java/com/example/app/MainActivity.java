package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Button to go to next screen
        goToPartsScreen();

//test comment by james
    }

    private void goToPartsScreen()
    {
        final Button partsScreen = (Button) findViewById(R.id.stretchScreen);
        partsScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Log.i("My btn", "Button pressed");
                Toast.makeText(getApplicationContext(), "Its working", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Calves.class));
            }
        });
    }


}