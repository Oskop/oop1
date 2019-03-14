public class Aplikasi {
  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa("17090092", "Oskop");
    Mahasiswa mhs2 = new Mahasiswa("17090093", "Kosfer");
    Mahasiswa mhs3 = new Mahasiswa("17090094", "Softa");
    // mhs1.nim = "19090092";
    // mhs1.nama = "Mokhamad";
    System.out.println(mhs1.nim+" : "+mhs1.nama);
    System.out.println(mhs2.nim+" : "+mhs2.nama);
    System.out.println(mhs3.nim+" : "+mhs3.nama);
  }
}
