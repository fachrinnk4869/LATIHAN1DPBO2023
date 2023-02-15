/**

Kelas Crud untuk mengatur operasi CRUD pada daftar mahasiswa
*/
import java.util.ArrayList;
public class Crud {
  // properti untuk menyimpan list mahasiswa dan list NIM
  private ArrayList<Mahasiswa> list;
  private ArrayList<String> listNim;

  /**

  Konstruktor untuk membuat objek Crud dengan list mahasiswa dan list NIM yang kosong
  */
  Crud(){
    list = new ArrayList<Mahasiswa>();
    listNim = new ArrayList<String>();
  }
  /**

  Method untuk menambahkan data mahasiswa ke dalam list, tidak dapat menambahkan data dengan NIM yang sama
  @param mhs Objek mahasiswa yang ingin ditambahkan
  */
  public void tambah(Mahasiswa mhs){
    // jika NIM sudah ada pada list, maka data tidak dapat ditambahkan
    if(listNim.indexOf(mhs.getNim()) != -1){
      System.out.println("data yang ingin anda tambah tidak unique value");
      return;
    }
    this.list.add(mhs);
    this.listNim.add(mhs.getNim());
  }
  /**

  Method untuk menghapus data mahasiswa dari list
  @param mhs Objek mahasiswa yang ingin dihapus
  */
  public void hapus(Mahasiswa mhs){
    // mencari indeks data dengan NIM yang sama, jika tidak ditemukan maka data tidak dapat dihapus
    int tunjuk = listNim.indexOf(mhs.getNim());
    if(tunjuk == -1){
      System.out.println("data yang ingin anda hapus tidak ada");
      return;
    }
    // menghapus data pada list mahasiswa dan list NIM
    listNim.remove(tunjuk);
    list.remove(tunjuk);
  }
  /**

  Method untuk mengganti data mahasiswa dengan NIM yang sama pada list
  @param mhs Objek mahasiswa baru yang ingin dimasukkan ke dalam list dengan NIM yang sama dengan mahasiswa lama
  */
  public void ganti(Mahasiswa mhs){
    // mencari indeks data dengan NIM yang sama, jika tidak ditemukan maka data tidak dapat diganti
    int tunjuk = listNim.indexOf(mhs.getNim());
    if(tunjuk == -1){
      System.out.println("data yang ingin anda ganti tidak ada");
      return;
    }
    // mengganti data mahasiswa pada list
    listNim.set(tunjuk, mhs.getNim());
    list.get(tunjuk).setNim(mhs.getNim());
    list.get(tunjuk).setNama(mhs.getNama());
    list.get(tunjuk).setProdi(mhs.getProdi());
    list.get(tunjuk).setFakultas(mhs.getFakultas());
  }
  /**

  Method untuk menampilkan seluruh data mahasiswa pada list
  */
  public void tampil(){
    for(int i = 0;i < list.size();i++){
      System.out.println(
      (i + 1)
      + " " + list.get(i).getNim()
      + " " + list.get(i).getNama()
      + " " + list.get(i).getProdi()
      + " " + list.get(i).getFakultas()
      );
    }
  }
}