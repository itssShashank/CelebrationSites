package com.example.sam19.celebrationsites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoard extends AppCompatActivity {

    Button b22,b33,b44,b55,b88,b99,b1010,b1212;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        b22=(Button)findViewById(R.id.b2);
        b33=(Button)findViewById(R.id.b3);
        b44=(Button)findViewById(R.id.b4);
        b55=(Button)findViewById(R.id.b5);

        b88=(Button)findViewById(R.id.b8);
        b99=(Button)findViewById(R.id.b9);
        b1010=(Button)findViewById(R.id.b10);
        b1212=(Button)findViewById(R.id.b12);


        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoard.this,TilakRaw.class);
                startActivity(intent);
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoard.this,weldingRaw.class);
                startActivity(intent);
            }
        });
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoard.this,ReceptionRaw.class);
                startActivity(intent);
            }
        });
        b55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoard.this,HukkahRaw.class);
                startActivity(intent);
            }
        });

        b88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoard.this,CasualRaw.class);
                startActivity(intent);
            }
        });
        b99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoard.this,LADRaw.class);
                startActivity(intent);
            }
        });
        b1010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoard.this,TeaRaw.class);
                startActivity(intent);
            }
        });

        b1212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoard.this,BachelorRaw.class);
                startActivity(intent);
            }
        });


    }
}
