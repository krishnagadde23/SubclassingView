package com.example.kgadde.subclassingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MyTextView v1 = (MyTextView) findViewById(R.id.myView001);
        v1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                v1.incrementandUpdate();
            }
        });

        final MyTextView v2 = (MyTextView) findViewById(R.id.myView002);
        v2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                v2.incrementandUpdate();
            }
        });

        final MyTextView v3 = (MyTextView) findViewById(R.id.myView003);
        v3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                v3.incrementandUpdate();
            }
        });

        final MyTextView v4 = (MyTextView) findViewById(R.id.myView004);
        v4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                v4.incrementandUpdate();
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
