package com.ishra.radio_button_data_pass;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
 RadioGroup radioSimgroup;
 RadioButton radioSimButton;
 Button btndisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
      adListenerOnButton();
    }
  public void adListenerOnButton(){
        radioSimgroup=findViewById(R.id.btg1);
        btndisplay=findViewById(R.id.bt);
      btndisplay.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent ii=new Intent(v.getContext(),Second_Activity.class);
              int selectedId=radioSimgroup.getCheckedRadioButtonId();
              radioSimButton=findViewById(selectedId);
              String rdata=radioSimButton.getText().toString().trim();
              ii.putExtra("k",rdata);
              startActivity(ii);
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
