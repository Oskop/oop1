import util.*;
import java.sql.*;

public class Aplikasi {

  private static Koneksi koneksi;

  public static void main(String[] args) throws SQLException,
  SQLTimeoutException {
      koneksi = new Koneksi();

      String sql = "select * from profile";
      ResultSet hasil = koneksi.eksekusiSelect(sql);
      while (hasil.next()) {
        System.out.println("id : " + hasil.getInt(1));
        System.out.println("nama : " + hasil.getString(2));
        System.out.println("Alamat : " + hasil.getString(3));
        System.out.println("Tanggal Lahir : " + hasil.getDate(4));
      }
      koneksi.closeConnection();
  }
}
