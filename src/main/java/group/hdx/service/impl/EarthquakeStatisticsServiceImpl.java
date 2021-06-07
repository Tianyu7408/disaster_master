package group.hdx.service.impl;

import group.hdx.dto.EarthquakeStatisticsDTO;
import group.hdx.dto.LocationStatisticsDTO;
import group.hdx.dto.ProvinceStatisticsDTO;
import group.hdx.mapper.EarthquakeStatisticsMapper;
import group.hdx.po.EarthquakeStatisticsPO;
import group.hdx.query.EarthquakeSearchCondition;
import group.hdx.service.EarthquakeStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class EarthquakeStatisticsServiceImpl implements EarthquakeStatisticsService {

    @Autowired
    EarthquakeStatisticsMapper earthquakeStatisticsMapper;

    @Override
    public List<EarthquakeStatisticsDTO> getAllStatistics() {
        List<EarthquakeStatisticsDTO> result = new LinkedList<>();
        for(EarthquakeStatisticsPO ePO :earthquakeStatisticsMapper.getAllStatistics()){
            result.add(new EarthquakeStatisticsDTO(ePO));
        }
        return result;
    }

    @Override
    public List<EarthquakeStatisticsDTO> getStatisticsByCondition(EarthquakeSearchCondition earthquakeSearchCondition) {
        List<EarthquakeStatisticsDTO> result = new LinkedList<>();
        for(EarthquakeStatisticsPO ePO :earthquakeStatisticsMapper.getAllStatistics()){
            result.add(new EarthquakeStatisticsDTO(ePO));
        }
        return result;
    }

    public List<ProvinceStatisticsDTO> getProvinceStatistics(String province){
        return earthquakeStatisticsMapper.getProvinceStatistics(province);
    }

    public List<LocationStatisticsDTO> getRecentDisasterLocation(){
        return earthquakeStatisticsMapper.getRecentDisasterLocation();
    }
}
