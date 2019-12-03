package bible.read.service.integration;

import bible.read.service.model.DailyData;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public interface DailyDataIntegration {

  HashMap<String,DailyData> getDailyData();

  HashMap<String,DailyData> getDailyDataByDate(String date);

  void deleteDailyDataById(String uniqueId);

  void createDailyData(DailyData dailyData);

}
