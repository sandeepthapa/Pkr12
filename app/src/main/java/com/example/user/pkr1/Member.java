package com.example.user.pkr1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Member extends AppCompatActivity implements View.OnClickListener {
     Button a,b,c,d,e,f,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);
        a = (Button)findViewById(R.id.btn1);
        a.setOnClickListener(this);
        b = (Button)findViewById(R.id.btn2);
        b.setOnClickListener(this);
        c = (Button)findViewById(R.id.btn3);
        c.setOnClickListener(this);
        d = (Button)findViewById(R.id.btn4);
        d.setOnClickListener(this);
        e = (Button)findViewById(R.id.btn5);
        e.setOnClickListener(this);
        f = (Button)findViewById(R.id.btn6);
        f.setOnClickListener(this);
        g = (Button)findViewById(R.id.btn7);
        g.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Uri uri = Uri.parse("http://www.pokharachamber.org.np/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }
        switch (v.getId()) {
            case R.id.btn2:
                Uri uri = Uri.parse("http://www.pokhara-hotels.org/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }
        switch (v.getId()) {
            case R.id.btn3:
                Uri uri = Uri.parse("http://taanpokhara.org/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }
        switch (v.getId()) {
            case R.id.btn4:
                Uri uri = Uri.parse("http://taanpokhara.org/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }
        switch (v.getId()) {
            case R.id.btn5:
                Uri uri = Uri.parse("https://www.facebook.com/pokharareban");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }
        switch (v.getId()) {
            case R.id.btn6:
                Uri uri = Uri.parse("https://www.facebook.com/tesa.pokhara");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }
        switch (v.getId()) {
            case R.id.btn7:
                Uri uri = Uri.parse("http://www.nepalairsport.org.np/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }


    }
}
