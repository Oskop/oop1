package entitas;

public class Person{
    private String nik;
    private String nama;

    public Person(String nik, String nama){
      this.nik = nik;
      this.nama = nama;
    }

    public void cetak(){
      System.out.println(nik+" : "+nama);
    }

    public String getNik(){
      return nik;
    }
    public void setNik(String nik){
      this.nik = nik;
    }
    public String getNama(){
      return nama;
    }
    public void setNama(String nama){
      this.nama = nama;
    }
}
