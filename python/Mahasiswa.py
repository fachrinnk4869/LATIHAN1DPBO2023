class Mahasiswa:
  __nama = ""
  __nim = ""
  __prodi = ""
  __fakultas = ""

  def init(self, nama = "", nim = "", prodi = "", fakultas = ""):
    # constructor class Mahasiswa, menerima inputan nama, nim, prodi, dan fakultas dengan nilai default ""
    self.__nama = nama
    self.__nim = nim
    self.__prodi = prodi
    self.__fakultas = fakultas

  def getNama(self):
    # method untuk mengembalikan nilai private variabel __nama
    return self.__nama

  def getNim(self):
    # method untuk mengembalikan nilai private variabel __nim
    return self.__nim

  def getProdi(self):
    # method untuk mengembalikan nilai private variabel __prodi
    return self.__prodi

  def getFakultas(self):
    # method untuk mengembalikan nilai private variabel __fakultas
    return self.__fakultas

  def setNama(self, nama):
    # method untuk mengubah nilai private variabel __nama
    self.__nama = nama

  def setNim(self, nim):
    # method untuk mengubah nilai private variabel __nim
    self.__nim = nim

  def setProdi(self, prodi):
    # method untuk mengubah nilai private variabel __prodi
    self.__prodi = prodi

  def setFakultas(self, fakultas):
    # method untuk mengubah nilai private variabel __fakultas
    self.__fakultas = fakultas