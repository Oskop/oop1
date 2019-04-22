package service;
import java.util.*;
import entity.*;

public class BukuService{

  private static List<Buku> data = new LinkedList<Buku>();

  public void addData(Buku bku){
    data.add(bku);
    System.out.println("Info: Data telah tersimpan");
  }

  public void updateData(Buku bku){
    int index = data.indexOf(bku);
    if (index >=0) {
      data.set(index, bku);
      System.out.println("Data telah berubah");
    }else {
      System.out.println("Data tidak Ditemukan");
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
    for (Buku bku : data) {
      System.out.println("data ke-" + i++);
      System.out.println("  ID             :" + bku.getId());
      System.out.println("  ISBN           :" + bku.getIsbn());
      System.out.println("  Judul          :" + bku.getJudul());
      System.out.println("  Pembuat        :" + bku.getPembuat());
      System.out.println("  Jumlah Halaman :" + bku.getHalaman());
      System.out.println("  Pencetak       :" + bku.getPencetak());
      System.out.println("  Penerbit       :" + bku.getPenerbit());
      System.out.println("  Tahun Terbit   :" + bku.getTahun());
    }
  }
}
