package group.hdx.mapper;

import group.hdx.po.PeopleStatisticsPO;
import group.hdx.query.PeopleSearchCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PeopleStatisticsMapper {

    List<PeopleStatisticsPO> getAllStatistics();

    List<PeopleStatisticsPO> getStatisticsByCondition(PeopleSearchCondition peopleSearchCondition);
}
