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
    
  


