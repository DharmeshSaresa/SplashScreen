package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread thread = new Thread(){

            public void run(){
                try {
                    sleep(3000);

                }catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(splashScreen.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();

    }
}