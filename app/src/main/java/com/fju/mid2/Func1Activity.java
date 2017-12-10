package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class Func1Activity extends AppCompatActivity {
    boolean a = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }
//    int [] icons = {R.drawable.photo};
    public void roll(View view){
        int r = new Random().nextInt(6)+1;
        String s = String.valueOf(r);
        new AlertDialog.Builder(this)
                .setMessage(s)
                .setTitle("Number")
                .setPositiveButton("OK", null)
                .show();

    }

}
