package group.hdx.service;

import group.hdx.dto.PeopleStatisticsDTO;
import group.hdx.po.PeopleStatisticsPO;
import group.hdx.query.PeopleSearchCondition;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PeopleStatisticsService {

    List<PeopleStatisticsPO> getAllStatistics();

    List<PeopleStatisticsDTO> getStatisticsByCondition(PeopleSearchCondition peopleSearchCondition);
}
