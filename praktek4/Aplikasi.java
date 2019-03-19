import entitas.*;

// import entitas.Mahasiswa;
// import entitas.Dosen;

public class Aplikasi{

  public static void main(String[] args) {
    Mahasiswa[] dataMhs = {
      new Mahasiswa("17090091", "Toas"),
      new Mahasiswa("17090092", "Taos"),
      new Mahasiswa("17090093", "Tsoa"),
    };

    for (Mahasiswa mhs : dataMhs ) {
      mhs.cetak();
    }

    // for (Person mhs : dataMhs ) {
    //   mhs.cetak();
    // }

    System.out.println();
    Dosen dosen = new Dosen();
    dosen.setNama("Suzuka");
    dosen.setNid("1982001");
    dosen.cetak();
    // System.out.println(dosen.toString());
    System.out.println(dosen);
    System.out.println(dosen.hashCode());
  }
}
