package uns.edu;

public class Colas {

    static String[] cola = new String[5];
    static int frente = 0;
    static int finalCola = 0;
    static int N = cola.length;

    public static void main(String[] args) {

        insertar("Renato");
        insertar("Henry");
        insertar("Marco");
        mostrarCola();

        eliminar();

        mostrarCola();

    }

    static void insertar(String nombre) {
        String x = nombre;
        if (finalCola == N) {
            System.out.println("Cola llena");
        } else {
            finalCola = finalCola + 1;
            cola[finalCola - 1] = x;
        }

        if (frente == 0) {
            frente = 1;
        }
    }

    static void eliminar() {
        if (frente == 0) {
            System.out.println("Cola vacia");
        } else {
            String x = cola[frente - 1];
            System.out.println("Se elimino: " + x);

            if (frente == finalCola) {
                frente = 0;
                finalCola = 0;
            } else {
                frente = frente + 1;
            }
        }
    }

    static void mostrarCola() {
        if (frente == 0) {
            System.out.println("[ Cola vacía ]\n");
            return;
        }
        for (int i = frente; i <= finalCola; i++) {
            System.out.print("[" + cola[i - 1] + "] ");
        }
        System.out.println("\n");
    }
}