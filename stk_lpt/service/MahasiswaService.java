package service;
import java.util.*;
import entity.*;

public class MahasiswaService{

  private static List<Mahasiswa> data = new LinkedList<Mahasiswa>();

  public void addData(Mahasiswa mhs){
    data.add(mhs);
    System.out.println("Info: Data telah tersimpan");
  }

  public void updateData(Mahasiswa mhs){
    int index = data.indexOf(mhs);
    if (index >=0) {
      data.set(index, mhs);
      System.out.println("Data telah berubah");
    }else {
      System.out.println("Data tidak ditemukan");
    }
  }

  public void deleteData(String id){
    int index=-1;
    for (int i=0; i < data.size() ; i++) {
      if (data.get(i).getId().equals(id)) {
        index = i;
      }
    }
    if (index >=0) {
      data.remove(index);
      System.out.println("Data telah dihapus");
    }else {
      System.out.println("Data tidak ditemukan");
    }
  }

  public void showAllData(){
    int i = 1;
    System.out.println("\nData di List :");
    for (Mahasiswa mhs : data) {
      System.out.println("data ke-" + i++);
      System.out.println("  ID    :" + mhs.getId());
      System.out.println("  Merk  :" + mhs.getMerk());
      System.out.println("  Seri  :" + mhs.getSeri());
      System.out.println("  Harga :" + mhs.getHarga());
      System.out.println("  Jumlah:" + mhs.getJumlah());
    }
  }
}
