package entity;

public class Buku{
  private String id;
  private String isbn;
  private String judul;
  private String pembuat;
  private String halaman;
  private String pencetak;
  private String penerbit;
  private String tahun;

  @Override
  public boolean equals(Object object){
    Buku temp = (Buku) object;
    return id.equals(temp.getId());
  }

	public Buku(String id, String isbn, String judul, String pembuat, String halaman, String pencetak, String penerbit, String tahun) {
		this.id = id;
		this.isbn = isbn;
		this.judul = judul;
		this.pembuat = pembuat;
		this.halaman = halaman;
		this.pencetak = pencetak;
		this.penerbit = penerbit;
		this.tahun = tahun;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getPembuat() {
		return pembuat;
	}

	public void setPembuat(String pembuat) {
		this.pembuat = pembuat;
	}

	public String getHalaman() {
		return halaman;
	}

	public void setHalaman(String halaman) {
		this.halaman = halaman;
	}

	public String getPencetak() {
		return pencetak;
	}

	public void setPencetak(String pencetak) {
		this.pencetak = pencetak;
	}

	public String getPenerbit() {
		return penerbit;
	}

	public void setPenerbit(String penerbit) {
		this.penerbit = penerbit;
	}

	public String getTahun() {
		return tahun;
	}

	public void setTahun(String tahun) {
		this.tahun = tahun;
	}
}
