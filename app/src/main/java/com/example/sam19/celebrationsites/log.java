package com.example.sam19.celebrationsites;


import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class log extends Activity implements OnClickListener {
    Context context = this;
    Spinner spinner1;
    EditText etUsername, etPassword;
    Button btnLogin, btnRegister, skip;
    SQLiteDatabase db;
    static String user = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        db = openOrCreateDatabase("Submitdetail", Context.MODE_PRIVATE, null);

        db.execSQL("create table if not exists admin(u_nm varchar2(20),pwd varchar2(10))");
        db.execSQL("create table if not exists regis(f_name varchar2(20),u_name varchar2(20),pwd varchar2(20),adr varchar2(20),cnt varchar2(20),e_mail varchar2(30))");

        String Query = "select * from admin";
        Cursor c = db.rawQuery(Query, null);
        if (c.moveToFirst()) {
            do {

            } while (c.moveToNext());

        } else {
            db.execSQL("insert into admin values('admin','admin')");

        }

        etUsername = (EditText) findViewById(R.id.ed_id);
        etPassword = (EditText) findViewById(R.id.ed_pwd);

        btnLogin = (Button) findViewById(R.id.btn_login);
        skip=(Button)findViewById(R.id.btnsskkiipp);
        btnRegister = (Button) findViewById(R.id.btn_register);
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        skip.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(log.this,DashBoard.class);
                startActivity(in);

            }
        });

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if (v == btnLogin) {

            if (etUsername.getText().toString().trim().length() == 0) {
                etUsername.setError("Enter username");
                return;
            }
            if (etPassword.getText().toString().trim().length() == 0) {
                etPassword.setError("Enter password");
                return;
            } else {
                String Query_check = "select * from admin where u_nm='"
                        + etUsername.getText().toString() + "' and pwd='"
                        + etPassword.getText().toString() + "'";
                Cursor c = db.rawQuery(Query_check, null);
                if (c.moveToFirst()) {
                    do {
                        Intent intent = new Intent(getApplicationContext(),
                                AdminActivity.class);
                        startActivity(intent);
                    } while (c.moveToNext());

                } else {
                    String Query_reg = "select * from regis where u_name='"
                            + etUsername.getText().toString() + "' and pwd='"
                            + etPassword.getText().toString() + "'";
                    Cursor c1 = db.rawQuery(Query_reg, null);
                    if (c1.moveToFirst()) {
                        do {
                            user = etUsername.getText().toString();
                            Intent intent = new Intent(getApplicationContext(),
                                    DashBoard.class);
                            startActivity(intent);
                        } while (c1.moveToNext());

                    }
                    if (c1.getCount() == 0) {
                        showmessage("Sorry",
                                "username and password does not match");
                    }
                }
            }
        }
        if (v == btnRegister) {
            Intent i = new Intent(getApplicationContext(),
                    register.class);
            startActivity(i);
        }
    }

    void showmessage(String title, String message) {
        Builder b = new Builder(context);
        b.setTitle(title).setMessage(message).show();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}