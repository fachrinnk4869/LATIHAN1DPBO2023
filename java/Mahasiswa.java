/**

Kelas Mahasiswa merepresentasikan entitas mahasiswa dengan atribut
nama, nim, prodi, dan fakultas.
*/
public class Mahasiswa {
  private String nama; // atribut nama mahasiswa
  private String nim; // atribut nim mahasiswa
  private String prodi; // atribut program studi mahasiswa
  private String fakultas; // atribut fakultas mahasiswa
  /**
  
  Konstruktor tanpa parameter. Atribut nama, nim, prodi, dan fakultas diinisialisasi dengan
  nilai string kosong ("").
  */
  Mahasiswa(){
    this.nama = "";
    this.nim = "";
    this.prodi = "";
    this.fakultas = "";
  }
  /**
  
  Konstruktor dengan parameter. Atribut nama, nim, prodi, dan fakultas diinisialisasi dengan
  nilai yang diberikan.
  @param nama nama mahasiswa
  @param nim nim mahasiswa
  @param prodi program studi mahasiswa
  @param fakultas fakultas mahasiswa

  */
  Mahasiswa(String nama, String nim, String prodi, String fakultas){
    this.nama = nama;
    this.nim = nim;
    this.prodi = prodi;
    this.fakultas = fakultas;
  }
  /**
  
  Getter untuk atribut nama.
  @return nilai atribut nama
  */
  public String getNama(){
    return this.nama;
  }
  /**
  
  Getter untuk atribut nim.
  @return nilai atribut nim
  */
  public String getNim(){
    return this.nim;
  }
  /**
  
  Getter untuk atribut prodi.
  @return nilai atribut prodi
  */
  public String getProdi(){
    return this.prodi;
  }
  /**
  
  Getter untuk atribut fakultas.
  @return nilai atribut fakultas
  */
  public String getFakultas(){
    return this.fakultas;
  }
  /**
  
  Setter untuk atribut nama.
  @param nama nilai baru untuk atribut nama
  */
  public void setNama(String nama){
    this.nama = nama;
  }
  /**
  
  Setter untuk atribut nim.
  @param nim nilai baru untuk atribut nim
  */
  public void setNim(String nim){
    this.nim = nim;
  }
  /**
  
  Setter untuk atribut prodi.
  @param prodi nilai baru untuk atribut prodi
  */
  public void setProdi(String prodi){
    this.prodi = prodi;
  }
  /**
  
  Setter untuk atribut fakultas.
  @param fakultas nilai baru untuk atribut fakultas
  */
  public void setFakultas(String fakultas){
    this.fakultas = fakultas;
  }
  }