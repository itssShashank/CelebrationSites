package com.example.sam19.celebrationsites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ReceptionRaw extends AppCompatActivity {
    Button btnbsa1, btntasty1,btnupvan,btndesiaan,btnjunction,btncitypoint,btnpunjab,btnzest,btnbsaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reception_raw);

        btnbsaa=(Button)findViewById(R.id.btnbsa);

        btntasty1=(Button)findViewById(R.id.btntasty);
        btnupvan=(Button)findViewById(R.id.btnupvan);
        btndesiaan=(Button)findViewById(R.id.btndesiaan);
        btnjunction=(Button)findViewById(R.id.btnjunction);
        btncitypoint=(Button)findViewById(R.id.btncitypoint);
        btnpunjab=(Button)findViewById(R.id.btnpunjab);
        btnzest=(Button)findViewById(R.id.btnzest);
        btnbsa1=(Button)findViewById(R.id.btnbsa) ;






        btnbsa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","   BSA LAWN");
                b.putString("add","ADDRESS :-  DEWA Road , Adarsh nagar, Matiyari, Kamta,  Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-   226010");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  70000 to 1000000");
                b.putString("timing","Timing :-  10AM-10PM");
                b.putString("geoo","geo:26.886200,81.042754");
                b.putString("limit","Limit  :-  0 to 1100 peoples");
                b.putString("Theme","Theme   :-     Casual");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn","  ");
                Intent in = new Intent(ReceptionRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });



        btntasty1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","   Ganpati Lawn");
                b.putString("add","ADDRESS :-  Haibat Mau Mawaiya, sector 4, Vrindavan Colony , Lucknow, Uttar Pradesh");
                b.putString("pin","Pin Code:-   226029");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  150000 to 300000");
                b.putString("timing","Timing :-  10AM-10PM");
                b.putString("geoo","geo:26.754800,80.948977");
                b.putString("limit","Limit  :-  0 to 1100 peoples");
                b.putString("Theme","Theme   :-     formal");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn","  ");
                Intent in = new Intent(ReceptionRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });



        btnupvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","   Upvan");
                b.putString("add","ADDRESS :-  Chaya Chauraha, Preet Vihar Colony, Begum Gunj, Barabanki, Uttar Pradesh ");
                b.putString("pin","Pin Code:-   225001");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  1500 to 30000");
                b.putString("timing","Timing :-  11AM-10:30PM");
                b.putString("geoo","geo:  26.930366,81.190808");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :-     Casual");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn","09415075276");
                Intent in = new Intent(ReceptionRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });



        btndesiaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name"," ROYAL VRINDAVAN LAWN");
                b.putString("add","ADDRESS :-  5D\\6, Girdhar kunj, Gopeshkunj, Sector 5E, Vrindavan Colony, Lucknow, Uttar Pradesh 226025");
                b.putString("pin","Pin Code:-   226025");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  200000 to 600000");
                b.putString("timing","Timing :-  10:30AM-11PM");
                b.putString("geoo","geo: 26.778803,80.952629");
                b.putString("limit","Limit  :-  0 to 1000 peoples");
                b.putString("Theme","Theme   :-    FORMAL & Casual");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn","09415005270");
                Intent in = new Intent(ReceptionRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });




        btnjunction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","   Food Junction Restaurant");
                b.putString("add","ADDRESS :-  3/118,Vivek Khand 3, Gomti Nagar, Lucknow, Uttar Pradesh ");
                b.putString("pin","Pin Code:-   226010");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  1500 to 30000");
                b.putString("timing","Timing :-  11:00AM=-10:30PM");
                b.putString("geoo","geo:26.858102,80.997670");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :-     Casual");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn","07309233864");
                Intent in = new Intent(ReceptionRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });




        btncitypoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","   City Point Restaurant and Banquet Hall");
                b.putString("add","ADDRESS :-  Shri Sai Plaza, Obaree, Opposite DM Awas, NH-28C, Lucknow Colonelganj Gonda Road, Barabanki, Uttar Pradesh");
                b.putString("pin","Pin Code:-   225001");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  1500 to 30000");
                b.putString("timing","Timing :-  11:00 AM to 11:00 pM");
                b.putString("geoo","geo:26.923904,81.178124");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :-     Casual");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn","+918935028416");
                Intent in = new Intent(ReceptionRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });




        btnpunjab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","  Shree Kunj Lawn");
                b.putString("add","ADDRESS :-  Opposite K.D.Singh Babu Stadium, Lko-Faizabad Road, Barabanki, Uttar Pradesh");
                b.putString("pin","Pin Code:-   225001");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  90000 to 600000");
                b.putString("timing","Timing :-   Mon-Sat:- 9:00AM-7:00PM      Sun:- 9:00AM-4:00PM");
                b.putString("geoo","geo: 26.886335,81,051750");
                b.putString("limit","Limit  :-  0 to 1100 peoples");
                b.putString("Theme","Theme   :-     Casual");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn"," 09565829999");
                Intent in = new Intent(ReceptionRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });


    }
}
