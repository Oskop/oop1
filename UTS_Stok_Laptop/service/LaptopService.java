package service;
import java.util.*;
import entity.*;

public class LaptopService{

  private static List<Laptop> data = new LinkedList<Laptop>();

  public void addData(Laptop lpt){
    data.add(lpt);
    System.out.println("Info: Data telah tersimpan");
  }

  public void updateData(Laptop lpt){
    int index = data.indexOf(lpt);
    if (index >=0) {
      data.set(index, lpt);
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
    for (Laptop lpt : data) {
      System.out.println("data ke-" + i++);
      System.out.println("  ID    :" + lpt.getId());
      System.out.println("  Merk  :" + lpt.getMerk());
      System.out.println("  Seri  :" + lpt.getSeri());
      System.out.println("  Harga :" + lpt.getHarga());
      System.out.println("  Jumlah:" + lpt.getJumlah());
    }
  }
}
