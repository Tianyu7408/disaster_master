package group.hdx.service;

import group.hdx.po.LifeLineStatisticsPO;
import group.hdx.query.LifeLineSearchCondition;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LifeLineStatisticsService {

    List<LifeLineStatisticsPO> getAllStatistics();

    List<LifeLineStatisticsPO> getStatisticsByCondition(LifeLineSearchCondition lifeLineSearchCondition);
}
