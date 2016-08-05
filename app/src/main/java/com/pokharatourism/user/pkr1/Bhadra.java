package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bhadra extends AppCompatActivity implements View.OnClickListener {

    Button a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhadra);
        a = (Button) findViewById(R.id.btn2);
        a.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2:
                Uri uri = Uri.parse("https://www.google.com.np/maps/place/Matepani+Gumba/@28.2165847,84.0051983,17z/data=!3m1!4b1!4m5!3m4!1s0x3995942d683b6feb:0x94f51b1aa1e09ea4!8m2!3d28.21658!4d84.007387?hl=en");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


        }
    }
}
