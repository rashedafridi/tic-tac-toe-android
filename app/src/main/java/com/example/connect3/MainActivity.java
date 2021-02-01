package com.example.connect3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean isRead = true;

    int click1=0;
    int click2=0;
    int click3=0;
    int click4=0;int click5=0;int click6=0;int click7=0;int click8=0;int click9=0;
    ImageView img1 ;
    ImageView img2 ;
    ImageView img3 ;
    ImageView img4 ;
    ImageView img5 ;
    ImageView img6 ;
    ImageView img7 ;
    ImageView img8 ;
    ImageView img9 ;





    public void option_color1(View view){
        ImageView img1 = findViewById(R.id.image1);
        Log.d("click","img1..toString()");

        if(click1==0){
            if(isRead){
                Log.d("click","if hose");
                img1.setImageResource(R.drawable.yellow);
                click1=-1;
              img1.animate().rotationXBy(0).rotation(360).setDuration(1000);
                isRead = false;

            }else {
                Log.d("click","else hose");
                img1.setImageResource(R.drawable.red);
                isRead = true;
                click1=1;
            }

        }
        whoWined();

    }
    public void option_color2(View view){
//        ImageView img2 = findViewById(R.id.image2);
        Log.d("click","option_color2");
        if(click2==0) {
            if (isRead) {
                img2.setImageResource(R.drawable.yellow);
                isRead = false;
                click2 =-1;
            } else {
                img2.setImageResource(R.drawable.red);
                isRead = true;
                click2 =1;
            }

        }
        whoWined();
    }    public void option_color3(View view){
//        ImageView img3 = findViewById(R.id.image3);
        if(click3==0) {
            if (isRead) {
                img3.setImageResource(R.drawable.yellow);
                isRead = false;
                click3 = -1;
            } else {
                img3.setImageResource(R.drawable.red);
                isRead = true;
                click3 = 1;
            }
        }
        whoWined();
    }    public void option_color4(View view){
//        ImageView img4 = findViewById(R.id.image4);
        if(click4==0) {
            if(isRead){
                img4.setImageResource(R.drawable.yellow);
                isRead = false;
                click4 =-1;
            }else {
                img4.setImageResource(R.drawable.red);
                isRead = true;
                click4 =1;
            }
        }
        whoWined();

    }    public void option_color5(View view){
//        ImageView img5 = findViewById(R.id.image5);
        if(click5==0) {
            if (isRead) {
                img5.setImageResource(R.drawable.yellow);
                isRead = false;
                click5 = -1;
            } else {
                img5.setImageResource(R.drawable.red);
                isRead = true;
                click5 = 1;
            }
        }
        whoWined();
    }    public void option_color6(View view){
//        ImageView img6 = findViewById(R.id.image6);
        if(click6==0) {
            if(isRead){
                img6.setImageResource(R.drawable.yellow);
                isRead = false;
                click6 =-1;
            }else {
                img6.setImageResource(R.drawable.red);
                isRead = true;
                click6 =1;
            }
        }
        whoWined();
    }    public void option_color7(View view){
//        ImageView img7 = findViewById(R.id.image7);
        if(click7==0) {
            if (isRead) {
                img7.setImageResource(R.drawable.yellow);
                isRead = false;
                click7 = -1;
            } else {
                img7.setImageResource(R.drawable.red);
                isRead = true;
                click7 = 1;
            }
        }
        whoWined();
    }    public void option_color8(View view){
//        ImageView img8 = findViewById(R.id.image8);
        if(click8==0) {
            if (isRead) {
                img8.setImageResource(R.drawable.yellow);
                isRead = false;
                click8 = -1;
            } else {
                img8.setImageResource(R.drawable.red);
                isRead = true;
                click8 = 1;
            }
        }
        whoWined();
    }    public void option_color9(View view){
//        ImageView img9 = findViewById(R.id.image9);
        if(click9==0) {
            if (isRead) {
                img9.setImageResource(R.drawable.yellow);
                isRead = false;
                click9 = -1;
            } else {
                img9.setImageResource(R.drawable.red);
                isRead = true;
                click9 = 1;
            }
        }
        whoWined();
    }
    public void whoWined()
    {
        // 1==red,-1== yellow
        if(     click1==1&&click2==1&&click3==1||
                click4==1&&click5==1&&click6==1||
                click7==1&&click8==1&&click9==1||
                click1==1&&click4==1&&click7==1||
                click2==1&&click5==1&&click8==1||
                click1==3&&click2==6&&click9==1||
                click1==1&&click5==1&&click9==1||
                click3==1&&click5==1&&click7==1
        ){
            Toast.makeText(this, "red wins", Toast.LENGTH_LONG).show();
        }else if(click1==-1&&click2==-1&&click3==-1||
                click4==-1&&click5==-1&&click6==-1||
                click7==-1&&click8==-1&&click9==-1||
                click1==-1&&click4==-1&&click7==-1||
                click2==-1&&click5==-1&&click8==-1||
                click1==-3&&click2==-6&&click9==-1||
                click1==-1&&click5==-1&&click9==-1||
                click3==-1&&click5==-1&&click7==-1
        ){
        Toast.makeText(this, "yellow wins", Toast.LENGTH_LONG).show();
        }

    }
    public void clearData(View view){
        img1.setImageResource(android.R.color.transparent);
        img2.setImageResource(android.R.color.transparent);
        img3.setImageResource(android.R.color.transparent);
        img4.setImageResource(android.R.color.transparent);
        img5.setImageResource(android.R.color.transparent);
        img6.setImageResource(android.R.color.transparent);
        img7.setImageResource(android.R.color.transparent);
        img8.setImageResource(android.R.color.transparent);
        img9.setImageResource(android.R.color.transparent);
         click1=0;
         click2=0;
         click3=0;
         click4=0;
         click5=0;
         click6=0;
         click7=0;
         click8=0;
         click9=0;



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         img1 = findViewById(R.id.image1);
         img2 = findViewById(R.id.image2);
        img3 = findViewById(R.id.image3);
       img4 = findViewById(R.id.image4);
         img5 = findViewById(R.id.image5);
         img6 = findViewById(R.id.image6);
         img7 = findViewById(R.id.image7);
        img8 = findViewById(R.id.image8);
        img9 = findViewById(R.id.image9);
//        img1.setX(-1000);
//        img2.setX(-1000);
//        img3.setX(-1000);
//        img4.setX(-1000);
//        img5.setX(-1000);
//        img6.setX(-1000);
//        img7.setX(-1000);
//        img8.setX(-1000);
//        img9.setX(-1000);
        img1.setImageResource(android.R.color.transparent);
        img2.setImageResource(android.R.color.transparent);
        img3.setImageResource(android.R.color.transparent);
        img4.setImageResource(android.R.color.transparent);
        img5.setImageResource(android.R.color.transparent);
        img6.setImageResource(android.R.color.transparent);
        img7.setImageResource(android.R.color.transparent);
        img8.setImageResource(android.R.color.transparent);
        img9.setImageResource(android.R.color.transparent);
        click1=0;
        click2=0;
        click3=0;
        click4=0;
        click5=0;
        click6=0;
        click7=0;
        click8=0;
        click9=0;
    }
}