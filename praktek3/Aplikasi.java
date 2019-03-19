import entitas.Mahasiswa;

public class Aplikasi{
  public static void main(String[] args) {
    Mahasiswa[] dataMhs = {
      new Mahasiswa("1709001", "Toas"),
      new Mahasiswa("1709002", "Tipu"),
      new Mahasiswa("1709003", "Taos"),
    };

    for (Mahasiswa mhs : dataMhs ) {
      mhs.cetak();
    }
  }
}
