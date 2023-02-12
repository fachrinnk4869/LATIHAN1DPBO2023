class Crud{
  private:
    vector<Mahasiswa> list;
    vector<string> listNim;
  public:
    Crud(){

    }
    void tambah(Mahasiswa mhs){
      if(find(listNim.begin(), listNim.end(), mhs.getNim()) != listNim.end()){
        cout << "data yang ingin anda tambah tidak unique value" << endl;
        return;
      }
      this->list.push_back(mhs);
      this->listNim.push_back(mhs.getNim());
    }

    void hapus(Mahasiswa mhs){
      auto tunjuk = find(listNim.begin(), listNim.end(), mhs.getNim());
      if(tunjuk == listNim.end()){
        cout << "data yang ingin anda hapus tidak ada" << endl;
        return;
      }
      // int it = int(tunjuk);
      listNim.erase(tunjuk);
      // remove(list.begin(), list.end(), mhs.getNim());
      list.erase(list.begin() + distance(listNim.begin(), tunjuk));
    }

    void ganti(Mahasiswa mhs){
      auto tunjuk = find(listNim.begin(), listNim.end(), mhs.getNim());
      if(tunjuk == listNim.end()){
        cout << "data yang ingin anda ganti tidak ada" << endl;
        return;
      }
      int it = distance(listNim.begin(), tunjuk);
      listNim[it] = mhs.getNim();
      list[it].setNim(mhs.getNim());
      list[it].setNama(mhs.getNama());
      list[it].setProdi(mhs.getProdi());
      list[it].setFakultas(mhs.getFakultas());
    }

    void tampil(){
      for(int i = 0;i < list.size();i++){
        cout << 
        (i + 1) 
        << " " << list[i].getNim()
        << " " << list[i].getNama()
        << " " << list[i].getProdi()
        << " " << list[i].getFakultas()
        << endl;
      }
    }
};