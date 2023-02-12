# Tugas LATIHAN1DPBO2023
Buatlah program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang menampilkan informasi daftar mahasiswa (sekumpulan objek mahasiswa) dan memiliki fitur menambah, mengubah, dan menghapus data. Setiap mahasiswa memiliki data nama, NIM, program studi, fakultas, dan foto profil (khusus bahasa PHP).

File README berisi desain program, penjelasan alur, dan dokumentasi saat program dijalankan (screenshot/screen record, pilih salah satu bahasa sebagai contoh)
Submit link repository pada form berikut: [Form Pengumpulan](https://forms.gle/rvb1hKxbQVuYNbhKA) 

## Desain Program
Desain yang saya buat menggunakan 2 Class:
* Mahasiswa
* Crud
Class Mahasiswa berisi kode berikut:
```python
class Mahasiswa:
  __nama = ""
  __nim = ""
  __prodi = ""
  __fakultas = ""

  def __init__(self, nama = "", nim = "", prodi = "", fakultas = ""):
    self.__nama = nama
    self.__nim = nim
    self.__prodi = prodi
    self.__fakultas = fakultas
  

  def getNama(self):
    return self.__nama
  
  def getNim(self):
    return self.__nim
  
  def getProdi(self):
    return self.__prodi
  
  def getFakultas(self):
    return self.__fakultas
  
  def setNama(self, nama):
    self.__nama = nama
  
  def setNim(self, nim):
    self.__nim = nim
  
  def setProdi(self, prodi):
    self.__prodi = prodi
  
  def setFakultas(self, fakultas):
    self.__fakultas = fakultas
```
Class Crud berisi kode berikut:
```python
class Crud:
  __list = []
  __listNim = []

  def tambah(self, mhs):
    if(mhs.getNim() in self.__listNim):
      print("data yang ingin anda tambah tidak unique value")
      return
    
    self.__list.append(mhs)
    self.__listNim.append(mhs.getNim())
  

  def hapus(self, mhs):
    if(mhs.getNim() not in self.__listNim):
      print("data yang ingin anda hapus tidak ada")
      return
    tunjuk = self.__listNim.index(mhs.getNim())
    self.__listNim.pop(tunjuk)
    self.__list.pop(tunjuk)
  

  def ganti(self, mhs):
    if(mhs.getNim() not in self.__listNim):
      print("data yang ingin anda ganti tidak ada")
      return
    tunjuk = self.__listNim.index(mhs.getNim())
    self.__listNim[tunjuk] = mhs.getNim()
    self.__list[tunjuk].setNim(mhs.getNim())
    self.__list[tunjuk].setNama(mhs.getNama())
    self.__list[tunjuk].setProdi(mhs.getProdi())
    self.__list[tunjuk].setFakultas(mhs.getFakultas())
  

  def tampil(self):
    for i in range(len(self.__list)):
      print(
      i + 1
      , " " , self.__list[i].getNim()
      , " " , self.__list[i].getNama()
      , " " , self.__list[i].getProdi()
      , " " , self.__list[i].getFakultas()
      )
    
```
## Alur Program
## Dokumentasi