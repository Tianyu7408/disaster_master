package group.hdx.po;

import lombok.Data;

import java.util.Date;

@Data
public class StructureStatisticsPO {
    private int id;
    private String earthquakeId;

    private String province;
    private String city;
    private String country;
    private String town;
    private String village;

    private String category;
    private Date date;
    private String location;
    private double basicallyIntactSquare;
    private double damagedSquare;
    private double destroySquare;
    private String note;
    private String reportingUnit;
}
