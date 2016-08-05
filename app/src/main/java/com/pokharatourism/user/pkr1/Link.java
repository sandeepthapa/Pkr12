package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Link extends AppCompatActivity implements View.OnClickListener{

    Button f,g,h,i,j,k,l,m,n,o;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);
        f = (Button)findViewById(R.id.button1);
        f.setOnClickListener(this);
        g = (Button)findViewById(R.id.button2);
        g.setOnClickListener(this);
        h = (Button)findViewById(R.id.button3);
        h.setOnClickListener(this);
        i = (Button)findViewById(R.id.button4);
        i.setOnClickListener(this);
        j = (Button)findViewById(R.id.button4);
        j.setOnClickListener(this);
        k = (Button)findViewById(R.id.button6);
        k.setOnClickListener(this);
        l = (Button)findViewById(R.id.button7);
        l.setOnClickListener(this);
        m = (Button)findViewById(R.id.button8);
        m.setOnClickListener(this);
        n = (Button)findViewById(R.id.button9);
        n.setOnClickListener(this);
        o = (Button)findViewById(R.id.button);
        o.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Uri uri = Uri.parse("http://http//www.tourism.gov.np/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }switch (v.getId()) {
            case R.id.button2:
                Uri uri = Uri.parse("http://www.nepalimmigration.gov.np/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }switch (v.getId()) {
            case R.id.button3:
                Uri uri = Uri.parse("http://pokharamun.gov.np/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }switch (v.getId()) {
            case R.id.button4:
                Uri uri = Uri.parse("http://www.welcomenepal.com/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }switch (v.getId()) {
            case R.id.button5:
                Uri uri = Uri.parse("http://www.kmtnc.org.np/cgi-sys/defaultwebpage.cgi");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }switch (v.getId()) {
            case R.id.button6:
                Uri uri = Uri.parse("http://http//www.nepalmountaineering.org/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }switch (v.getId()) {
            case R.id.button7:
                Uri uri = Uri.parse("http//www.raftingassociation.org.np/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }switch (v.getId()) {
            case R.id.button8:
                Uri uri = Uri.parse("http://www.lekhnathcci.org.np//");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }switch (v.getId()) {
            case R.id.button9:
                Uri uri = Uri.parse("http://www.ilo.org/kathmandu/lang--en/index.htm");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }switch (v.getId()) {
            case R.id.button:
                Uri uri = Uri.parse("http://http//www.tourism.gov.np/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
        }
    }
}