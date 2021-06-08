package group.hdx.service.impl;

import group.hdx.dto.EarthquakeStatisticsDTO;
import group.hdx.dto.SecondStatisticsDTO;
import group.hdx.mapper.SecondStatisticsMapper;
import group.hdx.po.EarthquakeStatisticsPO;
import group.hdx.po.SecondStatisticsPO;
import group.hdx.query.SecondSearchCondition;
import group.hdx.service.SecondStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class SecondStatisticsServiceImpl implements SecondStatisticsService {

    @Autowired
    SecondStatisticsMapper secondStatisticsMapper;

    @Override
    public List<SecondStatisticsPO> getAllStatistics() {
        return secondStatisticsMapper.getAllStatistics();
    }

    @Override
    public List<SecondStatisticsDTO> getStatisticsByCondition(SecondSearchCondition secondSearchCondition) {
        List<SecondStatisticsDTO> result = new LinkedList<>();
        for (SecondStatisticsPO sPO : secondStatisticsMapper.getStatisticsByCondition(secondSearchCondition)) {
            result.add(new SecondStatisticsDTO(sPO));
        }
        return result;
    }
}
