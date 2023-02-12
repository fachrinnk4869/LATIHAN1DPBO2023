public class Mahasiswa {
  private String nama;
  private String nim;
  private String prodi;
  private String fakultas;

  Mahasiswa(){
    this.nama = "";
    this.nim = "";
    this.prodi = "";
    this.fakultas = "";
  }
  Mahasiswa(String nama, String nim, String prodi, String fakultas){
    this.nama = nama;
    this.nim = nim;
    this.prodi = prodi;
    this.fakultas = fakultas;
  }

  public String getNama(){
    return this.nama;
  }
  public String getNim(){
    return this.nim;
  }
  public String getProdi(){
    return this.prodi;
  }
  public String getFakultas(){
    return this.fakultas;
  }
  public void setNama(String nama){
    this.nama = nama;
  }
  public void setNim(String nim){
    this.nim = nim;
  }
  public void setProdi(String prodi){
    this.prodi = prodi;
  }
  public void setFakultas(String fakultas){
    this.fakultas = fakultas;
  }

}
