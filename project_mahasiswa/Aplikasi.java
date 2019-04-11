import service.*;
import entity.*;
import java.util.*;

public class Aplikasi{

  private static MahasiswaService service;
  private static Scanner scanner;

  public static void main(String[] args) {
    service = new MahasiswaService();
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
        break;
      case 4:
        service.showAllData();
        break;
      case 5:
        System.out.println("Terima Kasih Telah Menggunakan");
        System.out.println("Aplikasi Kami.");
    }
  }

  private static void showFormEditData(){
    scanner = new Scanner(System.in);
    String nim, nama, kelas;
    System.out.println("\n--= Form Ubah Data =--");
    System.out.print("NIM   : ");
    nim = scanner.nextLine();
    System.out.print("Nama  : ");
    nama = scanner.nextLine();
    System.out.print("Kelas : ");
    kelas = scanner.nextLine();
    service.updateData(new Mahasiswa(nim,nama,kelas));
  }

  private static void showFormTambahData(){
    scanner = new Scanner(System.in);
    String nim, nama, kelas;
    System.out.println("\n--= Form Entry Data =--");
    System.out.print("NIM   : ");
    nim = scanner.nextLine();
    System.out.print("Nama  : ");
    nama = scanner.nextLine();
    System.out.print("Kelas : ");
    kelas = scanner.nextLine();
    service.addData(new Mahasiswa(nim, nama, kelas));
  }

  private static void showDeleteData(){
    scanner = new Scanner(System.in);
    System.out.println("=---  FORM PENGHAPUSAN DATA  ---=");
    System.out.print("Masukkan NIM");
    String nim = scanner.nextLine();
    service.deleteData(nim);
  }

  private static void showMenu(){
    System.out.println("---= Aplikasi Mahasiswa =---");
    System.out.println("1. Tambah Data");
    System.out.println("2. Ubah Data");
    System.out.println("3. Hapus Data");
    System.out.println("4. Tampilkan Data");
    System.out.println("5. Keluar");
    System.out.println("----------------------------");
    System.out.print("Pilihan > ");

  }
}
