package group.hdx.mapper;

import group.hdx.dto.LocationStatisticsDTO;
import group.hdx.dto.ProvinceStatisticsDTO;
import group.hdx.po.EarthquakeStatisticsPO;
import group.hdx.query.EarthquakeSearchCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EarthquakeStatisticsMapper {

    List<EarthquakeStatisticsPO> getAllStatistics();

    List<EarthquakeStatisticsPO> getStatisticsByCondition(EarthquakeSearchCondition earthquakeSearchCondition);

    List<ProvinceStatisticsDTO> getProvinceStatistics(String province);

    List<LocationStatisticsDTO> getRecentDisasterLocation();
}
