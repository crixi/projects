package uk.ac.napier.set08114.travelapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesHolder> {
    private final List<Place> places;
    private Context context;
    private int itemResource;

    public PlacesAdapter(Context context, int itemResource, List<Place> places) {

        this.places = places;
        this.context = context;
        this.itemResource = itemResource;
    }

    @Override
    public PlacesHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(this.itemResource, parent, false);
        return new PlacesHolder(this.context, view);
    }

    @Override
    public void onBindViewHolder(PlacesHolder holder, int position) {

        // Use position to access the correct place object
        Place p = this.places.get(position);

        // Bind the place object to the holder
        holder.bindPlace(p);
    }

    @Override
    public int getItemCount() {
        return this.places.size();
    }
}
