package com.pokharatourism.user.pkr1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Begnas extends AppCompatActivity  implements View.OnClickListener{
    Button a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begnas);
        a = (Button)findViewById(R.id.btn2);
        a.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2:
                Uri uri = Uri.parse("https://www.google.com.np/maps/place/Begnas+Lake/@28.1784776,84.0847821,14z/data=!3m1!4b1!4m5!3m4!1s0x3995980202647001:0x88b3c3625fbda20e!8m2!3d28.1739372!4d84.0973258?hl=en");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


        }

    }
}
