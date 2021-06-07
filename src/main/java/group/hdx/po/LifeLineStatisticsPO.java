package group.hdx.po;

import lombok.Data;

import java.util.Date;

@Data
public class LifeLineStatisticsPO {

    private int id;
    private String earthquakeId;

    private String country;
    private String province;
    private String city;
    private String town;
    private String village;
    private String location;

    private String category;
    private Date date;
    private int type;
    private int grade;
    private String pictureURL;
    private String note;
    private String reportingUnit;
}
