public class StackKonversi07 {
  int size;
  int[] tumpukan;
  int top;

  public StackKonversi07() {
    this.size = 10; // Ukuran default untuk menampung bit biner
    tumpukan = new int[size];
    top = -1;
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == size - 1;
  }

  public void push(int data) {
    if (!isFull()) {
      top++;
      tumpukan[top] = data;
    }
  }

  public int pop() {
    if (!isEmpty()) {
      int data = tumpukan[top];
      top--;
      return data;
    } else {
      return -1;
    }
  }
}