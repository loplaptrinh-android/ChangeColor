package com.tiendung.admin.changecolor;

import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnRed = (Button) findViewById(R.id.btnRed);
        Button btnGreen = (Button) findViewById(R.id.btnGreen);
        Button btnBlue = (Button) findViewById(R.id.btnBlue);
        RadioButton radRed =(RadioButton) findViewById(R.id.radRed);
        RadioButton radGreen = (RadioButton) findViewById(R.id.radGreen);
        RadioButton radBlue = (RadioButton) findViewById(R.id.radBlue);
        final TextView txtColor = (TextView) findViewById(R.id.textView);
       // btnRed.setOnClickListener(new ColorListener(Color.RED,txtColor));
        btnGreen.setOnClickListener(new ColorListener(Color.GREEN,txtColor));
        btnBlue.setOnClickListener(new ColorListener(Color.BLUE,txtColor));
        radRed.setOnClickListener(new ColorListener(Color.RED,txtColor));
        radGreen.setOnClickListener(new ColorListener(Color.GREEN,txtColor));
        radBlue.setOnClickListener(new ColorListener(Color.BLUE,txtColor));
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtColor.setBackgroundColor(Color.RED);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
