package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bhim extends AppCompatActivity implements View.OnClickListener{
    Button a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhim);
        a = (Button)findViewById(R.id.btn2);
        a.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2:
                Uri uri = Uri.parse("https://www.google.com.np/maps/place/Prithvi+Narayan+Campus/@28.2399733,83.9887707,17z/data=!3m1!4b1!4m5!3m4!1s0x3995946a3a83989f:0x6725cf65b414222f!8m2!3d28.2399686!4d83.9909594?hl=en");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


        }

    }
}
