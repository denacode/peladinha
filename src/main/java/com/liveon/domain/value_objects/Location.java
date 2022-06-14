package com.liveon.domain.value_objects;

public class Location {
    private String latitude;
    private String longitude;

    public Location(String latitude, String longitude) throws Exception {
        this.latitude = latitude;
        this.longitude = longitude;
        if(isInvalid()){
            throw new Exception("Tu fez merda carai!!!!");
        }
    }

    private boolean isInvalid(){
        return latitude.equals("") && longitude.equals("");
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
