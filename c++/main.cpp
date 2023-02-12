#include<bits/stdc++.h>
using namespace std;

#include"Mahasiswa.cpp"
#include"Crud.cpp"

int main()
{
  Crud arr;
  cout << "masukkan perintah: " << endl;
  string sign;
  cin >> sign;
  while(sign != "exit"){
    if(sign == "tampil"){
      arr.tampil();
    }else if(sign == "tambah"){
      Mahasiswa mhs;
      string val;
      cin >> val;
      mhs.setNim(val);
      cin >> val;
      mhs.setNama(val);
      cin >> val;
      mhs.setProdi(val);
      cin >> val;
      mhs.setFakultas(val);
      arr.tambah(mhs);
    }else if(sign == "ganti"){
      cout << "Masukkan data yang ingin diganti dengan nim yang sama" << endl;
      Mahasiswa mhs;
      string val;
      cin >> val;
      mhs.setNim(val);
      cin >> val;
      mhs.setNama(val);
      cin >> val;
      mhs.setProdi(val);
      cin >> val;
      mhs.setFakultas(val);
      arr.ganti(mhs);
    }else if(sign == "hapus"){
      cout << "Masukkan nim yang ingin daatanya dihapus" << endl;
      Mahasiswa mhs;
      string val;
      cin >> val;
      mhs.setNim(val);
      arr.hapus(mhs);
    }
    cout << "masukkan perintah: " << endl;
    cin >> sign;
  }
  return 0;
}