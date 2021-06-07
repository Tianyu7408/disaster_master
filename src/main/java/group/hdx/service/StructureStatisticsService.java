package group.hdx.service;

import group.hdx.dto.StructureStatisticsDTO;
import group.hdx.po.StructureStatisticsPO;
import group.hdx.query.StructureSearchCondition;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StructureStatisticsService {

    List<StructureStatisticsPO> getAllStatistics();

    List<StructureStatisticsDTO> getStatisticsByCondition(StructureSearchCondition structureSearchCondition);
}
