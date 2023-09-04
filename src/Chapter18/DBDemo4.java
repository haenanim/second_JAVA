package Chapter18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDemo4 {
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();
//    Statement statement = conn.createStatement();
//    String sql = "insert into person (name, phone, email) values(" + "'김연아', '012', 'kya@naver.com');";


    String sql1 = "delete from person where phone = ?;";
    PreparedStatement preparedStatement1 = conn.prepareStatement(sql1);
    preparedStatement1.setString(1, "014");

    System.out.println(preparedStatement1.execute());


    conn.close();

  }

  static Connection makeConnection() {
    String url = "jdbc:mysql://127.0.0.1/sample?serverTimezone=Asia/Seoul";

    Connection conn = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결중....");
      conn = DriverManager.getConnection(url, "root", "1111");
      System.out.println("데이터베이스 연결 성공!!!");
//      conn.close();
    } catch (SQLException e) {
      //throw new RuntimeException(e);
      System.out.println("JDBC 드라이버를 찾지 못함");
    } catch (ClassNotFoundException e) {
//      throw new RuntimeException(e);
      System.out.println("데이터베이스 연결 실패");
    }
//    System.out.println("프로그램 종료");
    return conn;
  }
}