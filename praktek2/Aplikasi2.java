public class Aplikasi2 {
  public static void main(String[] args) {
    Mahasiswa[] data = {
      new Mahasiswa("170901", "Mokhamad"),
      new Mahasiswa("170902", "Wijaya"),
      new Mahasiswa("170903", "Kusuma"),
      new Mahasiswa("170904", "Mada")
    };
    // for (int angka =0; angka < data.length ; angka++) {
    //   data[angka].cetak();
    // }
    int angka =0;
    for (; angka < data.length ; ) {
      data[angka].cetak();
      angka++;
    }

    System.out.println();
    int i =0;
    System.out.println(i++);
    System.out.println(i);

    System.out.println();
    for (Mahasiswa mhs : data) {
      mhs.cetak();
    }
  }
}
