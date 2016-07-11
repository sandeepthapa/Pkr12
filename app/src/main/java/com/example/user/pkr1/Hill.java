package com.example.user.pkr1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hill extends AppCompatActivity  implements View.OnClickListener{
    Button b,c,d,e,f,g,h,i,j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hill);
        b = (Button) findViewById(R.id.btn1);
        b.setOnClickListener(this);
        c = (Button) findViewById(R.id.btn2);
        c.setOnClickListener(this);
        d = (Button) findViewById(R.id.btn3);
        d.setOnClickListener(this);
        e = (Button) findViewById(R.id.btn4);
        e.setOnClickListener(this);
        f = (Button) findViewById(R.id.btn5);
        f.setOnClickListener(this);
        g = (Button) findViewById(R.id.btn6);
        g.setOnClickListener(this);
        h = (Button) findViewById(R.id.btn7);
        h.setOnClickListener(this);
        i = (Button) findViewById(R.id.btn8);
        i.setOnClickListener(this);
        j = (Button) findViewById(R.id.btn9);
        j.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent i = new Intent(Hill.this, Kaskikot.class);
                startActivity(i);
        }
        switch (v.getId()) {
            case R.id.btn2:
                Intent i = new Intent(Hill.this, Sarangkot.class);
                startActivity(i);
        }
        switch (v.getId()) {
            case R.id.btn3:
                Intent i = new Intent(Hill.this, Australia.class);
                startActivity(i);
        }
        switch (v.getId()) {
            case R.id.btn4:
                Intent i = new Intent(Hill.this, Thulakot.class);
                startActivity(i);
        }
        switch (v.getId()) {
            case R.id.btn5:
                Intent i = new Intent(Hill.this, Mattikhana.class);
                startActivity(i);
        }
        switch (v.getId()) {
            case R.id.btn6:
                Intent i = new Intent(Hill.this, Foksingkot.class);
                startActivity(i);
        }
        switch (v.getId()) {
            case R.id.btn7:
                Intent i = new Intent(Hill.this, Kahun.class);
                startActivity(i);
        }
        switch (v.getId()) {
            case R.id.btn8:
                Intent i = new Intent(Hill.this, Pandh.class);
                startActivity(i);
        }
        switch (v.getId()) {
            case R.id.btn9:
                Intent i = new Intent(Hill.this, Anand.class);
                startActivity(i);
        }
    }
}
