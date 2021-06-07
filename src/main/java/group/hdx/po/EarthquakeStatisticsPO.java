package group.hdx.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class EarthquakeStatisticsPO implements Serializable {
    private String earthquakeId;

    private String province;
    private String city;
    private String country;
    private String town;
    private String village;
    private String location;

    private String category;
    private Date date;

    private String longitude;
    private String latitude;
    private int depth;
    private double magnitude;

    private String reportingUnit;
    private String picture;
}
