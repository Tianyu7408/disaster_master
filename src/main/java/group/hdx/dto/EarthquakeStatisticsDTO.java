package group.hdx.dto;

import group.hdx.po.EarthquakeStatisticsPO;

import java.io.Serializable;
import java.sql.Date;

public class EarthquakeStatisticsDTO implements Serializable {

    private String location;
    private Date date;
    private String longitude;
    private String latitude;
    private int depth;
    private double magnitude;

    public EarthquakeStatisticsDTO(EarthquakeStatisticsPO earthquakeStatisticsPO) {
        this.location = earthquakeStatisticsPO.getLocation();
        this.date = new Date(earthquakeStatisticsPO.getDate().getTime());
        this.longitude = earthquakeStatisticsPO.getLongitude();
        this.latitude = earthquakeStatisticsPO.getLatitude();
        this.depth = earthquakeStatisticsPO.getDepth();
        this.magnitude = earthquakeStatisticsPO.getMagnitude();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
}
