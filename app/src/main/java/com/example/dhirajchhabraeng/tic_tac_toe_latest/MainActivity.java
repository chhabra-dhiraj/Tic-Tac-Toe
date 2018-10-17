package com.example.dhirajchhabraeng.tic_tac_toe_latest;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    public static String symbol;
    public static String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button zeroButton = (Button)findViewById(R.id.zero_button);
        Button crossButton = (Button)findViewById(R.id.cross_button);

        zeroButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                symbol = "O";
                temp = symbol;
                Intent mainScreenIntent = new Intent(MainActivity.this, MainScreen.class);
                startActivity(mainScreenIntent);
                finish();
            }
        });

        crossButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                symbol = "X";
                temp = symbol;
                Intent mainScreenIntent = new Intent(MainActivity.this, MainScreen.class);
                startActivity(mainScreenIntent);
                finish();
            }
        });
    }
}
