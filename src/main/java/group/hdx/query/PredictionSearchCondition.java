package group.hdx.query;

import lombok.Data;

import java.util.Date;

@Data
public class PredictionSearchCondition {
    private String minDate;
    private String maxDate;
}
