public class Aplikasi {
  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa("17090092", "Oskop");
    Mahasiswa mhs2 = new Mahasiswa("17090093", "Kosfer");
    Mahasiswa mhs3 = new Mahasiswa("17090094", "Softa");
    Mahasiswa mhs4 = null;
    if (args.length == 2) {
      mhs4 = new Mahasiswa(args[0], args[1]);
    } else {
      System.out.println("Gunakan : java Aplikasi {nim} {nama}");
    }

    // Mahasiswa mhs3 = new Mahasiswa(args[0], args[1]); // input saat di terminal
    // mhs1.nim = "19090092";
    // mhs1.nama = "Mokhamad";
    // System.out.println(mhs1.getNim()+" : "+mhs1.getNama());
    // System.out.println(mhs2.getNim()+" : "+mhs2.getNama());
    // System.out.println(mhs3.getNim()+" : "+mhs3.getNama());
    // System.out.println(mhs4.getNim()+" : "+mhs4.getNama());
    mhs1.cetak();
    mhs2.cetak();
    mhs3.cetak();
    mhs4.cetak();
  }
}
