
public class Main {

    // Variables de la cola
    static int capacidad = 5;
    static int[] cola = new int[capacidad];

    static int front = -1;
    static int rear = -1;

    // 1. ENCOLAR
    public static void encolar(int dato) {

        if (rear == capacidad - 1) {
            System.out.println("Error: Cola llena (Overflow)");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        cola[rear] = dato;

        System.out.println("Elemento encolado: " + dato);
    }

    // 2. DESENCOLAR
    public static void desencolar() {

        if (front == -1) {
            System.out.println("Error: Cola vacia (Underflow)");
            return;
        }

        int datoEliminado = cola[front];

        System.out.println("Elemento desencolado: " + datoEliminado);

        front++;

        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    // 3. VISUALIZAR EL FRENTE
    public static void verFrente() {

        if (front == -1) {
            System.out.println("La cola esta vacia");
            return;
        }

        System.out.println("Frente de la cola: " + cola[front]);
    }

    // 4. VERIFICAR SI LA COLA ESTA VACIA
    public static boolean colaVacia() {

        return front == -1;
    }

    // PROGRAMA PRINCIPAL
    public static void main(String[] args) {

        // Agregar elementos
        encolar(10);
        encolar(20);
        encolar(30);

        System.out.println("----------------");

        // Visualizar el frente
        verFrente();

        // Verificar si esta vacia
        if (colaVacia()) {
            System.out.println("La cola esta vacia");
        } else {
            System.out.println("La cola tiene elementos");
        }

        System.out.println("----------------");

        // Eliminar el primer elemento
        desencolar();

        // Visualizar el nuevo frente
        verFrente();

    }
}
