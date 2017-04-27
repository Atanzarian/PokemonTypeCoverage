package com.example.ams3141.pokemontypecoverage;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.id;
import static android.R.interpolator.linear;


public class Coverage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coverage);

        Spinner spnColors1  = (Spinner) findViewById(R.id.spinner1);
        spnColors1.setAdapter(new SpinnerAdapter(this));


        Spinner spnColors2  = (Spinner) findViewById(R.id.spinner2);
        spnColors2.setAdapter(new SpinnerAdapter(this));

        ListView coverage  = (ListView) findViewById(R.id.coverage);
        coverage.setAdapter(new ListAdapter(this));

        ListView types  = (ListView) findViewById(R.id.types);
        types.setAdapter(new List2Adapter(this));


        /*
        Button myButton = new Button(this);
        myButton.setText("Push Me");

        LinearLayout ll = (LinearLayout)findViewById(R.id.linear2);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        ll.addView(myButton, lp);
        */

    }
    public void onClickFindTypes(View view) {
        ListView brands = (ListView) findViewById(R.id.types);
        Spinner color1 = (Spinner) findViewById(R.id.spinner1);
        Spinner color2 = (Spinner) findViewById(R.id.spinner2);



        String type1 = String.valueOf(color1.getSelectedItem());
        String type2 = String.valueOf(color2.getSelectedItem());



        /*
        List<String> types = new ArrayList<String>();
        types.add(type1);
        types.add(type2);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : types) {
            brandsFormatted.append(brand).append('\n');
        }
        */

        //brands.setText(brandsFormatted);
        //getResources().getIntArray(R.array.coverage)[0] = 1;

        //if (Integer.getInteger(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.coverage)[0] || Integer.getInteger(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.coverage)[0]){
            Totals.Fire();
        //}



        //Totals.setTot(2, 2);
        ListView types3  = (ListView) findViewById(R.id.types);
        types3.setAdapter(new List2Adapter(this));

    }

}
