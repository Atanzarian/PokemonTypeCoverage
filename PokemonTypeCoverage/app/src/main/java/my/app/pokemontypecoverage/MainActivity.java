package my.app.pokemontypecoverage;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start_coverage(View view) {
        Intent intent=new Intent(MainActivity.this,Coverage.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        MainActivity.this.startActivity(intent);
    }
    public void start_attacking(View view) {
        Intent intent=new Intent(MainActivity.this,Attacking.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        MainActivity.this.startActivity(intent);
    }


}
