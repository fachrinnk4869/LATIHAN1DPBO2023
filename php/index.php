<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Latihan 1</title>
    <link rel="stylesheet" href="style.css">
</head>
<?php
// mengimpor kelas Mahasiswa.php dan Crud.php
require('Mahasiswa.php');
require('Crud.php');
// membuat objek Crud
$arr = new Crud();

// membuat objek Mahasiswa dan menambahkannya ke Crud
$mhs = new Mahasiswa("2106515", "Fachri", "ilkom", "FPMIPA", "Seminar-nasional.png");
$arr->tambah($mhs);

// menampilkan data Mahasiswa yang telah diinisiasi
echo "<p>inisiasi data</p>";
$arr->tampil();
echo "<hr>";

// membuat objek Mahasiswa baru dan menambahkannya ke Crud
$mhs = new Mahasiswa();
$mhs->setNim("2104213");
$mhs->setNama("Najm");
$mhs->setProdi("Fisika");
$mhs->setFakultas("FPTK");
$mhs->setFoto("background-mokaku-ilkom-21.png");
$arr->tambah($mhs);

// menampilkan data Mahasiswa setelah penambahan data
echo "<p>menambah data</p>";
$arr->tampil();
echo "<hr>";

// membuat objek Mahasiswa baru dan mengubah data Mahasiswa di Crud
$mhs = new Mahasiswa();
$mhs->setNim("2104213");
$mhs->setNama("Noer");
$mhs->setProdi("Biologi");
$mhs->setFakultas("FPBS");
$mhs->setFoto("Background-Biru-Nice.jpg");
$arr->ganti($mhs);

// menampilkan data Mahasiswa setelah perubahan data
echo "<p>mengganti data</p>";
$arr->tampil();
echo "<hr>";

// membuat objek Mahasiswa baru dan menghapus data Mahasiswa di Crud
$mhs = new Mahasiswa();
$mhs->setNim("2106515");
$arr->hapus($mhs);

// menampilkan data Mahasiswa setelah penghapusan data
echo "<p>menghapus data</p>";
$arr->tampil();
echo "<hr>";
?>