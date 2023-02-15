class Crud{
  private:
    vector<Mahasiswa> list;     // atribut list dengan tipe data vector of class Mahasiswa
    vector<string> listNim;     // atribut list NIM dengan tipe data vector of string
  public:
    // Konstruktor
    Crud(){}

    // Method untuk menambahkan objek Mahasiswa ke dalam list
    void tambah(Mahasiswa mhs){
      // Cek apakah NIM mahasiswa yang ingin ditambahkan sudah ada di dalam list
      if(find(listNim.begin(), listNim.end(), mhs.getNim()) != listNim.end()){
        cout << "Data yang ingin Anda tambah tidak unique value" << endl;
        return;
      }
      // Jika NIM belum ada di dalam list, tambahkan Mahasiswa ke dalam list dan tambahkan NIM ke dalam listNim
      this->list.push_back(mhs);
      this->listNim.push_back(mhs.getNim());
    }

    // Method untuk menghapus objek Mahasiswa dari list berdasarkan NIM
    void hapus(Mahasiswa mhs){
      // Cari iterator untuk NIM mahasiswa yang ingin dihapus
      auto tunjuk = find(listNim.begin(), listNim.end(), mhs.getNim());
      // Jika NIM tidak ditemukan, keluarkan pesan error
      if(tunjuk == listNim.end()){
        cout << "Data yang ingin Anda hapus tidak ada" << endl;
        return;
      }
      // Jika NIM ditemukan, hapus NIM dan Mahasiswa yang bersesuaian dengan NIM tersebut dari list
      listNim.erase(tunjuk);
      list.erase(list.begin() + distance(listNim.begin(), tunjuk));
    }

    // Method untuk mengganti objek Mahasiswa dalam list berdasarkan NIM
    void ganti(Mahasiswa mhs){
      // Cari iterator untuk NIM mahasiswa yang ingin diganti
      auto tunjuk = find(listNim.begin(), listNim.end(), mhs.getNim());
      // Jika NIM tidak ditemukan, keluarkan pesan error
      if(tunjuk == listNim.end()){
        cout << "Data yang ingin Anda ganti tidak ada" << endl;
        return;
      }
      // Jika NIM ditemukan, ganti NIM dan atribut lainnya pada objek Mahasiswa yang bersesuaian dengan NIM tersebut dalam list
      int it = distance(listNim.begin(), tunjuk);
      listNim[it] = mhs.getNim();
      list[it].setNim(mhs.getNim());
      list[it].setNama(mhs.getNama());
      list[it].setProdi(mhs.getProdi());
      list[it].setFakultas(mhs.getFakultas());
    }

    // Method untuk menampilkan semua objek Mahasiswa dalam list
    void tampil(){
      for(int i = 0; i < list.size(); i++){
        cout << (i + 1) 
        << " " << list[i].getNim()
        << " " << list[i].getNama()
        << " " << list[i].getProdi()
        << " " << list[i].getFakultas()
        << endl;
      }
    }
};