package com.example.sam19.celebrationsites;

import android.Manifest;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class verify extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    Button sendBtn,skip;
    EditText txtphoneNo;
    String phoneNo;
    int msg;
    public String message;
    String s,msg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        sendBtn= (Button)findViewById(R.id.verifyyy);
        skip = (Button)findViewById(R.id.skip1);
        txtphoneNo=(EditText)findViewById(R.id.editphn);

        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            msg1  = extras.getString("otp");
        }else {
            Toast.makeText(this, "ERROR 444", Toast.LENGTH_SHORT).show();
        }
        txtphoneNo.setText(msg1);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(verify.this,DashBoard.class);
                startActivity( i);
            }
        });
        if (ContextCompat.checkSelfPermission(verify.this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(verify.this, Manifest.permission.SEND_SMS)) {
                ActivityCompat.requestPermissions(verify.this, new String[]{Manifest.permission.SEND_SMS}, 1);
            } else
                ActivityCompat.requestPermissions(verify.this, new String[]{Manifest.permission.SEND_SMS}, 1);

        } else {
            //do nothing
        }



            sendBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    s = txtphoneNo.getText().toString();
                    if (s == " " || (s.length() > 10) || (s.length() < 10)) {
                        Toast.makeText(verify.this, "enter a valid phone number", Toast.LENGTH_LONG).show();
                    } else {

                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(verify.this);
                        alertDialogBuilder.setMessage("Are you sure" + s + " is your phone number");
                        alertDialogBuilder.setPositiveButton("yes",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface arg0, int arg1) {
                                        try {
                                            Random rand = new Random();
                                            msg = rand.nextInt(100000);

                                            message = String.valueOf(msg);

                                            Intent intent = new Intent(verify.this, OTP.class);

                                            intent.putExtra("otp", message);
                                            startActivity(intent);

                                        } catch (Exception e) {
                                            Toast.makeText(verify.this, "error", Toast.LENGTH_SHORT).show();
                                        }

                                        phoneNo = txtphoneNo.getText().toString();
                                        try {
                                            SmsManager smsManager = SmsManager.getDefault();
                                            smsManager.sendTextMessage(phoneNo, null, message, null, null);
                                            Toast.makeText(verify.this, "SENT sucessfully", Toast.LENGTH_SHORT).show();

                                        } catch (Exception e) {
                                            Toast.makeText(verify.this, "failed", Toast.LENGTH_SHORT).show();
                                        }


                                    }

                                });

                        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(verify.this, MainActivity.class);
                                startActivity(intent);
                            }

                        });

                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }


                }


            });
        }






    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 1:{
                if(grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){


                    if(ContextCompat.checkSelfPermission(verify.this, Manifest.permission.SEND_SMS)==PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(this,"permission granted",Toast.LENGTH_SHORT).show();

                    } else{
                        Toast.makeText(this, "no permission", Toast.LENGTH_SHORT).show();
                    }
                    return ;
                }
            }
        }
    }
}