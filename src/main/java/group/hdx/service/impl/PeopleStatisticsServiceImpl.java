package group.hdx.service.impl;

import group.hdx.dto.EarthquakeStatisticsDTO;
import group.hdx.dto.PeopleStatisticsDTO;
import group.hdx.mapper.PeopleStatisticsMapper;
import group.hdx.po.EarthquakeStatisticsPO;
import group.hdx.po.PeopleStatisticsPO;
import group.hdx.query.PeopleSearchCondition;
import group.hdx.service.PeopleStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class PeopleStatisticsServiceImpl implements PeopleStatisticsService {

    @Autowired
    PeopleStatisticsMapper peopleStatisticsMapper;

    @Override
    public List<PeopleStatisticsPO> getAllStatistics() {
        return peopleStatisticsMapper.getAllStatistics();
    }

    @Override
    public List<PeopleStatisticsDTO> getStatisticsByCondition(PeopleSearchCondition peopleSearchCondition) {
        List<PeopleStatisticsDTO> result = new LinkedList<>();
        for (PeopleStatisticsPO pPO : peopleStatisticsMapper.getAllStatistics()) {
            result.add(new PeopleStatisticsDTO(pPO));
        }
        return result;
    }
}
