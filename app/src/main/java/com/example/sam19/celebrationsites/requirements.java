package com.example.sam19.celebrationsites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class requirements extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
        String arr[] = {"Delux lawns", "Royal lawns", "Normal lawns", "Banquet hall", "Auditorium"};
        String act;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_requirements);
            SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
            Spinner spin = (Spinner) findViewById(R.id.spinner);
            Spinner spin1 = (Spinner) findViewById(R.id.s1);


            final TextView seekBarValue = (TextView) findViewById(R.id.textView5);

            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

                @Override
                public void onProgressChanged(SeekBar seekBar, int progress,
                                              boolean fromUser) {
                    seekBarValue.setText(String.valueOf(progress) + "Kms");
                    act = seekBarValue.getText().toString();
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    Toast.makeText(getApplicationContext(), "you have selected " + act + " kms", Toast.LENGTH_SHORT).show();

                }
            });
            spin.setOnItemSelectedListener(this);

            ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,arr);
            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spin.setAdapter(aa);

        }

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
            Toast.makeText(this, "You have selected"+arr[position], Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
            Toast.makeText(this, "Nothing Selected", Toast.LENGTH_SHORT).show();

        }

    }
