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
      System.out.println("data telah berubah");
    }
  }

  public void deleteData(String nim){
    int index = data.indexOf(mhs.getNim);
    if (index >=0) {
      data.remove(index);
    }
  }

  public void showAllData(){
    int i = 1;
    System.out.println("\nData di List :");
    for (Mahasiswa mhs : data) {
      System.out.println("data ke-" + i++);
      System.out.println("  NIM   :" + mhs.getNim());
      System.out.println("  Nama  :" + mhs.getNama());
      System.out.println("  Kelas :" + mhs.getKelas());
    }
  }
}
