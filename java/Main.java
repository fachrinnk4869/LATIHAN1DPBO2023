import java.util.Scanner;
import java.util.ArrayList;
// import util.Mahasiswa;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Crud list = new Crud();
    System.out.println("masukkan perintah: ");
    String sign = sc.next();
    while(!sign.equals("exit")){
      if(sign.equals("tampil")){
        list.tampil();
      }
      else if(sign.equals("tambah")){
        Mahasiswa mhs = new Mahasiswa();
        String val = sc.next();
        mhs.setNim(val);
        val = sc.next();
        mhs.setNama(val);
        val = sc.next();
        mhs.setProdi(val);
        val = sc.next();
        mhs.setFakultas(val);
        list.tambah(mhs);
      }
      else if(sign.equals("ganti")){
        System.out.println("Masukkan data yang ingin diganti dengan nim yang sama");
        Mahasiswa mhs = new Mahasiswa();
        String val = sc.next();
        mhs.setNim(val);
        val = sc.next();
        mhs.setNama(val);
        val = sc.next();
        mhs.setProdi(val);
        val = sc.next();
        mhs.setFakultas(val);
        list.ganti(mhs);
      }else if(sign.equals("hapus")){
        System.out.println("Masukkan nim yang ingin daatanya dihapus");
        Mahasiswa mhs = new Mahasiswa();
        String val = sc.next();
        mhs.setNim(val);
        list.hapus(mhs);
      }
      System.out.println("masukkan perintah: ");
      sign = sc.next();
    }
  }
}
