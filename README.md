## Janjis
Saya Fachri Najm Noer Kartiman NIM 2106515 mengerjakan soal Latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.

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
Pada `Class Mahasiswa` digunakan untuk menyimpan data yang berhubungan dengan mahasiswa lengkap dengan set dan get

Pada `Class Crud` digunakan untuk proses membuat, melihat, mengganti, manghapus data.

`Class Crud`: membuat 2 buah array yang berbeda:

- array list(menyimpan list of class Mahasiswa)
- array listNim(menyimpan list dari nim)

`Kenapa?` itu dibuat agar library dari python digunakan dengan semestinya misalkan:

di contoh function ganti:
```python
def ganti(self, mhs):
    if(mhs.getNim() not in self.__listNim): # pengecekan agar tidak mengganti data yang belum ada
      print("data yang ingin anda ganti tidak ada")
      return
    tunjuk = self.__listNim.index(mhs.getNim())
    self.__listNim[tunjuk] = mhs.getNim()
    self.__list[tunjuk].setNim(mhs.getNim())
    self.__list[tunjuk].setNama(mhs.getNama())
    self.__list[tunjuk].setProdi(mhs.getProdi())
    self.__list[tunjuk].setFakultas(mhs.getFakultas())
```
dibagian pengecekan jika tidak dibuat `aray listNim` pengecekan tidak bisa dilakukan seperti itu / secara manual

## Alur Program
ketik `tambah [NIM] [Nama] [Prodi] [Fakultas]` untuk menambah data pada list

ketik `ganti [NIM] [Nama] [Prodi] [Fakultas]` untuk mengganti data pada list

ketik `hapus [NIM]` untuk menghapus data pada list

ketik `tampil` untuk menampilkan data pada list

ketik `exit` untuk keluar dari looping

## Dokumentasi
![](./img/1.png | width=100)

Menambah data pertama
![](./img/2.png | width=100)

Menambah data kedua
