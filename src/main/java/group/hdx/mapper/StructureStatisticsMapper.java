package group.hdx.mapper;

import group.hdx.po.StructureStatisticsPO;
import group.hdx.query.StructureSearchCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StructureStatisticsMapper {

    List<StructureStatisticsPO> getAllStatistics();

    List<StructureStatisticsPO> getStatisticsByCondition(StructureSearchCondition structureSearchCondition);

}
