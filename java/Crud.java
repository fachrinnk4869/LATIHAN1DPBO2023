import java.util.ArrayList;

// package java;

public class Crud {
  private ArrayList<Mahasiswa> list;
  private ArrayList<String> listNim;

  Crud(){
    list = new ArrayList<Mahasiswa>();
    listNim = new ArrayList<String>();
  }

  public void tambah(Mahasiswa mhs){
    if(listNim.indexOf(mhs.getNim()) != -1){
      System.out.println("data yang ingin anda tambah tidak unique value");
      return;
    }
    this.list.add(mhs);
    this.listNim.add(mhs.getNim());
  }

  public void hapus(Mahasiswa mhs){
    int tunjuk = listNim.indexOf(mhs.getNim());
    if(tunjuk == -1){
      System.out.println("data yang ingin anda hapus tidak ada");
      return;
    }
    listNim.remove(tunjuk);
    list.remove(tunjuk);
  }

  public void ganti(Mahasiswa mhs){
    int tunjuk = listNim.indexOf(mhs.getNim());
    if(tunjuk == -1){
      System.out.println("data yang ingin anda ganti tidak ada");
      return;
    }
    listNim.set(tunjuk, mhs.getNim());
    list.get(tunjuk).setNim(mhs.getNim());
    list.get(tunjuk).setNama(mhs.getNama());
    list.get(tunjuk).setProdi(mhs.getProdi());
    list.get(tunjuk).setFakultas(mhs.getFakultas());
  }

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
