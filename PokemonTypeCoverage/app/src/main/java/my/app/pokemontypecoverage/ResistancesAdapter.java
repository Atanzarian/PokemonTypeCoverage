package my.app.pokemontypecoverage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;



/**
 * Created by ams3141 on 3/23/2017.
 */

class ResistancesAdapter extends BaseAdapter
{
    ArrayList<Integer> colors;
    Context context;

    public ResistancesAdapter(Context context)
    {
        this.context=context;
        colors=new ArrayList<Integer>();
        int retrieve []=context.getResources().getIntArray(R.array.androidcolors);
        for(int re:retrieve)
        {
            colors.add(re);
        }


    }
    @Override
    public int getCount()
    {
        return colors.size();
    }
    @Override
    public Object getItem(int arg0)
    {
        return colors.get(arg0);
    }
    @Override
    public long getItemId(int arg0)
    {
        return arg0;
    }
    @Override
    public View getView(int pos, View view, ViewGroup parent)
    {
        LayoutInflater inflater=LayoutInflater.from(context);
        view=inflater.inflate(android.R.layout.simple_spinner_dropdown_item, null);
        TextView txv=(TextView)view.findViewById(android.R.id.text1);
        txv.setBackgroundColor(colors.get(pos));
        txv.setTextSize(16f);
        //txv.setText(pos + "  " + colors.get(pos) + colors.get(pos)  );
        //txv.setText(+pos + "  " + colors.get(pos)  + "  " + context.getResources().getStringArray(R.array.colornames)[pos] );
        //txv.setText(String.valueOf(Totals.getTot(pos)) + "          " + String.valueOf(Totals.getTot(pos)/ Coverage.count));
        //txv.setText(String.valueOf(Totals.getTot(pos)) + "  " + String.valueOf(Totals.weaknesses[pos]) + "  " +String.valueOf(Totals.resistances[pos]) );
        txv.setText(String.valueOf(Totals.resistances[pos]));
        //txv.setText(String.valueOf(context.getResources().getIntArray(R.array.coverage)[pos] ));
        return view;
    }

}
