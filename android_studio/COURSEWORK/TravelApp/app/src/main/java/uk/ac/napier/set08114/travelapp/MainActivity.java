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
                "Pack 1. Beginners",
                R.drawable.pack1,
                "Collagen is the most abundant protein in the body and helps give structure to our hair, skin, nails, bones, ligaments and tendons in our body. Thanks to collagen, we’re better able to move, bend and stretch. Collagen is also behind helping hair shine, skin glow and nails stay strong. \n" +
                        "\n" +
                        "As we age, and the more stress we put on our body, the greater the impact on collagen production. Getting collagen in a balanced diet can help our bodies regenerate what’s been lost of broken down.  \n" +
                        "\n" +
                        "Collagen is a protein made up of amino-acids: glycine, proline, hydroxyproline, and arginine, all of which help our body's connective tissue, skin, hair, nails, as well as gut health stay as healthy as possible. \n" +
                        "\n" +
                        "Collagen protein is different than whey and casein protein because of these high levels of amino acids. Muscular growth, joint health and an overall glowing appearance can be partially attributed to the amino acid blend in collagen that can't be found anywhere else.");



        Place Tasting2 = new Place(
                "Pack 2. Grown ups",
                R.drawable.pack2,
                "Vitamin C, also known as L-ascorbic acid, is a water-soluble vitamin that is naturally present in some foods, added to others, and available as a dietary supplement. Humans, unlike most animals, are unable to synthesize vitamin C endogenously, so it is an essential dietary component [1].\n" +
                        "\n" +
                        "Vitamin C is required for the biosynthesis of collagen, L-carnitine, and certain neurotransmitters; vitamin C is also involved in protein metabolism [1,2]. Collagen is an essential component of connective tissue, which plays a vital role in wound healing.");
        Place Tasting3 = new Place(
                "Pack 3. I like whiskey",
                R.drawable.pack3,
                "These nutrients are needed to keep bones, teeth and muscles healthy.\n" +
                        "\n" +
                        "During the autumn and winter, you need to get vitamin D from your diet because the sun isn't strong enough for the body to make vitamin D.\n" +
                        "\n" +
                        "But since it's difficult for people to get enough vitamin D from food alone, everyone (including pregnant and breastfeeding women) should consider taking a daily supplement containing 10 micrograms of vitamin D during the autumn and winter.\n" +
                        "\n" +
                        "Between late March/early April to the end of September, most people can get all the vitamin D they need through sunlight on their skin and from a balanced diet.");

        Place Tasting4 = new Place(
                "Pack 4. Whiskey passion",
                R.drawable.pack4,
                "Kefir is a healthy, fermented food with a consistency comparable to drinkable yogurt. This product is traditionally made from dairy milk, but plenty of non-dairy options are available. Studies suggest that it boosts your immune system, aids in digestive problems, improves bone health and may even combat cancer.\n" +
                        "\n" +
                        "Kefir may contain up to 61 different microorganisms, making it a much more potent source of probiotics than many other fermented dairy products.");

        Place Tasting5 = new Place(
                "Pack 5. Connaisseurs",
                R.drawable.pack5,
                "Vitamin E helps maintain healthy skin and eyes, and strengthen the body's natural defence against illness and infection (the immune system).\n" +
                        "\n" +
                        "Vitamin E is a fat-soluble antioxidant that stops the production of ROS formed when fat undergoes oxidation. Scientists are investigating whether, by limiting free-radical production and possibly through other mechanisms, vitamin E might help prevent or delay the chronic diseases associated with free radicals.");


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
