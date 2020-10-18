package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

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

                }else if(i == 1){//hamstrings

                }else if(i == 2){//knees

                }else if(i == 3){//calves

                }else if(i == 4){//foot

                }



            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void goToPartsScreen(final int arrayIndex)
    {
        Button partsScreen = (Button) findViewById(R.id.stretchScreen);
        partsScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(arrayIndex == 0){
                    //quads
                }else if(arrayIndex == 1){
                    //hams
                }else if(arrayIndex == 2){
                    //knee

                }else if(arrayIndex == 3){
                    //calves
                }else if(arrayIndex == 4){
                    //foot

                }



            }
        });
    }
}