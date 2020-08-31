package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calves extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calves);
        subCategories();
    }

    private void subCategories()
    {

        Button medHead = (Button) findViewById(R.id.MeadialHead);
        Button gasMuscle = (Button) findViewById(R.id.GasMuscle);
        Button calcTendon = (Button) findViewById(R.id.Calcaneal);
        Button solMuscle = (Button) findViewById(R.id.Soleus);


        medHead.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Log.i("My btn", "Button pressed");
                // Toast.makeText(getApplicationContext(), "Its working", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Calves.this, MedialHead.class));
            }
        });
        gasMuscle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Log.i("My btn", "Button pressed");
                // Toast.makeText(getApplicationContext(), "Its working", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Calves.this, Gastrocnemius.class));
            }
        });
        calcTendon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Log.i("My btn", "Button pressed");
                // Toast.makeText(getApplicationContext(), "Its working", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Calves.this, Calcaneal.class));
            }
        });
        solMuscle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Log.i("My btn", "Button pressed");
                // Toast.makeText(getApplicationContext(), "Its working", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Calves.this, SoleusMuscle.class));
            }
        });
    }



}