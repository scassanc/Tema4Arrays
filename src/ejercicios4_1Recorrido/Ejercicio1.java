package ejercicios4_1Recorrido;

public class Ejercicio1 {
  public void show() {
    createAndShowArray();
  }

  public void createAndShowArray() {
    int[] array = { 0, 1, 7, 3, 4, 6 };

    for (int i = 0; i < array.length; i++) {
      System.out.printf("Posición %d -> %s\n", i, array[i] % 2 == 0 ? "Par" : "Impar");
    }
  }

  public static void main(String[] args) {
    new Ejercicio1().show();
  }
}
