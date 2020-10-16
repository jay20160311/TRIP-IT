package com.example.tripit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Team A
    public int score=0;
    //Team B
    public int score1=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void display(int number){
        TextView display1=(TextView) findViewById(R.id.display1);
        display1.setText(" "+number);

    }
    public void display1(int number){
        TextView display1=(TextView) findViewById(R.id.display2);
        display1.setText(" "+number);

    }
    public void Three(View view){
        score=score+3;
        display(score);
        Vibrator v = (Vibrator) this.getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(100);
    }
    public void Two(View view){
        score=score+2;
        display(score);
        Vibrator v = (Vibrator) this.getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(100);
    }
    public void FreeThrow(View view){
        score=score+1;
        display(score);
        Vibrator v = (Vibrator) this.getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(100);
    }
    //for team B
    public void ThreeB(View view){
        score1=score1+3;
        display1(score1);
        Vibrator v = (Vibrator) this.getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(100);
    }
    public void TwoB(View view){
        score1=score1+2;
        display1(score1);
        Vibrator v = (Vibrator) this.getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(100);
    }
    public void FreeThrowB(View view){
        score1=score1+1;
        display1(score1);
        Vibrator v = (Vibrator) this.getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(100);

    }
    public void Reset(View view){

        score=0;
        score1=0;
        display1(score1);
        display(score);
        Vibrator v = (Vibrator) this.getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(100);

    }


}