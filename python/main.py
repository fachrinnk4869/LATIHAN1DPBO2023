from Mahasiswa import Mahasiswa
from Crud import Crud

arr = Crud()
print("masukkan perintah: ")
sign = str(input())
while(sign != "exit"):
  if(sign == "tampil"):
    arr.tampil()

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

  elif(sign == "ganti"):
    print("Masukkan data yang ingin diganti dengan nim yang sama")
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
  elif(sign == "hapus"):
    print("Masukkan nim yang ingin daatanya dihapus")
    mhs = Mahasiswa()
    val = str(input())
    mhs.setNim(val)
    arr.hapus(mhs)

  print("masukkan perintah: ")
  sign = str(input())