package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aboutpkr extends AppCompatActivity implements View.OnClickListener{
    Button e,g,h,i,j,k,l,m,n,o,p,q,s,t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutpkr);
        e = (Button)findViewById(R.id.btn17);
        e.setOnClickListener(this);

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
        n = (Button)findViewById(R.id.btn9);
        n.setOnClickListener(this);
        o = (Button)findViewById(R.id.btn10);
        o.setOnClickListener(this);
        p = (Button)findViewById(R.id.btn11);
        p.setOnClickListener(this);
        q = (Button)findViewById(R.id.btn12);
        q.setOnClickListener(this);
            s = (Button)findViewById(R.id.btn14);
        s.setOnClickListener(this);
        t= (Button)findViewById(R.id.btn24);
        t.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn17:
                Intent i = new Intent(Aboutpkr.this, Natural.class);
                startActivity(i);


        }


        switch (v.getId()) {
            case R.id.btn2:
                Intent i = new Intent(Aboutpkr.this, Hill.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn3:
                Intent i = new Intent(Aboutpkr.this, Museum.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn4:
                Intent i = new Intent(Aboutpkr.this, Temple.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn5:
                Intent i = new Intent(Aboutpkr.this, Events.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn6:
                Intent i = new Intent(Aboutpkr.this, Festival.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn7:
                Intent i = new Intent(Aboutpkr.this, Essentialinfo.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn8:
                Intent i = new Intent(Aboutpkr.this, Trekdest.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn9:
                Intent i = new Intent(Aboutpkr.this, Destination.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn10:
                Intent i = new Intent(Aboutpkr.this, Getting.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn11:
                Intent i = new Intent(Aboutpkr.this, Birds.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn12:
                Intent i = new Intent(Aboutpkr.this, Weather.class);
                startActivity(i);


        }

        switch (v.getId()) {
            case R.id.btn14:
                Intent i = new Intent(Aboutpkr.this, Appendices.class);
                startActivity(i);

        }
        switch (v.getId()) {
            case R.id.btn24:
                Intent i = new Intent(Aboutpkr.this, Adventure1.class);
                startActivity(i);


        }




    }
}


