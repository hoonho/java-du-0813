import java.sql.Connection;

public class JDBC_Connection {
  public static void main(String[] args) {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    Connection con = null;

    try {
      Class.forName(driver);
      con = java.sql.DriverManager.getConnection(url, "scott", "tiger");
      System.out.println("Connection established successfully.");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (con != null) {
        try {
          con.close();
          System.out.println("Connection closed.");
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }
}