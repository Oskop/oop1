package entity;

public class Mahasiswa{
  private String id;
  private String merk;
  private String seri;
  private String harga;
  private String jumlah;

  public Mahasiswa(String id, String merk, String seri, String harga, String jumlah) {
    this.id = id;
		this.merk = merk;
		this.seri = seri;
		this.harga = harga;
		this.jumlah = jumlah;
  }

  @Override
  public boolean equals(Object object){
    Mahasiswa temp = (Mahasiswa) object;
    return id.equals(temp.getId());
  }

  public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getSeri() {
		return seri;
	}

	public void setSeri(String seri) {
		this.seri = seri;
	}

	public String getHarga() {
		return harga;
	}

	public void setHarga(String harga) {
		this.harga = harga;
	}

	public String getJumlah() {
		return jumlah;
	}

	public void setJumlah(String jumlah) {
		this.jumlah = jumlah;
	}
}
