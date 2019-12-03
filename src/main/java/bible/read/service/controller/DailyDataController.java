package bible.read.service.controller;

import bible.read.service.model.DailyData;
import bible.read.service.service.DailyDataService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bible")
public class DailyDataController {

  @Autowired
  private DailyDataService dailyDataService;

  @GetMapping(value = "/all")
  public List<DailyData> getDailyData() {
    return dailyDataService.getDailyData();
  }

  @GetMapping(value = "/date/{date}")
  public List<DailyData> getDailyDataByDate(@PathVariable String date) {
    return dailyDataService.getDailyDataByDate(date);
  }

  @DeleteMapping(value = "/date/{uniqueId}")
  public void deleteDailyDataById(@PathVariable String uniqueId) {
     dailyDataService.deleteDailyDataById(uniqueId);
  }

  @PostMapping(value = "/all", consumes = "application/json")
  public void createDailyData(@RequestBody DailyData dailyData) {
     dailyDataService.createDailyData(dailyData);
  }

}
