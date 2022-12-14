package com.example.sam19.celebrationsites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class weldingRaw extends AppCompatActivity {
    Button btntasty1,btnupvan,btndesiaan,btnjunction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welding_raw);
        btntasty1 = (Button) findViewById(R.id.btntasty);
        btnupvan = (Button) findViewById(R.id.btnupvan);
        btndesiaan = (Button) findViewById(R.id.btndesiaan);
        btnjunction = (Button) findViewById(R.id.btnjunction);


        btntasty1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name", "   NARAYANI PALACE");
                b.putString("add", "ADDRESS :-  Parijat Complex, Civil Line, Lucknow  Road, Awas  Vikas  Colony, Barabanki, Uttar Pradesh");
                b.putString("pin", "Pin Code:-   225001");
                b.putString("veg", "VEGETARIAN and NON-VEGETARIAN");

                b.putString("price", "Price in between:-  1500 to 30000");
                b.putString("timing", "Timing :-  10AM-10PM");
                b.putString("geoo", "geo:26.777371,80.944568");
                b.putString("limit", "Limit  :-  0 to 100 peoples");
                b.putString("Theme", "Theme   :-     Casual");
                b.putString("Parking", "Parking   :-   YES");
                b.putString("Liqor", "Liqor      :-  yes");
                b.putString("phn", "  9628728405");
                Intent in = new Intent(weldingRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });


        btnupvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name", "   Upvan");
                b.putString("add", "ADDRESS :-  Chaya Chauraha, Preet Vihar Colony, Begum Gunj, Barabanki, Uttar Pradesh ");
                b.putString("pin", "Pin Code:-   225001");
                b.putString("veg", "VEGETARIAN and NON-VEGETARIAN");

                b.putString("price", "Price in between:-  1500 to 300000");
                b.putString("timing", "Timing :-  11AM-10:30PM");
                b.putString("geoo", "geo:  26.930366,81.190808");
                b.putString("limit", "Limit  :-  0 to 100 peoples");
                b.putString("Theme", "Theme   :-     Casual");
                b.putString("Parking", "Parking   :-   YES");
                b.putString("Liqor", "Liqor      :-  yes");
                b.putString("phn", "09415075276");
                Intent in = new Intent(weldingRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });


        btndesiaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name", " BR Gop");
                b.putString("add", "ADDRESS :-   Near Jawahar Degree College, Baldev Vihar Telibagh , Lucknow, Uttar Pradesh");
                b.putString("pin", "Pin Code:-   226025");
                b.putString("veg", "VEGETARIAN and NON-VEGETARIAN");

                b.putString("price", "Price in between:-  1500 to 300000");
                b.putString("timing", "Timing :-  10:30AM-11PM");
                b.putString("geoo", "geo: 26.782307,80.946098");
                b.putString("limit", "Limit  :-  0 to 100 peoples");
                b.putString("Theme", "Theme   :-     Casual");
                b.putString("Parking", "Parking   :-   YES");
                b.putString("Liqor", "Liqor      :-  yes");
                b.putString("phn", "");
                Intent in = new Intent(weldingRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });


        btnjunction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name", "   APS LAWN");
                b.putString("add", "ADDRESS :-  Telibagh, Lucknow, Uttar Pradesh ");
                b.putString("pin", "Pin Code:-   226025");
                b.putString("veg", "VEGETARIAN and NON-VEGETARIAN");

                b.putString("price", "Price in between:-  1500 to 300000");
                b.putString("timing", "Timing :-  11:00AM=-10:30PM");
                b.putString("geoo", "geo:26.858102,80.997670");
                b.putString("limit", "Limit  :-  0 to 100 peoples");
                b.putString("Theme", "Theme   :-     Casual");
                b.putString("Parking", "Parking   :-   YES");
                b.putString("Liqor", "Liqor      :-  yes");
                b.putString("phn", "07309233864");
                Intent in = new Intent(weldingRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });


    }}
