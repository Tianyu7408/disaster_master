package group.hdx.service.impl;

import group.hdx.dto.EarthquakeStatisticsDTO;
import group.hdx.dto.StructureStatisticsDTO;
import group.hdx.mapper.StructureStatisticsMapper;
import group.hdx.po.EarthquakeStatisticsPO;
import group.hdx.po.StructureStatisticsPO;
import group.hdx.query.StructureSearchCondition;
import group.hdx.service.StructureStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class StructureStatisticsServiceImpl implements StructureStatisticsService {

    @Autowired
    StructureStatisticsMapper structureStatisticsMapper;

    @Override
    public List<StructureStatisticsPO> getAllStatistics() {
        return structureStatisticsMapper.getAllStatistics();
    }

    @Override
    public List<StructureStatisticsDTO> getStatisticsByCondition(StructureSearchCondition structureSearchCondition) {
        List<StructureStatisticsDTO> resultList = new LinkedList<>();
        for(StructureStatisticsPO sPO : structureStatisticsMapper.getAllStatistics()){
            resultList.add(new StructureStatisticsDTO(sPO));
        }
        return resultList;
    }
}
