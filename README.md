## Janji
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

`Class Mahasiswa` memiliki total lima atribut:
* **NIM** -> NIM mahasiswa, `string`
* **Nama** -> nama mahasiswa, `string`
* **Prodi** -> program studi mahasiswa, `string`
* **Fakultas** -> Fakultas mahasiswa, `string`
* **Foto** (khusus bahasa PHP) -> foto random, `string`

_lengkap dengan setter dan getternya_

`Class Crud` memiliki total dua atribut:
* **list** -> array untuk menyimpan class Mahasiswa, `array of Mahasiswa`
* **listNim** -> array untuk menyimpan NIM, `array of integer`

dan `Class Crud` memiliki total empat method:
* **tambah** -> menambah data Mahasiswa ke `list` dan NIM nya ke `listNim`
* **tampil** -> menampilkan data Mahasiswa dari `list`
* **hapus** -> menghapus data Mahasiswa ke `list` dan NIM nya ke `listNim`
* **ganti** -> mengganti data Mahasiswa ke `list` dan NIM nya ke `listNim`

Pada `Class Crud` terdapat dua list yaitu `list` dan `listNim`

`Kenapa?` itu dibuat agar library yang ada digunakan dengan semestinya seperti library find pada bahasa c++ dipakai untuk mengecek apakah disuatu data terdapat data NIM yang redundant atau tidak jadi bisa dicek di `listNIM`

## Alur Program
**semua program mempunyai alur yang sama, kecuali PHP karena inputan secara hardcore dari codenya**

Pengguna akan diminta untuk mengetikkan perintah pada command prompt

Pengguna dapat memilih untuk mengetikkan serangkaian perintah berikut pada command prompt

- ketik `tambah [NIM] [Nama] [Prodi] [Fakultas]` untuk menambah data pada list

- ketik `ganti [NIM] [Nama] [Prodi] [Fakultas]` untuk mengganti data pada list

- ketik `hapus [NIM]` untuk menghapus data pada list

- ketik `tampil` untuk menampilkan data pada list

- ketik `exit` untuk keluar dari looping

Seteleh memilih maka akan dimintai mengetikkan perintah berikutnya sampai mengetik perintah `exit`

## Dokumentasi
**Program PHP**

![PHP program](img/1.jpeg)

**Program C++**

![C++ program](img/c++.png)
