package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Appendices extends AppCompatActivity implements View.OnClickListener {
    Button f,g,h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appendices);
        f = (Button)findViewById(R.id.btn1);
        f.setOnClickListener(this);
        g = (Button)findViewById(R.id.btn2);
        g.setOnClickListener(this);
        h = (Button)findViewById(R.id.btn3);
        h.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent i = new Intent(Appendices.this, Glimpse.class);
                startActivity(i);


        }

        switch (v.getId()) {
            case R.id.btn2:
                Intent i = new Intent(Appendices.this, History.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn3:
                Intent i = new Intent(Appendices.this,  Why.class);

                startActivity(i);


        }
    }
}
