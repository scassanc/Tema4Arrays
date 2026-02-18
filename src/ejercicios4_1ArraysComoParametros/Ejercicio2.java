package ejercicios4_1ArraysComoParametros;

import java.util.Arrays;

public class Ejercicio2 {
  public void show() {
    int[] array = { 1, 2, 3, 4, 5 };
    System.out.printf("Sin modificar: %s\n", Arrays.toString(array));
    modifyArray(array);
    System.out.printf("Modificando: %s\n", Arrays.toString(array));
  }

  public void modifyArray(int[] array) {
    array[0] = 6;
  }

  public static void main(String[] args) {
    new Ejercicio2().show();
  }
}
