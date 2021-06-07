package group.hdx.service.impl;

import group.hdx.mapper.PredictionStatisticsMapper;
import group.hdx.po.PredictionStatisticsPO;
import group.hdx.query.PredictionSearchCondition;
import group.hdx.service.PredictionStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PredictionStatisticsServiceImpl implements PredictionStatisticsService {

    @Autowired
    PredictionStatisticsMapper predictionStatisticsMapper;

    @Override
    public List<PredictionStatisticsPO> getAllStatistics() {
        return predictionStatisticsMapper.getAllStatistics();
    }

    @Override
    public List<PredictionStatisticsPO> getStatisticsByCondition(PredictionSearchCondition predictionSearchCondition) {
        return predictionStatisticsMapper.getStatisticsByCondition(predictionSearchCondition);
    }
}
