package com.example.user.pkr1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button c,d,e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
         c = (Button)findViewById(R.id.button);
        c.setOnClickListener(this);
        d = (Button)findViewById(R.id.button1);
        d.setOnClickListener(this);
        e = (Button)findViewById(R.id.button2);
        e.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent i = new Intent(MainActivity.this, Aboutpkr.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.button1:
                Uri uri = Uri.parse("http://www.pokharatourism.org.np/news-events/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }
        switch (v.getId()) {
            case R.id.button2:
                Intent i = new Intent(MainActivity.this, Member.class);
                startActivity(i);


        }

    }

}

