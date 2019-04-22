import service.*;
import entity.*;
import java.util.*;

public class Aplikasi{

  private static LaptopService service;
  private static Scanner scanner;

  public static void main(String[] args) {
    service = new LaptopService();
    scanner = new Scanner(System.in);
    int opsi = 5;

    do {
      showMenu();
      try {
        scanner = new Scanner(System.in);
        opsi = scanner.nextInt();
      } catch(Exception e) {
        System.err.println("Inputan bukan angka. coba lagi");

      }
      prosesOpsi(opsi);
    } while (opsi !=5);
  }

  private static void prosesOpsi(int pilihan){
    switch (pilihan) {
      case 1:
        showFormTambahData();
        break;
      case 2:
        showFormEditData();
        break;
      case 3:
        showDeleteData();
      case 4:
        service.showAllData();
        break;
      case 5:
        System.out.println("Terima Kasih Telah Menggunakan");
        System.out.println("Aplikasi Ini.");
    }
  }

  private static void showFormEditData(){
    scanner = new Scanner(System.in);
    String id, isbn, judul, pembuat, halaman, pencetak, penerbit, tahun;
    System.out.println("\n--= Form Ubah Data =--");
    System.out.print("ID      : ");
    id = scanner.nextLine();
    System.out.print("ISBN    : ");
    isbn = scanner.nextLine();
    System.out.print("Judul   : ");
    judul = scanner.nextLine();
    System.out.print("Pembuat : ");
    pembuat = scanner.nextLine();
    System.out.print("Halaman : ");
    halaman = scanner.nextLine();
    System.out.print("Pencetak: ");
    pencetak = scanner.nextLine();
    System.out.print("Penerbit: ");
    penerbit = scanner.nextLine();
    System.out.print("Tahun   : ");
    tahun = scanner.nextLine();
    service.updateData(new Laptop(id,isbn,judul,pembuat,halaman,pencetak,penerbit,tahun));
  }

  private static void showFormTambahData(){
    scanner = new Scanner(System.in);
    String id, isbn, judul, pembuat, halaman, pencetak, penerbit, tahun;
    System.out.println("\n--= Form Entry Data =--");
    System.out.print("ID      : ");
    id = scanner.nextLine();
    System.out.print("ISBN    : ");
    isbn = scanner.nextLine();
    System.out.print("Judul   : ");
    judul = scanner.nextLine();
    System.out.print("Pembuat : ");
    pembuat = scanner.nextLine();
    System.out.print("Halaman : ");
    halaman = scanner.nextLine();
    System.out.print("Pencetak: ");
    pencetak = scanner.nextLine();
    System.out.print("Penerbit: ");
    penerbit = scanner.nextLine();
    System.out.print("Tahun   : ");
    tahun = scanner.nextLine();
    service.addData(new Laptop(id,isbn,judul,pembuat,halaman,pencetak,penerbit,tahun));
  }

  private static void showDeleteData(){
    scanner = new Scanner(System.in);
    System.out.println("=---  FORM PENGHAPUSAN DATA  ---=");
    System.out.print("Masukkan ID\t:");
    String id = scanner.nextLine();
    service.deleteData(id);
  }

  private static void showMenu(){
    System.out.println("---= Aplikasi Stok Laptop =---");
    System.out.println("1. Tambah Data");
    System.out.println("2. Ubah Data");
    System.out.println("3. Hapus Data");
    System.out.println("4. Tampilkan Data");
    System.out.println("5. Keluar");
    System.out.println("----------------------------");
    System.out.print("Pilihan > ");

  }
}
