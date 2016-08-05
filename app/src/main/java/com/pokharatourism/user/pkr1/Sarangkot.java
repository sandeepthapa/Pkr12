package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sarangkot extends AppCompatActivity implements View.OnClickListener {
    Button a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarangkot);
        a = (Button)findViewById(R.id.btn2);
        a.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2:
                Uri uri = Uri.parse("https://www.google.com.np/maps/place/Sarangkot,+Pokhara+33700/@28.2443855,83.9445644,16z/data=!3m1!4b1!4m5!3m4!1s0x399594b982657239:0x54667e1941eb00db!8m2!3d28.2439298!4d83.9486254?hl=en");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


        }

    }



}
