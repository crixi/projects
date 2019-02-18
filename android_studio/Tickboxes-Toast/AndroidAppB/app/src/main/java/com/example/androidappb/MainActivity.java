package com.example.androidappb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cbox1 = (CheckBox) findViewById(R.id.checkBox);
        cbox1.setOnClickListener(startListener);
        CheckBox cbox2 = (CheckBox) findViewById(R.id.checkBox2);
        cbox2.setOnClickListener(startListener2);
        CheckBox cbox3 = (CheckBox) findViewById(R.id.checkBox3);
        cbox3.setOnClickListener(startListener3);
    }

    private View.OnClickListener startListener = new View.OnClickListener() {
        //sharing a listener so need to check which clicked
        public void onClick(View v) {
            CheckBox cbox1 = (CheckBox) findViewById(R.id.checkBox);
            if (cbox1.isChecked())
                Toast.makeText(MainActivity.this, "checkbox1 checked",
                        Toast.LENGTH_LONG).show();
                //add code to recognise the other boxes
            else
                Toast.makeText(MainActivity.this, "checkbox1 unchecked",
                        Toast.LENGTH_LONG).show();
        }
    };
    private View.OnClickListener startListener2 = new View.OnClickListener() {
        //sharing a listener so need to check which clicked
        public void onClick(View v) {
            CheckBox cbox2 = (CheckBox) findViewById(R.id.checkBox2);
            if (cbox2.isChecked())
                Toast.makeText(MainActivity.this, "checkbox2 checked",
                        Toast.LENGTH_LONG).show();
                //add code to recognise the other boxes
            else
                Toast.makeText(MainActivity.this, "checkbox2 unchecked",
                        Toast.LENGTH_LONG).show();
        }
    };
    private View.OnClickListener startListener3 = new View.OnClickListener() {
        //sharing a listener so need to check which clicked
        public void onClick(View v) {
            CheckBox cbox3 = (CheckBox) findViewById(R.id.checkBox3);
            if (cbox3.isChecked())
                Toast.makeText(MainActivity.this, "checkbox3 checked",
                        Toast.LENGTH_LONG).show();
                //add code to recognise the other boxes
            else
                Toast.makeText(MainActivity.this, "checkbox3 unchecked",
                        Toast.LENGTH_LONG).show();
        }
    };
};





