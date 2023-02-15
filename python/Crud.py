class Crud:
  __list = [] # deklarasi atribut private list untuk menyimpan objek Mahasiswa
  __listNim = [] # deklarasi atribut private list untuk menyimpan NIM dari objek Mahasiswa

  def tambah(self, mhs):
    # method untuk menambahkan objek Mahasiswa ke dalam list __list dan NIM ke dalam list __listNim
    if(mhs.getNim() in self.__listNim): # cek apakah NIM sudah terdaftar pada list __listNim
      print("data yang ingin anda tambah tidak unique value") # jika sudah, cetak pesan bahwa data tidak unik
      return
    self.__list.append(mhs) # tambahkan objek Mahasiswa ke dalam list __list
    self.__listNim.append(mhs.getNim()) # tambahkan NIM ke dalam list __listNim
    
  def hapus(self, mhs):
    # method untuk menghapus objek Mahasiswa dari list __list dan NIM dari list __listNim
    if(mhs.getNim() not in self.__listNim): # cek apakah NIM yang ingin dihapus sudah terdaftar pada list __listNim
      print("data yang ingin anda hapus tidak ada") # jika belum, cetak pesan bahwa data tidak ditemukan
      return
    tunjuk = self.__listNim.index(mhs.getNim()) # dapatkan index dari NIM yang ingin dihapus pada list __listNim
    self.__listNim.pop(tunjuk) # hapus NIM dari list __listNim
    self.__list.pop(tunjuk) # hapus objek Mahasiswa dari list __list

  def ganti(self, mhs):
    # method untuk mengubah data objek Mahasiswa pada list __list
    if(mhs.getNim() not in self.__listNim): # cek apakah NIM yang ingin diubah sudah terdaftar pada list __listNim
      print("data yang ingin anda ganti tidak ada") # jika belum, cetak pesan bahwa data tidak ditemukan
      return
    tunjuk = self.__listNim.index(mhs.getNim()) # dapatkan index dari NIM yang ingin diubah pada list __listNim
    self.__listNim[tunjuk] = mhs.getNim() # ubah NIM pada index yang ditunjuk pada list __listNim
    self.__list[tunjuk].setNim(mhs.getNim()) # ubah NIM pada objek Mahasiswa pada index yang ditunjuk pada list __list
    self.__list[tunjuk].setNama(mhs.getNama()) # ubah Nama pada objek Mahasiswa pada index yang ditunjuk pada list __list
    self.__list[tunjuk].setProdi(mhs.getProdi()) # ubah Prodi pada objek Mahasiswa pada index yang ditunjuk pada list __list
    self.__list[tunjuk].setFakultas(mhs.getFakultas()) # ubah Fakultas pada objek Mahasiswa pada index yang ditunjuk pada list __list

  def tampil(self):
    # method untuk menampilkan seluruh objek Mahasiswa pada list __list beserta atribut-atributnya
    # print("keren")
    for i in range(len(self.__list)): # loop sebanyak panjang dari list __list
      print(
      str(i + 1) # nomor ur
      , " " , self.__list[i].getNim()
      , " " , self.__list[i].getNama()
      , " " , self.__list[i].getProdi()
      , " " , self.__list[i].getFakultas()
      )
      # print()