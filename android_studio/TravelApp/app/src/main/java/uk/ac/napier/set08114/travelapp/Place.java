package uk.ac.napier.set08114.travelapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Place implements Parcelable {
    private String name;
    private int iconId;
    private String info;

    public String getName() { return this.name; }
    public int getIconId() { return this.iconId; }
    public String getInfo() { return info; }

    public void setName(String n) { this.name = n; }
    public void setIconId(int i) { this.iconId = i; }
    public void setInfo(String i) { this.info = i; }

    public Place(String name, int icon, String info) {
        setName(name);
        setIconId(icon);
        setInfo(info);
    }

    public Place(Place p) {
        setName(p.name);
        setIconId(p.iconId);
        setInfo(p.info);
    }

    public Place(Parcel in) {
        this.name = in.readString();
        this.iconId = in.readInt();
        this.info = in.readString();
    }

    public static final Parcelable.Creator<Place> CREATOR =
            new Parcelable.Creator<Place>(){
        public Place createFromParcel(Parcel in) {
            return new Place(in);
        }

        public Place[] newArray(int size) {
            return new Place[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.iconId);
        dest.writeString(this.info);
    }
}
