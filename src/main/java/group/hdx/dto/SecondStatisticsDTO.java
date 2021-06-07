package group.hdx.dto;

import group.hdx.po.SecondStatisticsPO;

import java.sql.Date;

public class SecondStatisticsDTO {
    private Date date;
    private String location;
    private String note;

    public SecondStatisticsDTO(SecondStatisticsPO secondStatisticsPO) {
        this.date = new java.sql.Date(secondStatisticsPO.getDate().getTime());
        this.location = secondStatisticsPO.getLocation();
        this.note = secondStatisticsPO.getNote();
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
