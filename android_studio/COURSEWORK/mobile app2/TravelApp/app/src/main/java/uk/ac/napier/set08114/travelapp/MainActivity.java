package uk.ac.napier.set08114.travelapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView attractionsListView;
    private ArrayList<Place> places;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attractionsListView = (RecyclerView)findViewById(R.id.attractions_list);
        // if the recyclerview doesn't change size, we can set this true and
        attractionsListView.setHasFixedSize(true);

        // get the data
        loadPlaces();

       // Initialize the Places adapter, which binds the data to the entry view
        PlacesAdapter adapter = new PlacesAdapter(this, R.layout.location_entry, places);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        attractionsListView.setLayoutManager(layoutManager);

        attractionsListView.setAdapter(adapter);
        // You can change animation of items and decorations
        // by using ItemAnimator and ItemDecorators and binding them
        // by calling to appropriate method attractionsListView.setItem...
    }


    private void loadPlaces() {
        places = new ArrayList<Place>();

        Place Tasting1 = new Place(
                R.string.Beginners_name,
                R.drawable.pack1,
                R.string.Beginners_info);



        Place Tasting2 = new Place(
                R.string.Grownups_name,
                R.drawable.pack2,
                R.string.Grownups_info);

        Place Tasting3 = new Place(
                R.string.Ilikewhiskey_name,
                R.drawable.pack3,
                R.string.Ilikewhiskey_info);


        Place Tasting4 = new Place(
                R.string.Whiskeypassion_name,
                R.drawable.pack4,
                R.string.Whiskeypassion_info);

        Place Tasting5 = new Place(
                R.string.Connaisseurs_name,
                R.drawable.pack5,
                R.string.Connaisseurs_info);



        places.add(Tasting1);
        places.add(Tasting2);
        places.add(Tasting3);
        // we repeat the same here, so we have more to see and get
        // a longer list to scroll through. But feel free to
        // add some more places on your own.
        places.add(Tasting4);
        places.add(Tasting5);


    }
}
