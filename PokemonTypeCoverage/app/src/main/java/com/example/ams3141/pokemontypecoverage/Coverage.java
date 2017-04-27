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

        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[0] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[0] ){
            Totals.Normal();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[1] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[1] ){
            Totals.Fire();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[2] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[2] ){
            Totals.Water();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[3] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[3] ){
            Totals.Electric();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[4] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[4] ){
            Totals.Grass();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[5] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[5] ){
            Totals.Ice();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[6] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[6] ){
            Totals.Fighting();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[7] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[7] ){
            Totals.Poison();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[8] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[8] ){
            Totals.Ground();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[9] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[9] ){
            Totals.Flying();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[10] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[10] ){
            Totals.Psychic();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[11] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[11] ){
            Totals.Bug();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[12] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[12] ){
            Totals.Rock();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[13] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[13] ){
            Totals.Ghost();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[14] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[14] ){
            Totals.Dragon();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[15] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[15] ){
            Totals.Dark();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[16] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[16] ){
            Totals.Steel();
        }
        if (Integer.parseInt(String.valueOf(color1.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[17] || Integer.parseInt(String.valueOf(color2.getSelectedItem())) == getResources().getIntArray(R.array.androidcolors)[17] ){
            Totals.Fairy();
        }



        //Totals.setTot(getResources().getIntArray(R.array.androidcolors)[0], 0);
        //Totals.setTot(Integer.parseInt(String.valueOf(color1.getSelectedItem())), 1);
        ListView types3  = (ListView) findViewById(R.id.types);
        types3.setAdapter(new List2Adapter(this));

    }

}
