package group.hdx.mapper;

import group.hdx.po.LifeLineStatisticsPO;
import group.hdx.query.LifeLineSearchCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LifeLineStatisticsMapper {

    List<LifeLineStatisticsPO> getAllStatistics();

    List<LifeLineStatisticsPO> getStatisticsByCondition(LifeLineSearchCondition lifeLineSearchCondition);
}
