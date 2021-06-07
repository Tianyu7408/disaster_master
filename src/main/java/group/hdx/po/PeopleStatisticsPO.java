package group.hdx.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PeopleStatisticsPO implements Serializable {
    private int id;
    private String earthquakeId;

    private String province;
    private String country;
    private String city;
    private String town;
    private String village;
    private String location;

    private String category;
    private Date date;
    private String reportingUnit;
    private int number;
}
