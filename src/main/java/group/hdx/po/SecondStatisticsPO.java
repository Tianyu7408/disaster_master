package group.hdx.po;

import lombok.Data;

import java.util.Date;

@Data
public class SecondStatisticsPO {
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
    private int status;
    private int type;
    private String picture;
    private String note;
    private String reportingUnit;
}
