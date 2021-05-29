package com.shallows.youbin;

import android.content.Intent;
import static java.lang.Thread.sleep;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class splashactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);

        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep (4000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(splashactivity.this, MapsActivity.class);
                    startActivity(intent);

                }
            }

        };thread.start();
    }
}