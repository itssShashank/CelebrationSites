package com.example.sam19.celebrationsites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeaRaw extends AppCompatActivity {
    Button btntasty1,btnupvan,btndesiaan,btnjunction,btncitypoint,btnpunjab,btnzest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tea_raw);
        btntasty1=(Button)findViewById(R.id.btntasty);
        btnupvan=(Button)findViewById(R.id.btnupvan);
        btndesiaan=(Button)findViewById(R.id.btndesiaan);
        btnjunction=(Button)findViewById(R.id.btnjunction);
        btncitypoint=(Button)findViewById(R.id.btncitypoint);
        btnpunjab=(Button)findViewById(R.id.btnpunjab);
        btnzest=(Button)findViewById(R.id.btnzest);







        btntasty1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","   Tasty Bite Restaurant");
                b.putString("add","ADDRESS :-  Parijat Complex, Civil Line, Lucknow  Road, Awas  Vikas  Colony, Barabanki, Uttar Pradesh");
                b.putString("pin","Pin Code:-   225001");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  1500 to 30000");
                b.putString("timing","Timing :-  10AM-10PM");
                b.putString("geoo","geo:26.923149,81.176980");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :-     Casual");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn","  09415049600");
                Intent in = new Intent(TeaRaw.this, BachelorMoreDetails.class);
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
                Intent in = new Intent(TeaRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });



        btndesiaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name"," DESIAAN PURE VEG FAMILY RESTAURANT");
                b.putString("add","ADDRESS :-  Near Jawahar Degree College, Station road, Preet Vihar Colony, Civil Lines, Barabanki, Uttar Pradesh");
                b.putString("pin","Pin Code:-   225001");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  1500 to 30000");
                b.putString("timing","Timing :-  10:30AM-11PM");
                b.putString("geoo","geo: 26.931379,81.181107");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :-     Casual");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn","08726235311");
                Intent in = new Intent(TeaRaw.this, BachelorMoreDetails.class);
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
                Intent in = new Intent(TeaRaw.this, BachelorMoreDetails.class);
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
                Intent in = new Intent(TeaRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });




        btnpunjab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","  Shere Punjab Restaurant");
                b.putString("add","ADDRESS :-  Opposite K.D.Singh Babu Stadium, Lko-Faizabad Road, Barabanki, Uttar Pradesh");
                b.putString("pin","Pin Code:-   225001");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  1500 to 30000");
                b.putString("timing","Timing :-   Mon-Sat:- 9:00AM-7:00PM      Sun:- 9:00AM-4:00PM");
                b.putString("geoo","geo: 26.926282,81,190526");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :-     Casual");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn"," 9305690553, +919454566661");
                Intent in = new Intent(TeaRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });




        btnzest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("name","   Food Zest ");
                b.putString("add","ADDRESS :-  Near chaya chouraha, station road, Barabanki, Uttar Pradesh");
                b.putString("pin","Pin Code:-   225001");
                b.putString("veg","VEGETARIAN and NON-VEGETARIAN");

                b.putString("price","Price in between:-  1500 to 30000");
                b.putString("timing","Timing :-   Mon-Fri:- 9:00AM-4:00PM ");
                b.putString("geoo","geo: 26.930800,81.186900");
                b.putString("limit","Limit  :-  0 to 100 peoples");
                b.putString("Theme","Theme   :-     Casual");
                b.putString("Parking","Parking   :-   YES");
                b.putString("Liqor","Liqor      :-  yes");
                b.putString("phn"," 09453500926");
                Intent in = new Intent(TeaRaw.this, BachelorMoreDetails.class);
                in.putExtras(b);

                startActivity(in);
            }
        });

    }
}
