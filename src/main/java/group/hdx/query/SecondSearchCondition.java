package group.hdx.query;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class SecondSearchCondition {
    private String minDate;
    private String maxDate;
    private String location;

    public SecondSearchCondition() {
        this.minDate = "1900-01-01 00:00:00";
        this.maxDate = "2025-01-01 00:00:00";
        location = "%";
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = "%"+location+"%";
    }
}
