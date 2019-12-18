package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

public class Splash extends Activity {


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splash_activity);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent Intent = new Intent(Splash.this, MainActivity.class);
                startActivity(Intent);
                finish();
            }
        },2500);
    }
}
