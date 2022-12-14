package com.example.sam19.celebrationsites;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class casualmore extends AppCompatActivity {
    TextView tev1,tev2,tev3,tev4,tev5,tev6,tev7,tev8,tev9;
    String geo;
    Button b1,b2;
    String name,PhoneNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casualmore);
        tev1=(TextView)findViewById(R.id.tvv11);
        tev2=(TextView)findViewById(R.id.tvv21);
        tev3=(TextView)findViewById(R.id.tvv31);
        tev4=(TextView)findViewById(R.id.tvv41);
        tev5=(TextView)findViewById(R.id.tvv51);
        tev6=(TextView)findViewById(R.id.tvv61);
        tev7=(TextView)findViewById(R.id.tvv71);
        tev8=(TextView)findViewById(R.id.tvv81);
        tev9=(TextView)findViewById(R.id.tvv91);

        b1=(Button)findViewById(R.id.btncall);
        b2=(Button)findViewById(R.id.buttonmore11);

        Intent in = getIntent();

        Bundle b = in.getExtras();


        name = b.getString("name");
        String add = b.getString("add");
        String price = b.getString("price");
        String timing = b.getString("timing");
        geo = b.getString("geoo");
        String limit=b.getString("limit");
        String theme=b.getString("Theme");
        String Parking = b.getString("Parking");
        String Liqor = b.getString("Liqor");
        PhoneNum = b.getString("phn");
        String pin = b.getString("pin");

        tev1.setText(name);
        tev2.setText(add);
        tev3.setText(pin);
        tev4.setText(price);
        tev5.setText(timing);
        tev6.setText(limit);
        tev7.setText(theme);
        tev8.setText(Parking);
        tev9.setText(Liqor);
        geo.trim();


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse(geo);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(casualmore.this);
                alertDialogBuilder.setMessage("Are you sure You ant to call "+name);
                alertDialogBuilder.setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                callIntent.setData(Uri.parse("tel:" + Uri.encode(PhoneNum.trim())));
                                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(callIntent);
                            }

                        });

                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(casualmore.this, casualmore.class);
                        startActivity(intent);
                    }

                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
    }
}
