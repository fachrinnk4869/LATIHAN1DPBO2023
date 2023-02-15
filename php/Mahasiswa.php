<?php
// membuat class Mahasiswa
class Mahasiswa {
    // deklarasi property dengan access modifier private agar hanya dapat diakses di dalam class
    private $nama;
    private $nim;
    private $prodi;
    private $fakultas;
    private $foto;

    // membuat method constructor dengan parameter yang dapat diisi atau tidak
    public function __construct($nim = "", $nama = "", $prodi = "", $fakultas = "", $foto = ""){
        // mengisi nilai property dengan parameter yang diberikan
        $this->nim = $nim;
        $this->nama = $nama;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
        $this->foto = $foto;
    }

    // membuat method getter untuk property nama
    public function getNama(){
        return $this->nama;
    }
    // membuat method getter untuk property nim
    public function getNim(){
        return $this->nim;
    }
    // membuat method getter untuk property prodi
    public function getProdi(){
        return $this->prodi;
    }
    // membuat method getter untuk property fakultas
    public function getFakultas(){
        return $this->fakultas;
    }
    // membuat method getter untuk property foto
    public function getFoto(){
        return $this->foto;
    }
    // membuat method setter untuk property nama
    public function setNama($nama){
        $this->nama = $nama;
    }
    // membuat method setter untuk property nim
    public function setNim($nim){
        $this->nim = $nim;
    }
    // membuat method setter untuk property prodi
    public function setProdi($prodi){
        $this->prodi = $prodi;
    }
    // membuat method setter untuk property fakultas
    public function setFakultas($fakultas){
        $this->fakultas = $fakultas;
    }
    // membuat method setter untuk property foto
    public function setFoto($foto){
        $this->foto = $foto;
    }
}
?>