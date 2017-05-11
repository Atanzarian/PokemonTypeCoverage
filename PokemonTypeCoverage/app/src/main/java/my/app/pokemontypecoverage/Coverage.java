package my.app.pokemontypecoverage;

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

    public static int count = 0;
    public static int sum_weak = 0;
    public static int sum_res = 0;
    public static int sum_imm = 0;
    public static float total = 0;
    public static float total2 = 0;
    public static float rating = 0;
    public static float var = 0;
    public static float stddv = 0;
    public static float dev = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        count = 0;
        setContentView(R.layout.activity_coverage);

        Spinner spnColors1  = (Spinner) findViewById(R.id.spinner1);
        spnColors1.setAdapter(new SpinnerAdapter(this));


        Spinner spnColors2  = (Spinner) findViewById(R.id.spinner2);
        spnColors2.setAdapter(new SpinnerAdapter(this));

        ListView coverage  = (ListView) findViewById(R.id.coverage);
        coverage.setAdapter(new ListAdapter(this));

        ListView types  = (ListView) findViewById(R.id.types);
        types.setAdapter(new List2Adapter(this));

        ListView weak  = (ListView) findViewById(R.id.weaknesses);
        weak.setAdapter(new WeaknessesAdapter(this));

        ListView res  = (ListView) findViewById(R.id.resistance);
        res.setAdapter(new ResistancesAdapter(this));

        ListView imm  = (ListView) findViewById(R.id.immunes);
        imm.setAdapter(new ImmunesAdapter(this));




        TextView rating_text  = (TextView) findViewById(R.id.rating_text);
        rating_text.setText("Average Rating");
        TextView average_rating  = (TextView) findViewById(R.id.average_rating);
        average_rating.setText(String.valueOf(stddv));
        TextView total_sum  = (TextView) findViewById(R.id.total_sum);
        total_sum.setText(String.valueOf(total));
        TextView total_res  = (TextView) findViewById(R.id.total_res);
        total_res.setText(String.valueOf(sum_res));
        TextView total_weak  = (TextView) findViewById(R.id.total_weak);
        total_weak.setText(String.valueOf(sum_weak));
        TextView total_imm  = (TextView) findViewById(R.id.total_imm);
        total_imm.setText(String.valueOf(sum_imm));

    }
    public void onClickFindTypes(View view) {
        ListView brands = (ListView) findViewById(R.id.types);
        Spinner color1 = (Spinner) findViewById(R.id.spinner1);
        Spinner color2 = (Spinner) findViewById(R.id.spinner2);

        String type1 = String.valueOf(color1.getSelectedItem());
        String type2 = String.valueOf(color2.getSelectedItem());


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


        for (int i = 0; i < Totals.tots.length; i++) {
            if (Totals.tots[i] == 4) Totals.weaknesses[i] += 2;
            if (Totals.tots[i] == 2) Totals.weaknesses[i] += 1;
            if (Totals.tots[i] == .5) Totals.resistances[i] += 1;
            if (Totals.tots[i] == 0) Totals.immunes[i] += 1;
        }


        sum_res = 0;
        sum_weak = 0;
        sum_imm = 0;
        total=0;

        Totals.sum();
        Totals.reset_tots();

        for (int i = 0; i < Totals.tots.length; i++) {
            sum_weak += Totals.weaknesses[i];
            sum_res += Totals.resistances[i];
            sum_imm += Totals.immunes[i];
            total += Totals.tots2[i];
        }

        total2=0;
        count ++;
        for (int i = 0; i < Totals.tots2.length; i++) {
            total2 += Totals.tots2[i];
        }
        rating = (total2/18);

        float temp = 0;
        for(float a :Totals.tots2)
            temp += (a-rating)*(a-rating);
        var = temp/18;
        dev = ((float)Math.sqrt(var)/count);
        //stddv = 1-((((float)Math.sqrt(rating)/count)-1)/1);
        //stddv = rating;


        stddv = 100*(float)Math.pow((double)1.1, (double)(sum_res- ((float)Math.pow(var, var*var) + sum_weak + sum_imm)) );

        TextView rating_text  = (TextView) findViewById(R.id.rating_text);
        rating_text.setText("Average Rating");
        TextView average_rating  = (TextView) findViewById(R.id.average_rating);
        average_rating.setText(String.valueOf(stddv));
        TextView total_sum  = (TextView) findViewById(R.id.total_sum);
        total_sum.setText(String.valueOf(total));
        TextView total_res  = (TextView) findViewById(R.id.total_res);
        total_res.setText(String.valueOf(sum_res));
        TextView total_weak  = (TextView) findViewById(R.id.total_weak);
        total_weak.setText(String.valueOf(sum_weak));
        TextView total_imm  = (TextView) findViewById(R.id.total_imm);
        total_imm.setText(String.valueOf(sum_imm));


        ListView types3  = (ListView) findViewById(R.id.types);
        types3.setAdapter(new List2Adapter(this));

        ListView weak  = (ListView) findViewById(R.id.weaknesses);
        weak.setAdapter(new WeaknessesAdapter(this));

        ListView res  = (ListView) findViewById(R.id.resistance);
        res.setAdapter(new ResistancesAdapter(this));

        ListView imm  = (ListView) findViewById(R.id.immunes);
        imm.setAdapter(new ImmunesAdapter(this));

    }
    public void clearTotals(View view){
        total=0;
        count=0;
        rating=0;
        stddv =0;
        sum_res = 0;
        sum_weak = 0;
        sum_imm = 0;
        total=0;
        total2=0;
        var=0;
        dev=0;
        Totals.reset_tots2();
        Totals.reset_resistances();
        Totals.reset_immunes();
        Totals.reset_weaknesses();
        TextView rating_text  = (TextView) findViewById(R.id.rating_text);
        rating_text.setText("Average Rating");
        TextView average_rating  = (TextView) findViewById(R.id.average_rating);
        average_rating.setText(String.valueOf(stddv));
        TextView total_sum  = (TextView) findViewById(R.id.total_sum);
        total_sum.setText(String.valueOf(total));
        TextView total_res  = (TextView) findViewById(R.id.total_res);
        total_res.setText(String.valueOf(sum_res));
        TextView total_weak  = (TextView) findViewById(R.id.total_weak);
        total_weak.setText(String.valueOf(sum_weak));
        TextView total_imm  = (TextView) findViewById(R.id.total_imm);
        total_imm.setText(String.valueOf(sum_imm));



        ListView types3  = (ListView) findViewById(R.id.types);
        types3.setAdapter(new List2Adapter(this));

        ListView weak  = (ListView) findViewById(R.id.weaknesses);
        weak.setAdapter(new WeaknessesAdapter(this));

        ListView res  = (ListView) findViewById(R.id.resistance);
        res.setAdapter(new ResistancesAdapter(this));

        ListView imm  = (ListView) findViewById(R.id.immunes);
        imm.setAdapter(new ImmunesAdapter(this));
    }
    public void start_coverage(View view) {
        total=0;
        count=0;
        rating=0;
        stddv =0;
        sum_res = 0;
        sum_weak = 0;
        sum_imm = 0;
        total=0;
        total2=0;
        var=0;
        dev=0;
        Totals.reset_tots2();
        Totals.reset_resistances();
        Totals.reset_immunes();
        Totals.reset_weaknesses();
        TextView rating_text  = (TextView) findViewById(R.id.rating_text);
        rating_text.setText("Average Rating");
        TextView average_rating  = (TextView) findViewById(R.id.average_rating);
        average_rating.setText(String.valueOf(stddv));
        TextView total_sum  = (TextView) findViewById(R.id.total_sum);
        total_sum.setText(String.valueOf(total));
        TextView total_res  = (TextView) findViewById(R.id.total_res);
        total_res.setText(String.valueOf(sum_res));
        TextView total_weak  = (TextView) findViewById(R.id.total_weak);
        total_weak.setText(String.valueOf(sum_weak));
        TextView total_imm  = (TextView) findViewById(R.id.total_imm);
        total_imm.setText(String.valueOf(sum_imm));



        ListView types3  = (ListView) findViewById(R.id.types);
        types3.setAdapter(new List2Adapter(this));

        ListView weak  = (ListView) findViewById(R.id.weaknesses);
        weak.setAdapter(new WeaknessesAdapter(this));

        ListView res  = (ListView) findViewById(R.id.resistance);
        res.setAdapter(new ResistancesAdapter(this));

        ListView imm  = (ListView) findViewById(R.id.immunes);
        imm.setAdapter(new ImmunesAdapter(this));
        Intent intent=new Intent(Coverage.this,Attacking.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Coverage.this.startActivity(intent);
    }


}
