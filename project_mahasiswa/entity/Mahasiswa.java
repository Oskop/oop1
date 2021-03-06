package entity;

public class Mahasiswa{
  private String nim;
  private String nama;
  private String kelas;

  public Mahasiswa(String nim, String nama, String kelas) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
  }

  @Override
  public boolean equals(Object object){
    Mahasiswa temp = (Mahasiswa) object;
    return nim.equals(temp.getNim());
  }

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getKelas() {
		return kelas;
	}

	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
}
