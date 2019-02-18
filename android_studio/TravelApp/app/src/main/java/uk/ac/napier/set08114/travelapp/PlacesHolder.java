package uk.ac.napier.set08114.travelapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlacesHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private final ImageView locationIcon;
    private final TextView locationName;

    private Place place;
    private Context context;

    public PlacesHolder(Context context, View itemView) {
        super(itemView);

        this.context = context;

        this.locationIcon = (ImageView) itemView.findViewById(R.id.entry_location_icon);
        this.locationName = (TextView) itemView.findViewById(R.id.entry_location_name);

        // Set the "onClick" listener of the holder
        // here we use (this) because this class has a onClick function thanks
        // to implementing the PlacesHolder class with the
        // View.OnClickListener interface
        itemView.setOnClickListener(this);
    }

    public void bindPlace(Place place) {
        // Bind the data to the ViewHolder
        this.place = place;
        this.locationName.setText(place.getName());
        this.locationIcon.setImageDrawable(
                this.context.getResources().getDrawable(place.getIconId()));
    }

    @Override
    public void onClick(View v) {
        if (this.place != null) {
            Intent intent = new Intent(itemView.getContext(), LocationDetails.class);
            intent.putExtra("place", this.place);
            itemView.getContext().startActivity(intent);
        }
    }
}
