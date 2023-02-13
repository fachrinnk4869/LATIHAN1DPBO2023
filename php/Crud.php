<?php
class Crud {
  private $list = array();// array untuk menyimpan kelas Mahasiswa
  private $listNim = array();// array untuk menyimpan nim dari mahasiswa

  public function __construct(){
    //
  }

  public function tambah($mhs){
    // menambahkan data ke array
    if(in_array($mhs->getNim(), $this->listNim)){// kalau key id dari data udah ada
      echo "data yang ingin anda tambah tidak unique value";
      return;
    }
    array_push($this->list, $mhs);
    array_push($this->listNim, $mhs->getNim());
  }

  public function hapus($mhs){
    // menghapus data yang dipilih dari unique key
    if(!in_array($mhs->getNim(), $this->listNim)){
      echo "data yang ingin anda hapus tidak ada";
      return;
    }
    $tunjuk = array_search($mhs->getNim(), $this->listNim, true);
    array_splice($this->list, $tunjuk, 1);
    array_splice($this->listNim, $tunjuk, 1);
  }

  public function ganti($mhs){
    // mengganti data degna unique value yang dipilih
    if(!in_array($mhs->getNim(), $this->listNim)){
      echo "data yang ingin anda ganti tidak ada";
      return;
    }
    $tunjuk = array_search($mhs->getNim(), $this->listNim, true);
    $this->listNim[$tunjuk] = $mhs->getNim();
    $this->list[$tunjuk]->setNim($mhs->getNim());
    $this->list[$tunjuk]->setNama($mhs->getNama());
    $this->list[$tunjuk]->setProdi($mhs->getProdi());
    $this->list[$tunjuk]->setFakultas($mhs->getFakultas());
    $this->list[$tunjuk]->setFoto($mhs->getFoto());
  }

  public function tampil(){
    // menampilkan seluruh data pada array
    echo "<table>";
    echo "
      <tr>
        <th>No</th>
        <th>NIM</th>
        <th>Nama</th>
        <th>Prodi</th>
        <th>Fakultas</th>
        <th>Foto</th>
      </tr>
    ";
    for($i = 0;$i <count($this->list);$i++){
      echo
      "<tr> <td>".
      ($i + 1) 
      . "</td><td>" . $this->list[$i]->getNim()
      . "</td><td>" . $this->list[$i]->getNama()
      . "</td><td>" . $this->list[$i]->getProdi()
      . "</td><td>" . $this->list[$i]->getFakultas()
      . "</td><td>" . "<img src=assets/" . $this->list[$i]->getFoto() . " alt=" .$this->list[$i]->getFoto() . ">" 
      . "</td></tr>"
      ;
    }
    echo "</table>";
  }

}

?>