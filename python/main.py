# Import kelas Mahasiswa dan Crud
from Mahasiswa import Mahasiswa
from Crud import Crud

# Inisialisasi objek Crud
arr = Crud()

# Minta pengguna memasukkan perintah
print("masukkan perintah: ")
sign = str(input())

# Loop sampai pengguna memasukkan "exit"
while(sign != "exit"):

  # Jika perintah adalah "tampil", panggil metode tampil dari objek Crud
  if(sign == "tampil"):
    arr.tampil()

  # Jika perintah adalah "tambah", buat objek Mahasiswa baru dan tambahkan ke dalam array menggunakan metode tambah dari objek Crud
  elif(sign == "tambah"):
    mhs = Mahasiswa()
    
    val = str(input())
    mhs.setNim(val)
    val = str(input())
    mhs.setNama(val)
    val = str(input())
    mhs.setProdi(val)
    val = str(input())
    mhs.setFakultas(val)
    arr.tambah(mhs)

  # Jika perintah adalah "ganti", minta pengguna memasukkan data baru untuk objek Mahasiswa dengan NIM yang sama dan ubah data Mahasiswa tersebut dengan menggunakan metode ganti dari objek Crud
  elif(sign == "ganti"):
    # print("Masukkan data yang ingin diganti dengan nim yang sama")
    mhs = Mahasiswa()
    val = str(input())
    mhs.setNim(val)
    val = str(input())
    mhs.setNama(val)
    val = str(input())
    mhs.setProdi(val)
    val = str(input())
    mhs.setFakultas(val)
    arr.ganti(mhs)

  # Jika perintah adalah "hapus", minta pengguna memasukkan NIM dari Mahasiswa yang ingin dihapus dan hapus Mahasiswa tersebut menggunakan metode hapus dari objek Crud
  elif(sign == "hapus"):
    # print("Masukkan nim yang ingin datanya dihapus")
    mhs = Mahasiswa()
    val = str(input())
    mhs.setNim(val)
    arr.hapus(mhs)

  # Minta pengguna memasukkan perintah lagi
  print("\nmasukkan perintah: ")
  sign = str(input())