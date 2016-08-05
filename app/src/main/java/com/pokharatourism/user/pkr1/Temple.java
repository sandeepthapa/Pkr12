package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Temple extends AppCompatActivity implements View.OnClickListener {
    Button f,g,h,i,j,k,l,m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple);
        f = (Button)findViewById(R.id.btn1);
        f.setOnClickListener(this);
        g = (Button)findViewById(R.id.btn2);
        g.setOnClickListener(this);
        h = (Button)findViewById(R.id.btn3);
        h.setOnClickListener(this);
        i = (Button)findViewById(R.id.btn4);
        i.setOnClickListener(this);
        j = (Button)findViewById(R.id.btn5);
        j.setOnClickListener(this);
        k = (Button)findViewById(R.id.btn6);
        k.setOnClickListener(this);
        l = (Button)findViewById(R.id.btn7);
        l.setOnClickListener(this);
        m = (Button)findViewById(R.id.btn8);
        m.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent i = new Intent(Temple.this, Barahi.class);
                startActivity(i);


        }

        switch (v.getId()) {
            case R.id.btn2:
                Intent i = new Intent(Temple.this, Kedar.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn3:
                Intent i = new Intent(Temple.this, Ram.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn4:
                Intent i = new Intent(Temple.this, Binda.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn5:
                Intent i = new Intent(Temple.this, World.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn6:
                Intent i = new Intent(Temple.this, Harihar.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn7:
                Intent i = new Intent(Temple.this, Bhadra.class);
                startActivity(i);
        }
        switch (v.getId()) {
            case R.id.btn8:
                Intent i = new Intent(Temple.this, Tibetan.class);
                startActivity(i);


        }

    }
}
