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
require('Mahasiswa.php');
require('Crud.php');

$arr = new Crud();
$mhs = new Mahasiswa("2106515", "Fachri", "ilkom", "FPMIPA", "Seminar-nasional.png");
// ===================>> menambah data
$arr->tambah($mhs);

echo "<p>inisiasi data</p>";
$arr->tampil();
echo "<hr>";
$mhs = new Mahasiswa();
$mhs->setNim("2104213");
$mhs->setNama("Najm");
$mhs->setProdi("Fisika");
$mhs->setFakultas("FPTK");
$mhs->setFoto("background-mokaku-ilkom-21.png");
$arr->tambah($mhs);

echo "<p>menambah data</p>";
$arr->tampil();
echo "<hr>";

$mhs = new Mahasiswa();
$mhs->setNim("2104213");
$mhs->setNama("Noer");
$mhs->setProdi("Biologi");
$mhs->setFakultas("FPBS");
$mhs->setFoto("Background-Biru-Nice.jpg");
$arr->ganti($mhs);
echo "<p>mengganti data</p>";
$arr->tampil();
echo "<hr>";

$mhs = new Mahasiswa();
$mhs->setNim("2106515");
$arr->hapus($mhs);
echo "<p>menghapus data</p>";
$arr->tampil();
echo "<hr>";