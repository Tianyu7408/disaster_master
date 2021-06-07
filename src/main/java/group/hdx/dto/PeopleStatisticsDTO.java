package group.hdx.dto;

import group.hdx.po.PeopleStatisticsPO;

import java.io.Serializable;
import java.sql.Date;

public class PeopleStatisticsDTO implements Serializable {

    private Date date;
    private String location;
    private int number;

    public PeopleStatisticsDTO(PeopleStatisticsPO peopleStatisticsPO) {
        this.date = new Date(peopleStatisticsPO.getDate().getTime());
        this.location = peopleStatisticsPO.getLocation();
        this.number = peopleStatisticsPO.getNumber();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

