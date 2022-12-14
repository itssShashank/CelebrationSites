package com.example.sam19.celebrationsites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OTP extends AppCompatActivity {

    Button b1,btnfing;
    EditText et;
    String temp,msg;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        b1=(Button)findViewById(R.id.button);
        et =( EditText)findViewById(R.id.e);

        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            msg  = extras.getString("otp");
        }else {
            Toast.makeText(this, "ERROR 444", Toast.LENGTH_SHORT).show();
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                temp = et.getText().toString();



                if(msg.equals(temp)) {

                    Toast.makeText(OTP.this, "confirmed", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(OTP.this, DashBoard.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(OTP.this, "incorrect OTP", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
