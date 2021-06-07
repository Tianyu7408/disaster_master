package group.hdx.mapper;

import group.hdx.po.PredictionStatisticsPO;
import group.hdx.query.PredictionSearchCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PredictionStatisticsMapper {

    List<PredictionStatisticsPO> getAllStatistics();

    List<PredictionStatisticsPO> getStatisticsByCondition(PredictionSearchCondition predictionSearchCondition);

}
