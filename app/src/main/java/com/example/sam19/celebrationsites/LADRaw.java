package com.example.sam19.celebrationsites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class LADRaw extends AppCompatActivity {
    Button btnAryan,btntundey,btngnpti,btnlazeez,btnYadav,btnbaluchi,btnpizza,btnfoodywoody,btnKalewa,btnfoodhut,btnMoti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ladraw);


        btnAryan=(Button)findViewById(R.id.buttonmore);
        btntundey=(Button)findViewById(R.id.bbtnAngaara);
        btngnpti=(Button)findViewById(R.id.btnbigdady);
        btnlazeez=(Button)findViewById(R.id.btnhookup);
        btnYadav=(Button)findViewById(R.id.btntramptree);
        btnbaluchi=(Button)findViewById(R.id.btnhash);
        btnpizza=(Button)findViewById(R.id.btnjail);
        btnfoodywoody=(Button)findViewById(R.id.btnMillenium);
        btnKalewa = (Button)findViewById(R.id.btnkalewa);
        btnfoodhut = (Button)findViewById(R.id.btnfood);
        btnMoti = (Button)findViewById(R.id.btnMoti);






        btnAryan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    MOTI MAHAL DELUX");
                b.putString("add","ADDRESS :- a6, near nehru Bal Vatika park, AliGAnj, Lucknow, UttarPradesh");
                b.putString("pin","Pin Code:-  226024");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  Accordingly Starting 2000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 PM");
                b.putString("geoo","geo:26.885802,80.937660");
                b.putString("limit","Limit  :-  0 to 1000 peoples");
                b.putString("Theme","Theme   :- CASUAL LIGHT");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  Not Available");
                b.putString("phn","05222441227");
                Intent in = new Intent(LADRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });




        btnAryan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    ARYAN");
                b.putString("add","ADDRESS :- SGPGI Road , Sainik Nagar, Opp Ganga Sichai Bhawan, Lucknow, UttarPradesh");
                b.putString("pin","Pin Code:-  226025");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  Accordingly Starting 2000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 PM");
                b.putString("geoo","geo:26.776095,80.943251");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :- CASUAL LIGHT");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  Not Available");
                b.putString("phn","05222441227");
                Intent in = new Intent(LADRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });



        btntundey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    Tundey Kababi");
                b.putString("add","ADDRESS :- 184,Raebareli Rd, Senani Vihar, Sainik Nagar, Lucknow,UttarPradesh");
                b.putString("pin","Pin Code:-  226025");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  2000 to 5000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 PM");
                b.putString("geoo","geo:26.774892,80.944043");
                b.putString("limit","Limit  :-  0 to 150 peoples");
                b.putString("Theme","Theme   :- Casual Dark");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  Available");
                b.putString("phn","09389956608");
                Intent in = new Intent(LADRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });

        btngnpti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","   Fhri Ganpati Sweets");
                b.putString("add","ADDRESS :- Utarethia Rd,Near Shaheedpath,Sector 1, Vrindavan Colony, Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-  226025");
                b.putString("veg","VEGETARIAN");


                b.putString("price","Price in between:-  500 to 3000");
                b.putString("timing","Timing :-  12:00 pM to 1:00 AM");
                b.putString("geoo","geo:26.768100,80.946048");
                b.putString("limit","Limit  :-  0 to 170 peoples");
                b.putString("Theme","Theme   :- Family ans Friends");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  Available");
                b.putString("phn","09151644447");
                Intent in = new Intent(LADRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });



        btnlazeez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    AL Lazeez");
                b.putString("add","ADDRESS :- Shubhani Kheda, Crossing, Raaebareli Road, Telibagh ,Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-  226010");
                b.putString("veg","NON-VEGETARIAN");

                b.putString("price","Price in between:-  2000 to 30000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 pM");
                b.putString("geoo","geo:26.790740,81.939825");
                b.putString("limit","Limit  :-  0 to 70 peoples");
                b.putString("Theme","Theme   :- light and fancy");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  NO");
                b.putString("phn","07505221383");
                Intent in = new Intent(LADRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });
        btnYadav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    Millenium Cafe");
                b.putString("add","ADDRESS :- Faizabad Road, Matiyari Road, Gomti Nagar, Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-  227105");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  500 to 40000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 pM");
                b.putString("geoo","geo:26.880463,81.038811");
                b.putString("limit","Limit  :-  0 to 200 peoples");
                b.putString("Theme","Theme   :- Casual");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  No");
                b.putString("phn","");
                Intent in = new Intent(LADRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });

        btnbaluchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","   Pind Baluchi");
                b.putString("add","ADDRESS :- , Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-   226001");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  1500 to 30000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 pM");
                b.putString("geoo","geo:26.870067,80.997411");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :-     Casual");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn","9838885555");
                Intent in = new Intent(LADRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });






        btnpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    Pizza Hut");
                b.putString("add","ADDRESS :-sn.8,9,10,ground flour, west end mall, Vibhuti khand, Gomti Nagar, Lucknow, Uttar Pradesh ");
                b.putString("pin","Pin Code:-   226010");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  400 to 30000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 pM");
                b.putString("geoo","geo:26.26.870154,80.997411");
                b.putString("limit","Limit  :-  0 to 160 peoples");
                b.putString("Theme","Theme   :-     CASUAL");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  NO");
                b.putString("phn","05223985398");
                Intent in = new Intent(LADRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });







        btnfoodywoody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    FOODYWOODY FASTFOOD");
                b.putString("add","ADDRESS :- Mand parikshad r0ad, Vibhuti Khand, Gomti Nagar, Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-   226010");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  500 to 9000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 pM");
                b.putString("geoo","geo:26.869655,81.001555");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :-     Latenight food casulas");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  No");
                b.putString("phn","08858216633");
                Intent in = new Intent(LADRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });

        btnKalewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","   Kalevam Restorant");
                b.putString("add","ADDRESS :-   Sector 1, block D,. Ring road crossing, Kalewa Chauraha, Indira Nagar, Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-   226016");
                b.putString("veg","VEGETARIAN");

                b.putString("price","Price in between:-  500 to 5000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 pM");
                b.putString("geoo","geo:26.880308,80.995402");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :-     Latenight food casulas");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  no");
                b.putString("phn","08189000016");
                Intent in = new Intent(LADRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });


        btnfoodhut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    The FOODHUT");
                b.putString("add","ADDRESS :-d.1398, NH 24,,Kalewa Chauraha, Indira Nagar, Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-   226016");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");
                b.putString("price","Price in between:-  200 to 9000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 pM");
                b.putString("geoo","geo:26.880533,80.996279");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :-     Latenight food, party,  casulas");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");

                Intent in = new Intent(LADRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });


    }
}
