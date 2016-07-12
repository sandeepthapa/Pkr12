package com.example.user.pkr1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trekking extends AppCompatActivity implements View.OnClickListener{
    Button f,g,h,i,j,k,l,m,n,o,p,q,r,s,t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trekking);
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
        n = (Button)findViewById(R.id.btn9);
        n.setOnClickListener(this);
        o = (Button)findViewById(R.id.btn10);
        o.setOnClickListener(this);
        p = (Button)findViewById(R.id.btn11);
        p.setOnClickListener(this);
        q = (Button)findViewById(R.id.btn12);
        q.setOnClickListener(this);
        r = (Button)findViewById(R.id.btn13);
        r.setOnClickListener(this);
        s = (Button)findViewById(R.id.btn14);
        s.setOnClickListener(this);
        t= (Button)findViewById(R.id.btn15);
        t.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent i = new Intent(Trekking.this, Abc.class);
                startActivity(i);


        }

        switch (v.getId()) {
            case R.id.btn2:
                Intent i = new Intent(Trekking.this, Annapurna.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn3:
                Intent i = new Intent(Trekking.this, Kafuche.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn4:
                Intent i = new Intent(Trekking.this, Jomsom.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn5:
                Intent i = new Intent(Trekking.this, Poonhill.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn6:
                Intent i = new Intent(Trekking.this, Mardi.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn7:
                Intent i = new Intent(Trekking.this, Mustang.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn8:
                Intent i = new Intent(Trekking.this, Nar.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn9:
                Intent i = new Intent(Trekking.this, Dhaulagiri.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn10:
                Intent i = new Intent(Trekking.this, Manaslu.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn11:
                Intent i = new Intent(Trekking.this, Dhorpatan.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn12:
                Intent i = new Intent(Trekking.this, Panchase.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn13:
                Intent i = new Intent(Trekking.this, Macchapuchre.class);
                startActivity(i);
        }
        switch (v.getId()) {
            case R.id.btn14:
                Intent i = new Intent(Trekking.this, Royaltrek.class);
                startActivity(i);

        }
        switch (v.getId()) {
            case R.id.btn15:
                Intent i = new Intent(Trekking.this, Millenium.class);
                startActivity(i);


        }



    }
}
