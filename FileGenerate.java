import java.io.File;
import java.time.LocalDate;

public class FileGenerate {
  public static void main(String[] args) {
    String currentDate = LocalDate.now().toString();
    String[] dateParts = currentDate.split("-");
    String yearMonthDay = dateParts[0] + "_" + dateParts[1] + "_" + dateParts[2];

    String srcDir = "src";
    String exampleDir = srcDir + "/example";
    String reportDir = srcDir + "/report";
    String pDir = srcDir + "/p" + yearMonthDay;

    new File(srcDir).mkdirs();
    new File(exampleDir).mkdirs();
    new File(reportDir).mkdirs();
    new File(pDir).mkdirs();

    System.out.println("src 및 하위 폴더가 생성되었습니다: " + srcDir);
  }
}