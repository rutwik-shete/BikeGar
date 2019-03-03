package com.bikegar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Spinner DesigSpinner = findViewById(R.id.DesigSpinner);
        ArrayAdapter<CharSequence> DesigAdapter = ArrayAdapter.createFromResource(this,R.array.Designation,android.R.layout.simple_spinner_dropdown_item);
        DesigAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        DesigSpinner.setAdapter(DesigAdapter);

        Spinner BikeCompSpinner = findViewById(R.id.BikeCompSpinner);
        ArrayAdapter <CharSequence> BikeCompAdapter = ArrayAdapter.createFromResource(this,R.array.BikeComp,android.R.layout.simple_spinner_dropdown_item);
        DesigAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        BikeCompSpinner.setAdapter(BikeCompAdapter);

        Spinner BikeModelSpinner = findViewById(R.id.BikeModelSpinner);
        ArrayAdapter <CharSequence> BikeModelAdapter = ArrayAdapter.createFromResource(this,R.array.BikeModel,android.R.layout.simple_spinner_dropdown_item);
        DesigAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        BikeModelSpinner.setAdapter(BikeModelAdapter);

        Spinner BikeCompOwnerSpinner = findViewById(R.id.BikeCompOwnerSpinner);
        ArrayAdapter <CharSequence> BikeCompOwnerAdapter = ArrayAdapter.createFromResource(this,R.array.BikeCompOwner,android.R.layout.simple_spinner_dropdown_item);
        DesigAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        BikeCompOwnerSpinner.setAdapter(BikeCompOwnerAdapter);
    }
}
