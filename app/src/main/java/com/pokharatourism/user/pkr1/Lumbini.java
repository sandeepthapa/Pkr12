package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lumbini extends AppCompatActivity implements View.OnClickListener {

    Button a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lumbini);
        a = (Button) findViewById(R.id.btn2);
        a.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2:
                Uri uri = Uri.parse("https://www.google.com.np/maps/place/Lumbini/@27.802585,83.0006436,9z/data=!3m1!4b1!4m5!3m4!1s0x3996792b4a4e0281:0xc835dc3d3bbe52ea!8m2!3d27.6791987!4d83.5070203?hl=en");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


        }
    }
}
