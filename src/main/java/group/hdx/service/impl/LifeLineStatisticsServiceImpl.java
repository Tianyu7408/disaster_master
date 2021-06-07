package group.hdx.service.impl;

import group.hdx.mapper.LifeLineStatisticsMapper;
import group.hdx.po.LifeLineStatisticsPO;
import group.hdx.query.LifeLineSearchCondition;
import group.hdx.service.LifeLineStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LifeLineStatisticsServiceImpl implements LifeLineStatisticsService {

    @Autowired
    LifeLineStatisticsMapper lifeLineStatisticsMapper;

    @Override
    public List<LifeLineStatisticsPO> getAllStatistics() {
        return lifeLineStatisticsMapper.getAllStatistics();
    }

    @Override
    public List<LifeLineStatisticsPO> getStatisticsByCondition(LifeLineSearchCondition lifeLineSearchCondition) {
        return lifeLineStatisticsMapper.getStatisticsByCondition(lifeLineSearchCondition);
    }
}
