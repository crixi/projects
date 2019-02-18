package uk.ac.napier.set08114.travelapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LocationDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_details);

        Place place =
                (Place) getIntent().getParcelableExtra("place");

        if (place != null) {
            TextView locationTitle =
                    (TextView) findViewById(R.id.location_info_title);
            ImageView locationImage =
                    (ImageView) findViewById(R.id.location_info_image);
            TextView locationInfo =
                    (TextView) findViewById(R.id.location_info_body);

            locationTitle.setText(place.getName());
            locationImage.setImageResource(place.getIconId());
            locationInfo.setText(place.getInfo());
        }

        EditText nameText = (EditText) findViewById(R.id.editText);

        EditText nameText2 = (EditText) findViewById(R.id.editText2);

        nameText2.setFilters(new InputFilter[] {
                new InputFilter.LengthFilter(11),
                new InputFilter.AllCaps()

        });
        EditText nameText3 = (EditText) findViewById(R.id.editText3);

        nameText3.setFilters(new InputFilter[] {
                new InputFilter.LengthFilter(1),
                new InputFilter.AllCaps()

        });

        Button submitButton = (Button) findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "A confirmation e-mail will be sent soon.", Toast.LENGTH_SHORT).show();
                }

            });



    }
}
