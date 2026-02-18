package ejercicios4_1ArraysComoParametros;

public class Ejercicio1 {
  public void show() {
    System.out.printf("multiply(1, 2, 3, 4): %d\n", multiply(1, 2, 3, 4));
  }

  public int multiply(int... numbers) {
    int result = 1;

    for (int i = 0; i < numbers.length; i++) {
      result *= numbers[i];
    }

    return result;
  }

  public static void main(String[] args) {
    new Ejercicio1().show();
  }
}
