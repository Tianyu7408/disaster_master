package group.hdx.service;

import group.hdx.po.PredictionStatisticsPO;
import group.hdx.query.PredictionSearchCondition;

import java.util.List;

public interface PredictionStatisticsService {

    List<PredictionStatisticsPO> getAllStatistics();

    List<PredictionStatisticsPO> getStatisticsByCondition(PredictionSearchCondition predictionSearchCondition);
}
