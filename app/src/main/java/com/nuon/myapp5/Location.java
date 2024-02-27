package com.nuon.myapp5;

public class Location {
    double Longitude;
    double Latitude;
    public Location (double longitude, double latitude){
        this.Longitude = longitude;
        this.Latitude = latitude;
    }

    public void setLongitude(double longitude){
        this.Longitude = longitude;
    }
    public void setLatitude(double latitude){
        this.Latitude = latitude;
    }
    public String toString(){
        String str = "Longitude: " + Longitude + "\n" + "Latitude: " + Latitude;
        return str;
    }
}
