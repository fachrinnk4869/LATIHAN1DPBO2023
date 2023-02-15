class Mahasiswa{
  private:
    string nama; // atribut nama dengan tipe data string
    string nim; // atribut nim dengan tipe data string
    string prodi; // atribut program studi dengan tipe data string
    string fakultas; // atribut fakultas dengan tipe data string
  public:
    Mahasiswa(){ // constructor default
      this->nama = "";
      this->nim = "";
      this->prodi = "";
      this->fakultas = "";
    }
    Mahasiswa(string nama, string nim, string prodi, string fakultas){ // constructor dengan parameter
      this->nama = nama;
      this->nim = nim;
      this->prodi = prodi;
      this->fakultas = fakultas;
    }

    string getNama(){ // method untuk mendapatkan nilai atribut nama
      return this->nama;
    }
    string getNim(){ // method untuk mendapatkan nilai atribut nim
      return this->nim;
    }
    string getProdi(){ // method untuk mendapatkan nilai atribut prodi
      return this->prodi;
    }
    string getFakultas(){ // method untuk mendapatkan nilai atribut fakultas
      return this->fakultas;
    }
    void setNama(string nama){ // method untuk mengubah nilai atribut nama
      this->nama = nama;
    }
    void setNim(string nim){ // method untuk mengubah nilai atribut nim
      this->nim = nim;
    }
    void setProdi(string prodi){ // method untuk mengubah nilai atribut prodi
      this->prodi = prodi;
    }
    void setFakultas(string fakultas){ // method untuk mengubah nilai atribut fakultas
      this->fakultas = fakultas;
    }
};