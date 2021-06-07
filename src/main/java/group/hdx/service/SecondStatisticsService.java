package group.hdx.service;

import group.hdx.dto.SecondStatisticsDTO;
import group.hdx.po.SecondStatisticsPO;
import group.hdx.query.SecondSearchCondition;
import org.springframework.stereotype.Service;

import java.util.List;
public interface SecondStatisticsService {

    List<SecondStatisticsPO> getAllStatistics();

    List<SecondStatisticsDTO> getStatisticsByCondition(SecondSearchCondition secondSearchCondition);

}
