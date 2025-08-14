package src.report;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputResult {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
    FileOutputStream fos = null;
    OutputStreamWriter osw = null;
    PrintWriter pw = null;

    try {
      fos = new FileOutputStream("src/report/result.txt");
      // UTF-8 BOM 추가
      fos.write(0xEF);
      fos.write(0xBB);
      fos.write(0xBF);

      osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
      pw = new PrintWriter(osw, true);

      System.out.println("텍스트 입력 (종료하려면 'exit' 입력):");

      String line;
      while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
        pw.println(line);
      }
      System.out.println("텍스트가 src/report/result.txt 파일에 저장되었습니다.");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (pw != null) pw.close();
      try { br.close(); } catch (Exception e) { e.printStackTrace(); }
    }
  }
}
