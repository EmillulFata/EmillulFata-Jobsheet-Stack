import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        StackTugasMahasiswa07 stack = new StackTugasMahasiswa07(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Hitung Jumlah Tugas");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa07 mhs = new Mahasiswa07(nim, nama, kelas);
                    stack.push(mhs);
                    break;
                case 2:
                    Mahasiswa07 dinilai = stack.pop(); 
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        stack.konversiDesimalKeBiner(nilai);
                    }
                    break;
                case 3:
                    Mahasiswa07 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas teratas adalah milik: " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar seluruh tugas di stack:");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa07 bawah = stack.peekBottom();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh: " + bawah.nama);
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas dalam stack saat ini: " + stack.hitungTugas());
                    break;
                case 7:
                    System.out.println("Keluar program...");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilih != 7);
    }
}