import java.util.Scanner;

public class SuratDemo07 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan kapasitas tumpukan surat: ");
    int kapasitas = scan.nextInt();
    scan.nextLine();
    StackSurat07 stack = new StackSurat07(kapasitas);
    int pilih;

    do {
      System.out.println("\nMenu Layanan Surat Izin:");
      System.out.println("1. Terima Surat Izin (Push)");
      System.out.println("2. Proses Surat Izin (Pop)");
      System.out.println("3. Lihat Surat Izin Terakhir (Peek)");
      System.out.println("4. Tampilkan Semua Surat (Print)");
      System.out.println("5. Keluar");
      System.out.print("Pilih menu: ");
      pilih = scan.nextInt();
      scan.nextLine();

      switch (pilih) {
        case 1:
          System.out.print("ID Surat: ");
          String id = scan.nextLine();
          System.out.print("Nama Mahasiswa: ");
          String nama = scan.nextLine();
          System.out.print("Kelas: ");
          String kelas = scan.nextLine();
          System.out.print("Jenis Izin (S: Sakit, I: Izin): ");
          char jenis = scan.next().charAt(0);
          System.out.print("Durasi (hari): ");
          int durasi = scan.nextInt();
          scan.nextLine();

          Surat07 s = new Surat07(id, nama, kelas, jenis, durasi);
          stack.push(s);
          break;

        case 2:
          Surat07 diproses = stack.pop();
          if (diproses != null) {
            System.out.println("Memproses surat ID: " + diproses.idSurat + " atas nama " + diproses.namaMahasiswa);
          }
          break;

        case 3:
          Surat07 teratas = stack.peek();
          if (teratas != null) {
            System.out.println("Surat teratas saat ini: " + teratas.idSurat + " - " + teratas.namaMahasiswa);
          }
          break;

        case 4:
          stack.print();
          break;

        case 5:
          System.out.println("Program selesai.");
          break;

        default:
          System.out.println("Pilihan tidak valid.");
      }
    } while (pilih != 5);
  }
}