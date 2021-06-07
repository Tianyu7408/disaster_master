package group.hdx.mapper;


import group.hdx.po.SecondStatisticsPO;
import group.hdx.query.SecondSearchCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SecondStatisticsMapper {

    List<SecondStatisticsPO> getAllStatistics();

    List<SecondStatisticsPO> getStatisticsByCondition(SecondSearchCondition secondSearchCondition);
}
