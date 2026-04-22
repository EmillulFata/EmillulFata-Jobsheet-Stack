public class StackTugasMahasiswa07 {
    Mahasiswa07[] stack;
    int top;
    int size;

    public StackTugasMahasiswa07(int size) {
        this.size = size;
        stack = new Mahasiswa07[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa07 m) {
        if (!isFull()) {
            top++;
            stack[top] = m;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa07 pop() {
        if (!isEmpty()) {
            Mahasiswa07 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa07 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Mahasiswa07 peekBottom() {
        if (!isEmpty()) {
            return stack[0]; // Tugas pertama selalu ada di indeks 0
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public int hitungTugas() {
        return top + 1;
    }

    // Praktikum 2
    public void konversiDesimalKeBiner(int kode) {
        StackKonversi07 stackKonv = new StackKonversi07();
        while (kode > 0) {
            int sisa = kode % 2;
            stackKonv.push(sisa);
            kode = kode / 2;
        }
        System.out.print("Nilai Biner: ");
        while (!stackKonv.isEmpty()) {
            System.out.print(stackKonv.pop());
        }
        System.out.println();
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) { // Print dari top ke bawah
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
        } else {
            System.out.println("Stack kosong!");
        }
    }
}