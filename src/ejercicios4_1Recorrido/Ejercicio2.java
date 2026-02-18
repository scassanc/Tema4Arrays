package ejercicios4_1Recorrido;

import java.util.Scanner;

public class Ejercicio2 {
  @SuppressWarnings("resource")
  public void show() {
    Scanner sc = new Scanner(System.in);
    boolean showEven;

    int[] array = { 2, 20, 20, 1, 7, 10, 11, 9 };

    System.out.printf("Deseas mostrar los pares? (true/false): ");
    showEven = sc.nextBoolean();

    for (int i = showEven ? 0 : 1; i < array.length; i += 2) {
      System.out.printf("Posición %d -> %d\n", i, array[i]);
    }
  }

  public static void main(String[] args) {
    new Ejercicio2().show();
  }
}
