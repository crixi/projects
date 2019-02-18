package com.example.travelapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton rb = (RadioButton) findViewById(R.id.radioButton);
        rb.setOnClickListener(radioGroupClick);

        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb2.setOnClickListener(radioGroupClick);

        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb3.setOnClickListener(radioGroupClick);

    }

    private View.OnClickListener radioGroupClick = new View.OnClickListener() {
        public void onClick(View view) {
            RadioButton rb = (RadioButton) view;
            ImageView iv = (ImageView) findViewById(R.id.imageView);

            if (rb.getText().equals("Hopewell Rocks")) {
                iv.setImageResource(R.drawable.hopewell_rocks);
            } else if (rb.getText().equals("Niagara Falls")) {
                iv.setImageResource(R.drawable.niagara_falls);
            } else if (rb.getText().equals("Parliament Hill")) {
                iv.setImageResource(R.drawable.parliament_hill);
            }




        };
    };
}




