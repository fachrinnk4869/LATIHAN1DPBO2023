import java.util.Scanner;

// Kelas utama program
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Crud list = new Crud(); // Membuat objek Crud
    System.out.println("Masukkan perintah: ");
    String sign = sc.next();
    // Looping untuk menerima perintah dari pengguna
    while(!sign.equals("exit")){
      if(sign.equals("tampil")){
        list.tampil(); // Memanggil metode tampil dari objek Crud
      }
      else if(sign.equals("tambah")){
        Mahasiswa mhs = new Mahasiswa(); // Membuat objek Mahasiswa
        String val = sc.next();
        mhs.setNim(val); // Mengisi atribut NIM dari objek Mahasiswa
        val = sc.next();
        mhs.setNama(val); // Mengisi atribut nama dari objek Mahasiswa
        val = sc.next();
        mhs.setProdi(val); // Mengisi atribut program studi dari objek Mahasiswa
        val = sc.next();
        mhs.setFakultas(val); // Mengisi atribut fakultas dari objek Mahasiswa
        list.tambah(mhs); // Menambahkan objek Mahasiswa ke dalam list pada objek Crud
      }
      else if(sign.equals("ganti")){
        System.out.println("Masukkan data yang ingin diganti dengan nim yang sama");
        Mahasiswa mhs = new Mahasiswa(); // Membuat objek Mahasiswa
        String val = sc.next();
        mhs.setNim(val); // Mengisi atribut NIM dari objek Mahasiswa
        val = sc.next();
        mhs.setNama(val); // Mengisi atribut nama dari objek Mahasiswa
        val = sc.next();
        mhs.setProdi(val); // Mengisi atribut program studi dari objek Mahasiswa
        val = sc.next();
        mhs.setFakultas(val); // Mengisi atribut fakultas dari objek Mahasiswa
        list.ganti(mhs); // Mengganti data mahasiswa dengan NIM yang sama pada objek Crud
      }else if(sign.equals("hapus")){
        System.out.println("Masukkan nim yang ingin data mahasiswa dihapus");
        Mahasiswa mhs = new Mahasiswa(); // Membuat objek Mahasiswa
        String val = sc.next();
        mhs.setNim(val); // Mengisi atribut NIM dari objek Mahasiswa
        list.hapus(mhs); // Menghapus data mahasiswa dengan NIM yang sama pada objek Crud
      }
      System.out.println("Masukkan perintah: ");
      sign = sc.next(); // Menerima input perintah dari pengguna
    }
    sc.close();
  }
}