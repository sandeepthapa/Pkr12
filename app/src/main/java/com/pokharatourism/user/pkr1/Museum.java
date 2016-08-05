package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Museum extends AppCompatActivity implements View.OnClickListener{
    Button f,g,h,i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);
        f = (Button)findViewById(R.id.btn1);
        f.setOnClickListener(this);
        g = (Button)findViewById(R.id.btn2);
        g.setOnClickListener(this);
        h = (Button)findViewById(R.id.btn3);
        h.setOnClickListener(this);
        i = (Button)findViewById(R.id.btn4);
        i.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent i = new Intent(Museum.this, Intern.class);
                startActivity(i);


        }

        switch (v.getId()) {
            case R.id.btn2:
                Intent i = new Intent(Museum.this, Region.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn3:
                Intent i = new Intent(Museum.this, Annapurna.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn4:
                Intent i = new Intent(Museum.this, Gurkha.class);
                startActivity(i);


        }
    }
}
