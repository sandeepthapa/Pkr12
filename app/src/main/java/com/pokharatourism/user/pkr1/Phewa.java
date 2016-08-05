package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Phewa extends AppCompatActivity implements View.OnClickListener {
     Button a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phewa);
        a = (Button)findViewById(R.id.btn2);
        a.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2:
                Uri uri = Uri.parse("https://www.google.com.np/maps/@28.2116646,83.9322958,14z?hl=en");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


        }

    }
}
