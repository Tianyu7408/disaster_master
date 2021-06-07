package group.hdx.service;

import group.hdx.dto.EarthquakeStatisticsDTO;
import group.hdx.dto.LocationStatisticsDTO;
import group.hdx.dto.ProvinceStatisticsDTO;
import group.hdx.po.EarthquakeStatisticsPO;
import group.hdx.query.EarthquakeSearchCondition;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EarthquakeStatisticsService {

    List<EarthquakeStatisticsDTO> getAllStatistics();

    List<EarthquakeStatisticsDTO> getStatisticsByCondition(EarthquakeSearchCondition earthquakeSearchCondition);

    List<ProvinceStatisticsDTO> getProvinceStatistics(String province);

    List<LocationStatisticsDTO> getRecentDisasterLocation();
}
