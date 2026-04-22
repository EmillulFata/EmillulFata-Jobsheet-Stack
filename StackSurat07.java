public class StackSurat07 {
  Surat07[] stack;
  int top;
  int size;

  public StackSurat07(int size) {
    this.size = size;
    stack = new Surat07[size];
    top = -1;
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == size - 1;
  }

  public void push(Surat07 s) {
    if (!isFull()) {
      top++;
      stack[top] = s;
      System.out.println("Surat berhasil diterima.");
    } else {
      System.out.println("Stack Penuh! Tidak dapat menerima surat lagi.");
    }
  }

  public Surat07 pop() {
    if (!isEmpty()) {
      Surat07 s = stack[top];
      top--;
      return s;
    } else {
      System.out.println("Stack Kosong! Tidak ada surat untuk diproses.");
      return null;
    }
  }

  public Surat07 peek() {
    if (!isEmpty()) {
      return stack[top];
    } else {
      System.out.println("Stack Kosong!");
      return null;
    }
  }

  public void print() {
    if (!isEmpty()) {
      System.out.println("Daftar Surat Izin (Teratas ke Terbawah):");
      for (int i = top; i >= 0; i--) {
        System.out.println("ID: " + stack[i].idSurat + " | Nama: " + stack[i].namaMahasiswa +
            " | Izin: " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin") +
            " | Durasi: " + stack[i].durasi + " hari");
      }
    } else {
      System.out.println("Tidak ada data surat.");
    }
  }
}