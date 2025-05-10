public class FizzBuzzBoom {
    public static void main(String[] args) {
        // Definir el rango de números
        int inicio = 1;
        int fin = 200;

        // Recorrer e imprimir según las condiciones
        for (int i = inicio; i <= fin; i++) {
            boolean divisiblePor3 = i % 3 == 0;
            boolean divisiblePor5 = i % 5 == 0;
            boolean divisiblePor7 = i % 7 == 0;

            if (divisiblePor3 && divisiblePor5 && divisiblePor7) {
                System.out.println("FizzBuzzBoom");
            } else if (divisiblePor3 && divisiblePor5) {
                System.out.println("FizzBuzz");
            } else if (divisiblePor3 && divisiblePor7) {
                System.out.println("FizzBoom");
            } else if (divisiblePor5 && divisiblePor7) {
                System.out.println("BuzzBoom");
            } else if (divisiblePor3) {
                System.out.println("Fizz");
            } else if (divisiblePor5) {
                System.out.println("Buzz");
            } else if (divisiblePor7) {
                System.out.println("Boom");
            } else {
                System.out.println(i);
            }
        }
    }
}
