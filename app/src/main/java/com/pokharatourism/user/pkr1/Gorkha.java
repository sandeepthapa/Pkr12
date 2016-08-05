package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gorkha extends AppCompatActivity implements View.OnClickListener{

    Button a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorkha);
        a = (Button) findViewById(R.id.btn2);
        a.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2:
                Uri uri = Uri.parse("https://www.google.com.np/maps/place/Gorkha/@28.2597874,84.2148497,9z/data=!3m1!4b1!4m5!3m4!1s0x39951c3f168194d1:0x206002a35a235164!8m2!3d28.4763941!4d84.6897495?hl=en");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


        }
    }
}
