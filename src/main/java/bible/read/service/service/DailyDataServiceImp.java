package bible.read.service.service;

import bible.read.service.integration.DailyDataIntegration;
import bible.read.service.model.DailyData;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DailyDataServiceImp implements DailyDataService {

  @Autowired
  private DailyDataIntegration dailyDataIntegration;
  @Autowired
  private ObjectMapper objectMapper;

  @Override
  public List<DailyData> getDailyData() {
    return dailyDataIntegration.getDailyData().entrySet().stream()
        .map(k -> {
          DailyData dailyData = objectMapper.convertValue(k.getValue(), DailyData.class);
          return new DailyData(k.getKey(), dailyData.getDate(), dailyData.getName(),
              dailyData.getPortion(), dailyData.getChapter(), dailyData.getFromVerses(),
              dailyData.getToVerses());
        }).collect(Collectors.toList());
  }

  @Override
  public List<DailyData> getDailyDataByDate(String date) {
    return dailyDataIntegration.getDailyDataByDate(date).entrySet().stream()
        .map(k -> {
          DailyData dailyData = objectMapper.convertValue(k.getValue(), DailyData.class);
          return new DailyData(k.getKey(), dailyData.getDate(), dailyData.getName(),
              dailyData.getPortion(), dailyData.getChapter(), dailyData.getFromVerses(),
              dailyData.getToVerses());
        }).collect(Collectors.toList());
  }

  @Override
  public void deleteDailyDataById(String uniqueId) {
    dailyDataIntegration.deleteDailyDataById(uniqueId);
  }

  @Override
  public void createDailyData(DailyData dailyData) {
    dailyDataIntegration.createDailyData(dailyData);
  }
}
