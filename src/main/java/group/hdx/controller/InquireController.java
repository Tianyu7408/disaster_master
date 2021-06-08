package group.hdx.controller;

import group.hdx.common.Result;
import group.hdx.common.ResultGenerator;
import group.hdx.dto.*;
import group.hdx.po.EarthquakeStatisticsPO;
import group.hdx.po.PeopleStatisticsPO;
import group.hdx.po.SecondStatisticsPO;
import group.hdx.po.StructureStatisticsPO;
import group.hdx.query.EarthquakeSearchCondition;
import group.hdx.query.PeopleSearchCondition;
import group.hdx.query.SecondSearchCondition;
import group.hdx.query.StructureSearchCondition;
import group.hdx.service.EarthquakeStatisticsService;
import group.hdx.service.PeopleStatisticsService;
import group.hdx.service.SecondStatisticsService;
import group.hdx.service.StructureStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RequestMapping("/inquire")
@RestController
public class InquireController {

    @Autowired
    EarthquakeStatisticsService earthquakeStatisticsService;

    @Autowired
    SecondStatisticsService secondStatisticsService;

    @Autowired
    StructureStatisticsService structureStatisticsService;

    @Autowired
    PeopleStatisticsService peopleStatisticsService;

//    @Qualifier("customizeObjectMapper")
//    @Autowired
//    ObjectMapper objectMapper;

    @RequestMapping("/getAllEarthquakeStatistics")
    Result inquireEarthquakeDisasterInfo() {
        return ResultGenerator.genSuccessResult(earthquakeStatisticsService.getAllStatistics());
    }

    @RequestMapping("/getEarthquakeStatistics/{condition}")
    Result inquireSomeEarthquakeDisasterInfo(@PathVariable("condition") String condition) throws ParseException {
        String[] conditions = condition.split("&");
        HashMap<String, String> conditionMap = new HashMap<>();

        conditionMap.put("minDate", " 1980-01-01 00:00:00 ");
        conditionMap.put("maxDate", " 2022-01-01 00:00:00 ");
        conditionMap.put("minLongitude", "0");
        conditionMap.put("maxLongitude", "180.0");
        conditionMap.put("minLatitude", "0");
        conditionMap.put("maxLatitude", "90.0");
        conditionMap.put("minDepth", "0");
        conditionMap.put("maxDepth", "1000");
        conditionMap.put("minMagnitude", "0");
        conditionMap.put("maxMagnitude", "15.0");
        conditionMap.put("location", "%");

        for (String s : conditions) {
            conditionMap.put(s.split("=")[0], s.split("=")[1]);
        }

        EarthquakeSearchCondition earthquakeSearchCondition = new EarthquakeSearchCondition();
        earthquakeSearchCondition.setMinDate(conditionMap.get("minDate"));
        earthquakeSearchCondition.setMaxDate(conditionMap.get("maxDate"));
        earthquakeSearchCondition.setMinLongitude(Double.parseDouble(conditionMap.get("minLongitude")));
        earthquakeSearchCondition.setMaxLongitude(Double.parseDouble(conditionMap.get("maxLongitude")));
        earthquakeSearchCondition.setMinLatitude(Double.parseDouble(conditionMap.get("minLatitude")));
        earthquakeSearchCondition.setMaxLatitude(Double.parseDouble(conditionMap.get("maxLatitude")));
        earthquakeSearchCondition.setMinDepth(Double.parseDouble(conditionMap.get("minDepth")));
        earthquakeSearchCondition.setMaxDepth(Double.parseDouble(conditionMap.get("maxDepth")));
        earthquakeSearchCondition.setMinMagnitude(Double.parseDouble(conditionMap.get("minMagnitude")));
        earthquakeSearchCondition.setMaxMagnitude(Double.parseDouble(conditionMap.get("maxMagnitude")));
        earthquakeSearchCondition.setLocation(conditionMap.get("location"));

        List<EarthquakeStatisticsDTO> resultList = earthquakeStatisticsService.getStatisticsByCondition(earthquakeSearchCondition);

        if (resultList.size() == 0) {
            return ResultGenerator.genFailResult("未查找到符合条件的数据");
        }

        return ResultGenerator.genSuccessResult(resultList);
    }

    @RequestMapping("/getProvinceDisasterNumber")
    Result getProvinceStatistics(String province) {

        List<ProvinceStatisticsDTO> data = earthquakeStatisticsService.getProvinceStatistics(province);

        if (data.size() != 0) {
            return ResultGenerator.genSuccessResult(data);
        }

        return ResultGenerator.genFailResult("未能查找到该省份的数据");
    }

    @RequestMapping("/getSecondStatistics/{condition}")
    Result getSecondStatistics(@PathVariable("condition") String condition) throws ParseException {

        String[] conditions = condition.split("&");
        HashMap<String, String> conditionMap = new HashMap<>();

        conditionMap.put("minDate", " 1980-01-01 00:00:00 ");
        conditionMap.put("maxDate", " 2022-01-01 00:00:00 ");
        conditionMap.put("location", "%");

        for (String s : conditions) {
            conditionMap.put(s.split("=")[0], s.split("=")[1]);
        }

        SecondSearchCondition secondSearchCondition = new SecondSearchCondition();
        secondSearchCondition.setMinDate(conditionMap.get("minDate"));
        secondSearchCondition.setMaxDate(conditionMap.get("MaxDate"));
        secondSearchCondition.setLocation(conditionMap.get("location"));

        List<SecondStatisticsDTO> resultList = secondStatisticsService.getStatisticsByCondition(secondSearchCondition);

        if (resultList.size() != 0) {
            return ResultGenerator.genFailResult("未查找到符合条件的数据");
        }

        return ResultGenerator.genSuccessResult(resultList);
    }

    @RequestMapping("/getStructureStatistics/{condition}")
    Result getStructureStatistics(@PathVariable("condition") String condition) throws ParseException {

        String[] conditions = condition.split("&");
        HashMap<String, String> conditionMap = new HashMap<>();

        conditionMap.put("minDate", " 1980-01-01 00:00:00 ");
        conditionMap.put("maxDate", " 2022-01-01 00:00:00 ");
        conditionMap.put("location", "%");

        for (String s : conditions) {
            conditionMap.put(s.split("=")[0], s.split("=")[1]);
        }

        StructureSearchCondition structureSearchCondition = new StructureSearchCondition();
        structureSearchCondition.setMinDate(conditionMap.get("minDate"));
        structureSearchCondition.setMaxDate(conditionMap.get("MaxDate"));
        structureSearchCondition.setLocation(conditionMap.get("location"));

        List<StructureStatisticsDTO> resultList = structureStatisticsService.getStatisticsByCondition(structureSearchCondition);

        if (resultList.size() == 0) {
            return ResultGenerator.genFailResult("未查找到符合条件的数据");
        }

        return ResultGenerator.genSuccessResult(resultList);
    }

    @RequestMapping("/getPeopleStatistics/{condition}")
    Result getPeopleStatistics(@PathVariable("condition") String condition) throws ParseException {
        String[] conditions = condition.split("&");
        HashMap<String, String> conditionMap = new HashMap<>();

        conditionMap.put("minDate", "1980-01-01 00:00:00");
        conditionMap.put("maxDate", "2025-01-01 00:00:00");
        conditionMap.put("location", "%");

        for (String s : conditions) {
            conditionMap.put(s.split("=")[0], s.split("=")[1]+" 00:00:00");
        }

        PeopleSearchCondition peopleSearchCondition = new PeopleSearchCondition();

        peopleSearchCondition.setMinDate(conditionMap.get("minDate"));
        peopleSearchCondition.setMaxDate(conditionMap.get("maxDate"));
        peopleSearchCondition.setLocation(conditionMap.get("location"));

        List<PeopleStatisticsDTO> resultList = peopleStatisticsService.getStatisticsByCondition(peopleSearchCondition);

        if (resultList.size() == 0) {
            return ResultGenerator.genFailResult("未查找到符合条件的数据");
        }

        return ResultGenerator.genSuccessResult(resultList);
    }

    @RequestMapping("/getRecentDisasterLocation")
    Result getDisasterLocation() {

        List<LocationStatisticsDTO> resultList = earthquakeStatisticsService.getRecentDisasterLocation();

        if (resultList.size() != 0) {
            return ResultGenerator.genSuccessResult(resultList);
        }

        return ResultGenerator.genFailResult("查询近期地震数据失败");
    }
}
