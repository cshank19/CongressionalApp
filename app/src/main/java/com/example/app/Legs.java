package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Legs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);

        Spinner legParts = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> majorAdapter = new ArrayAdapter<String>(Legs.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.legMuscles));
        legParts.setAdapter(majorAdapter);

        legParts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {//quads
                    goToLegsPartsScreen(0);
                }else if(i == 1){//hamstrings
                    goToLegsPartsScreen(1);
                }else if(i == 2){//knees
                    goToLegsPartsScreen(2);
                }else if(i == 3){//calves
                    goToLegsPartsScreen(3);
                }else if(i == 4){//foot
                    goToLegsPartsScreen(4);
                }



            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void goToLegsPartsScreen(final int arrayIndex)
    {
        Button legPartsScreen = (Button) findViewById(R.id.next);
        legPartsScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(arrayIndex == 0){
                    startActivity(new Intent(Legs.this, Quads.class));
                }else if(arrayIndex == 1){
                    startActivity(new Intent(Legs.this, Hamstrings.class));
                }else if(arrayIndex == 2){
                    startActivity(new Intent(Legs.this, Knee.class));

                }else if(arrayIndex == 3){
                    startActivity(new Intent(Legs.this, Calves.class));
                }else if(arrayIndex == 4){
//
                }



            }
        });
    }
}