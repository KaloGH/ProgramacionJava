import java.util.Scanner;

/**
 * Spiderman
 */
public class Spiderman {
    static Scanner entrada = null;

    public static int nextInt() {

        try {
            return entrada.nextInt();
        } catch (java.util.NoSuchElementException e) {
            return 0;
        }
    }

    public static void main(String[] args) {

        entrada = new Scanner(System.in);

        int casos, spiderman, bomba_A, bomba_B;
        casos = nextInt(); // Seleccionamos el primer numero. Indicando cuantos casos le continuan.


            for (int i = 0; i < casos; i++) {
                spiderman = nextInt(); // La posicion de Spiderman.
                bomba_A = nextInt(); // La posicion de la bomba A.
                bomba_B = nextInt(); // La posicion de la bomba B.

                // Ingresamos las variables para saber que bomba esta mas cerca.
                int bombaCerca = 0;
                int bombaLejos = 0;

                // Realizamos operacion para saber que bomba esta mas cerca.
                if (Math.abs((spiderman - bomba_A)) <= Math.abs((spiderman - bomba_B))) {
                    bombaCerca = bomba_A;
                    bombaLejos = bomba_B;
                } else if (Math.abs((spiderman - bomba_B)) < Math.abs((spiderman - bomba_A))) {
                    bombaCerca = bomba_B;
                    bombaLejos = bomba_A;
                }
                System.out.println(Math.abs(spiderman - bombaCerca) + Math.abs(bombaCerca - bombaLejos));

            }

        entrada.close();

    }
}