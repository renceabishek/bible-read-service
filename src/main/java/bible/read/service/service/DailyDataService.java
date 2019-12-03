package bible.read.service.service;

import bible.read.service.model.DailyData;
import java.time.LocalDate;
import java.util.List;

public interface DailyDataService {

  List<DailyData> getDailyData();

  List<DailyData> getDailyDataByDate(String date);

  void deleteDailyDataById(String uniqueId);

  void createDailyData(DailyData dailyData);

}
