package com.example.lakshya;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class athlete_sign_in_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_athlete_sign_in_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    // Java
    Spinner mySpinner = findViewById(R.id.my_spinner);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.spinner_items, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    mySpinner.setAdapter(adapter);

    mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

    {
        public void onItemSelected (AdapterView < ? > parent, View view, int position, long id){
        String selectedItem = parent.getItemAtPosition(position).toString();
        // Handle selected item
    }

        @Override
        public void onNothingSelected (AdapterView < ? > parent) {
        // Handle no selection
    }
    });
    }
}