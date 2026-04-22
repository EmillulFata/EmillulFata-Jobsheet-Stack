1. Jelaskan alur kerja dari method konversiDesimalKeBiner!
2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya

Jawab :

1. Alur Kerja Method konversiDesimalKeBiner
   Method ini bekerja dengan menerapkan prinsip LIFO (Last In First Out) untuk mengubah bilangan desimal menjadi biner. Berikut adalah tahapannya:
   - Iterasi Pembagian: Bilangan desimal (kode) dibagi dengan 2 secara berulang-ulang.
   - Penyimpanan Sisa: Hasil sisa pembagian (modulo 2) yang berupa angka 0 atau 1 dimasukkan (push) ke dalam stack. Karena stack
     bersifat menumpuk, sisa pembagian yang didapatkan di awal akan berada di posisi paling bawah, dan sisa pembagian terakhir akan berada di posisi paling atas (top).
   - Pengurangan Nilai: Variabel kode diperbarui dengan hasil pembagiannya (kode / 2) untuk diproses pada iterasi berikutnya.
   - Pengosongan Stack: Setelah proses pembagian selesai (saat kode menjadi 0), semua data di dalam stack dikeluarkan satu per satu
     menggunakan method pop(). Karena data terakhir yang masuk (sisa pembagian terakhir) adalah bit biner yang paling depan, maka hasil yang ditampilkan akan membentuk urutan biner yang benar dari kiri ke kanan.
2. Perubahan Kondisi menjadi while (kode != 0)
   Hasilnya:
   Hasil konversi akan tetap sama dan program berjalan normal tanpa ada perbedaan pada output akhir.
   Alasannya:
   - Secara logika, kondisi while (kode > 0) dan while (kode != 0) memiliki fungsi yang identik dalam kasus konversi bilangan desimal
     positif ke biner:
   - Proses pembagian akan terus dilakukan selama kode masih memiliki nilai (bukan nol).
   - Pada saat kode mencapai nilai 0, kedua kondisi tersebut akan bernilai false, sehingga perulangan berhenti.
   - Perbedaan baru akan terlihat jika angka yang dimasukkan adalah bilangan negatif. Namun, karena nilai tugas mahasiswa dalam
     praktikum ini umumnya bernilai positif (0-100), maka penggunaan != 0 tidak mengubah fungsionalitas program.
