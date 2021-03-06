package eu.ryancauble.musicmash;

import android.util.Log;

public class Music {

    private String name;
    private String description;
    private String address;

    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Music(String name, String description, String address, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;

        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage(){
        Log.v("hasImage", "word has image: "+ (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasAddress(){
        return getAddress() != null;
    }




}
