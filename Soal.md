1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?
2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!
3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?
4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!
5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!
6. Commit dan push kode program ke Github

Jawab:

1. bagian yang perlu diperbaiki agar keluaran sesuai dengan verifikasi hasil adalah:
    Urutan Parameter Konstruktor: Menyesuaikan urutan pada new Mahasiswa07(nim, nama, kelas) agar data tidak tertukar.
    Pembersihan Buffer: Menambahkan scan.nextLine() setelah scan.nextInt() agar input teks tidak terlewati.
    Kondisi Loop: Mengubah while (pilih != 5) agar menu 3 dan 4 tetap bisa diakses sebelum pengguna memilih keluar.
2. Banyaknya data yang dapat ditampung ditentukan saat instansiasi objek stack di class MahasiswaDemo07 adalah 5
    StackTugasMahasiswa07 stack = new StackTugasMahasiswa07(5);
3. Pengecekan ini diperlukan untuk mencegah Stack Overflow (kondisi di mana kita mencoba menambah data ke array yang sudah penuh).
    Dampaknya jika dihapus: Program akan mengalami runtime error berupa ArrayIndexOutOfBoundsException karena mencoba mengisi data pada indeks yang lebih besar dari kapasitas array yang tersedia.
4. modif done
5. modif done
6. done
