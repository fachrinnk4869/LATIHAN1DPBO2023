// include library standar yang digunakan
#include<bits/stdc++.h>
using namespace std;

// include file header class Mahasiswa dan Crud
#include"Mahasiswa.cpp"
#include"Crud.cpp"

// program utama
int main()
{
  // membuat objek Crud
  Crud arr;

  // menampilkan pesan permintaan perintah pada user
  cout << "masukkan perintah: " << endl;
  // deklarasi variabel untuk menyimpan input dari user
  string sign;
  // membaca input dari user dan menyimpan ke dalam variabel sign
  cin >> sign;

  // selama perintah yang dimasukkan oleh user bukan "exit"
  while(sign != "exit"){
    // jika perintah yang dimasukkan adalah "tampil", panggil method tampil pada objek Crud
    if(sign == "tampil"){
      arr.tampil();
    }
    // jika perintah yang dimasukkan adalah "tambah"
    else if(sign == "tambah"){
      // membuat objek Mahasiswa
      Mahasiswa mhs;
      // membaca input NIM, nama, prodi, dan fakultas dari user dan menyimpannya ke dalam objek Mahasiswa
      string val;
      cin >> val;
      mhs.setNim(val);
      cin >> val;
      mhs.setNama(val);
      cin >> val;
      mhs.setProdi(val);
      cin >> val;
      mhs.setFakultas(val);
      // memanggil method tambah pada objek Crud dengan parameter objek Mahasiswa
      arr.tambah(mhs);
    }
    // jika perintah yang dimasukkan adalah "ganti"
    else if(sign == "ganti"){
      // membuat objek Mahasiswa
      Mahasiswa mhs;
      // membaca input NIM, nama, prodi, dan fakultas dari user dan menyimpannya ke dalam objek Mahasiswa
      string val;
      cin >> val;
      mhs.setNim(val);
      cin >> val;
      mhs.setNama(val);
      cin >> val;
      mhs.setProdi(val);
      cin >> val;
      mhs.setFakultas(val);
      // memanggil method ganti pada objek Crud dengan parameter objek Mahasiswa
      arr.ganti(mhs);
    }
    // jika perintah yang dimasukkan adalah "hapus"
    else if(sign == "hapus"){
      // membuat objek Mahasiswa
      Mahasiswa mhs;
      // membaca input NIM dari user dan menyimpannya ke dalam objek Mahasiswa
      string val;
      cin >> val;
      mhs.setNim(val);
      // memanggil method hapus pada objek Crud dengan parameter objek Mahasiswa
      arr.hapus(mhs);
    }
    // menampilkan pesan permintaan perintah pada user kembali
    cout << "\nmasukkan perintah: " << endl;
    // membaca input dari user dan menyimpan ke dalam variabel sign
    cin >> sign;
  }
  // mengakhiri program
  return 0;
}