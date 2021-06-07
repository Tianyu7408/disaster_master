package group.hdx.query;

public class EarthquakeSearchCondition {
    private String minDate;
    private String maxDate;
    private double minLongitude;
    private double maxLongitude;
    private double minLatitude;
    private double maxLatitude;
    private double minDepth;
    private double maxDepth;
    private double minMagnitude;
    private double maxMagnitude;
    private String location;

    public EarthquakeSearchCondition() {
        this.minDate = "1900-01-01 00:00:00";
        this.maxDate = "2025-01-01 00:00:00";
        this.minLatitude = 0;
        this.maxLatitude = 90.0;
        this.minLongitude = 0;
        this.maxLongitude = 180.0;
        this.minDepth = 0;
        this.maxDepth = 1000;
        this.minMagnitude = 0;
        this.maxMagnitude = 15;
        this.location = "%";
    }

    public String getMinDate() {
        return minDate;
    }

    public void setMinDate(String minDate) {
        this.minDate = minDate;
    }

    public String getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(String maxDate) {
        this.maxDate = maxDate;
    }

    public double getMinLongitude() {
        return minLongitude;
    }

    public void setMinLongitude(double minLongitude) {
        this.minLongitude = minLongitude;
    }

    public double getMaxLongitude() {
        return maxLongitude;
    }

    public void setMaxLongitude(double maxLongitude) {
        this.maxLongitude = maxLongitude;
    }

    public double getMinLatitude() {
        return minLatitude;
    }

    public void setMinLatitude(double minLatitude) {
        this.minLatitude = minLatitude;
    }

    public double getMaxLatitude() {
        return maxLatitude;
    }

    public void setMaxLatitude(double maxLatitude) {
        this.maxLatitude = maxLatitude;
    }

    public double getMinDepth() {
        return minDepth;
    }

    public void setMinDepth(double minDepth) {
        this.minDepth = minDepth;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }

    public double getMinMagnitude() {
        return minMagnitude;
    }

    public void setMinMagnitude(double minMagnitude) {
        this.minMagnitude = minMagnitude;
    }

    public double getMaxMagnitude() {
        return maxMagnitude;
    }

    public void setMaxMagnitude(double maxMagnitude) {
        this.maxMagnitude = maxMagnitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = "%"+location+"%";
    }
}
