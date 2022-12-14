package com.example.sam19.celebrationsites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class HukkahRaw extends AppCompatActivity {
    Button btnknock,btnangara,btnbigdady,btnhokup,btntramptree,btnhashttag,btnjail,btnMile,btnfireside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bachelor_raw);
        btnknock=(Button)findViewById(R.id.buttonmore);
        btnangara=(Button)findViewById(R.id.bbtnAngaara);
        btnbigdady=(Button)findViewById(R.id.btnbigdady);
        btnhokup=(Button)findViewById(R.id.btnhookup);
        btntramptree=(Button)findViewById(R.id.btntramptree);
        btnhashttag=(Button)findViewById(R.id.btnhash);
        btnjail=(Button)findViewById(R.id.btnjail);
        btnMile=(Button)findViewById(R.id.btnMillenium);
        btnfireside =(Button)findViewById(R.id.btnFire);






        btnknock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    FIRESIDE LONGE");
                b.putString("add","ADDRESS :- 2/83, patrakaarpuram crossing rd, viramkhand, gomti nagar lucknow,Uttar pradesdh");
                b.putString("pin","Pin Code:-  226010");
                b.putString("price","Price in between:-  2000 to 25000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 PM");
                b.putString("geoo","geo:26.848937,80.998866");
                b.putString("limit","Limit  :-  0 to 120 peoples");
                b.putString("Theme","Theme   :- Dark & Light");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  Available");
                b.putString("phn","08574400640");
                Intent in = new Intent(HukkahRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });

        btnknock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    Knock    Knock    Cafe");
                b.putString("add","ADDRESS :- 2/62p, vishal khand 2, Gomtinagar,Lucknow, uttarPradesh");
                b.putString("pin","Pin Code:-  226010");
                b.putString("price","Price in between:-  2000 to 25000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 PM");
                b.putString("geoo","geo:26.850022,80.979879");
                b.putString("limit","Limit  :-  0 to 120 peoples");
                b.putString("Theme","Theme   :- Dark & Light");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  Available");
                b.putString("phn","8299321377");
                Intent in = new Intent(HukkahRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });



        btnangara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    ANGAARA CAFE AND LONGE");
                b.putString("add","ADDRESS :- Sapru marg, Prem Nagar, Hazratganj,Lucknow, uttarPradesh");
                b.putString("pin","Pin Code:-  226001");
                b.putString("price","Price in between:-  2000 to 30000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 PM");
                b.putString("geoo","geo:26.853073,80.948238");
                b.putString("limit","Limit  :-  0 to 150 peoples");
                b.putString("Theme","Theme   :- Dark");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  Available");
                b.putString("phn","07505999909");
                Intent in = new Intent(HukkahRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });

        btnbigdady.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    BIG DADDY LONGE");
                b.putString("add","ADDRESS :- 6th Floor Balcony, Cyber Heights, Pickup Bhavan Road, Vibhuti Khand, Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-  226010");
                b.putString("price","Price in between:-  4000 to 35000");
                b.putString("timing","Timing :-  12:00 pM to 1:00 AM");
                b.putString("geoo","geo:26.868010,81.010156");
                b.putString("limit","Limit  :-  0 to 170 peoples");
                b.putString("Theme","Theme   :- Dark and Open siting");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  Available");
                b.putString("phn","07800582222");
                Intent in = new Intent(HukkahRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });



        btnhokup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    Hookup Cafe");
                b.putString("add","ADDRESS :- Surya Lake view Apartment, b-3/10, Opp, Near Chinhat Tiraha, Vijayant Khand, Gomti Nagar, Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-  226010");
                b.putString("price","Price in between:-  2000 to 30000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 pM");
                b.putString("geoo","geo:26.872912,81.026135");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :- light and fancy");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  NO");
                b.putString("phn","05222970577");
                Intent in = new Intent(HukkahRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });
        btnMile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    Millenium Cafe");
                b.putString("add","ADDRESS :- B-3/10, Vijayant Khand, Gomti Nagar, Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-  226010");
                b.putString("price","Price in between:-  500 to 40000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 pM");
                b.putString("geoo","geo:26.872860,81.026157");
                b.putString("limit","Limit  :-  0 to 200 peoples");
                b.putString("Theme","Theme   :- light & good for groups");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn","");
                Intent in = new Intent(HukkahRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });

        btntramptree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    Tramptree Cafe");
                b.putString("add","ADDRESS :-B2, 75,, Raja Ram Kumar Plaza, Trilokinath Marg,, Hazratganj, Narpatkhera, Lalbagh, Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-   226001");
                b.putString("price","Price in between:-  1500 to 30000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 pM");
                b.putString("geoo","geo:26.846191,80.944005");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :-     Bustling");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn","9838885555");
                Intent in = new Intent(HukkahRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });






        btnhashttag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    Hashtag Cafe");
                b.putString("add","ADDRESS :-1/155D, Amar Shaheed Path, Vineet Khand 1, Gomti Nagar, Lucknow, Uttar Pradesh ");
                b.putString("pin","Pin Code:-   226010");
                b.putString("price","Price in between:-  1500 to 30000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 pM");
                b.putString("geoo","geo:26.850913,81.008294");
                b.putString("limit","Limit  :-  0 to 140 peoples");
                b.putString("Theme","Theme   :-     Cosy & Dark");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn","08960901511");
                Intent in = new Intent(HukkahRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });







        btnjail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","    The Jail Cafe");
                b.putString("add","ADDRESS :-No.173, Patrakarpuram Crosssing Road, Vidhayak Puram, Gomti Nagar, Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-   226010");
                b.putString("price","Price in between:-  500 to 9000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 pM");
                b.putString("geoo","geo:26.857250,81.001269");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :-     Latenight food casulas");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn","08400596000");
                Intent in = new Intent(HukkahRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });

    }
}