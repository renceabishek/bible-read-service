package bible.read.service.model;

import com.google.firebase.database.Exclude;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DailyData {

  @Exclude
  private String uniqueId;
  private String date;
  private String name;
  private String portion;
  private String chapter;
  private int fromVerses;
  private int toVerses;

}
