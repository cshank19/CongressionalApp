package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PartsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts_screen);

        goBack();
    }

    private void goBack()
    {
        Button goBack = (Button) findViewById(R.id.backButton);
        goBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Log.i("My btn", "Button pressed");

                finish();
            }
        });



    }
}