package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adventure1 extends AppCompatActivity implements View.OnClickListener {
    Button f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure1);
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
        u= (Button)findViewById(R.id.btn16);
        u.setOnClickListener(this);
        v= (Button)findViewById(R.id.btn17);
        v.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent i = new Intent(Adventure1.this, Paragliding.class);
                startActivity(i);


        }

        switch (v.getId()) {
            case R.id.btn2:
                Intent i = new Intent(Adventure1.this, Ultralight.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn3:
                Intent i = new Intent(Adventure1.this, Mount.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn4:
                Intent i = new Intent(Adventure1.this, Raftinh.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn5:
                Intent i = new Intent(Adventure1.this, Cannyoing.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn6:
                Intent i = new Intent(Adventure1.this, Cycling.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn7:
                Intent i = new Intent(Adventure1.this, Golf.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn8:
                Intent i = new Intent(Adventure1.this, Zipline.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn9:
                Intent i = new Intent(Adventure1.this, Bunje.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn10:
                Intent i = new Intent(Adventure1.this, Swim.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn11:
                Intent i = new Intent(Adventure1.this, Rock.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn12:
                Intent i = new Intent(Adventure1.this, Pony.class);
                startActivity(i);


        }
        switch (v.getId()) {
            case R.id.btn13:
                Intent i = new Intent(Adventure1.this, Honey.class);
                startActivity(i);
        }
        switch (v.getId()) {
            case R.id.btn14:
                Intent i = new Intent(Adventure1.this, Hiking.class);
                startActivity(i);

        }
        switch (v.getId()) {
            case R.id.btn15:
                Intent i = new Intent(Adventure1.this, Fish.class);
                startActivity(i);


        } switch (v.getId()) {
            case R.id.btn16:
                Intent i = new Intent(Adventure1.this, Boat.class);
                startActivity(i);


        } switch (v.getId()) {
            case R.id.btn17:
                Intent i = new Intent(Adventure1.this, Vulture.class);
                startActivity(i);


        }



    }
}

