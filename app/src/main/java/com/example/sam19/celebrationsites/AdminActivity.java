package com.example.sam19.celebrationsites;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class AdminActivity extends AppCompatActivity {
Button b1;
TextView tv;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        tv=(TextView)findViewById(R.id.tvvvvvv);
        b1=(Button)findViewById(R.id.butttttt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


        db = openOrCreateDatabase("Submitdetail", Context.MODE_PRIVATE, null);

        String Query = "select * from regis";
        Cursor c = db.rawQuery(Query, null);
        if (c.moveToFirst()) {
            do {

                while(!c.isAfterLast())
                {
                    String data=c.getInt(0)+" => "+c.getString(1)+" "+c.getString(2)+" => "+c.getString(1)+" => "+c.getInt(3);
                    tv.setText(tv.getText()+"\n"+data);
                    c.moveToNext();
                }
            } while (c.moveToNext());

        } else {


        }
            }
        });
    }
}
