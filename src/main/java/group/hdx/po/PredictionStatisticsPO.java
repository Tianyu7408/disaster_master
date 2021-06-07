package group.hdx.po;

import lombok.Data;

import java.util.Date;

@Data
public class PredictionStatisticsPO {
    private int id;
    private Date date;
    private int grade;
    private int intensity;
    int type;
    String picture;
}
