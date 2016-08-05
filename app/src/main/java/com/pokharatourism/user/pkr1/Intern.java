package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intern extends AppCompatActivity implements View.OnClickListener {

    Button a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intern);
        a = (Button) findViewById(R.id.btn2);
        a.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2:
                Uri uri = Uri.parse("https://www.google.com.np/maps/place/International+Mountain+Museum/@28.1892427,83.9779892,17z/data=!3m1!4b1!4m5!3m4!1s0x3995959f419f040b:0xd09b22018341ee0e!8m2!3d28.189238!4d83.9801779?hl=en");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


        }
    }
}
