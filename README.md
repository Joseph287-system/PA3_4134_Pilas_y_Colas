# PA3_4134_Pilas_y_Colas
## Actividad 1
Evaluacion aplicada sobre estructuras de datos: pilas LIFO y coloca FIFO
## 1. Objetivo

Desarrollar y comprender el funcionamiento de las estructuras de datos PILA (LIFO) y COLA (FIFO), mediante algoritmos y ejemplos aplicados a la gestión de servicios académicos.

## 2. Integrantes

| Integrante | Participación |
|---|---|
| Integrante 1 | Joseph Antonio Fong Millones/Actividad1 |
| Integrante 2 | Por completar |
| Integrante 3 | Por completar |
| Integrante 4 | Javier Alonso Gallegos Rodríguez | Actividad 4 – Comparación y argumentación |

## 3. Estructura del repositorio

```text
PA3_4134_Pilas_y_Colas/
│
├── Actividad1_Pila_Lifo/
│   ├── Push.txt
│   ├── Pop.txt
│   ├── Peek.txt
│   └── Isempty.txt
│
└── README.md
```

## 4. Descripción de los archivos

- **Push.txt:** algoritmo para agregar elementos a la pila.
- **Pop.txt:** algoritmo para retirar el elemento superior.
- **Peek.txt:** algoritmo para consultar el elemento superior.
- **Isempty.txt:** algoritmo para verificar si la pila está vacía.

## 5. Instrucciones de revisión

A continuación se presenta el desarrollo algorítmico en pseudocódigo para cada una de las operaciones fundamentales de la Pila (LIFO):

## 5.1. Push (Apilar)

Descripción: Algoritmo para agregar un elemento en la parte superior (tope) de la pila.

```Algoritmo Push(pila, elemento, tope, capacidad)
    Si tope >= capacidad - 1 Entonces
        Imprimir "Desbordamiento: La pila está llena"
    Sino
        tope = tope + 1
        pila[tope] = elemento
        Imprimir "Elemento apilado exitosamente"
    Fin Si
Fin Algoritmo


## 5.2. Pop (Desapilar)

Descripción: Algoritmo para retirar y retornar el elemento superior de la pila.

```Algoritmo Pop(pila, tope)
    Si tope < 0 Entonces
        Imprimir "Subdesbordamiento: La pila está vacía"
        Retornar Nulo
    Sino
        elementoEliminado = pila[tope]
        tope = tope - 1
        Retornar elementoEliminado
    Fin Si
Fin Algoritmo


## 5.3. Peek (Consultar Tope)

Descripción: Algoritmo para consultar el elemento superior sin modificar la pila.

```Algoritmo Peek(pila, tope)
    Si tope < 0 Entonces
        Imprimir "La pila está vacía"
        Retornar Nulo
    Sino
        Retornar pila[tope]
    Fin Si
Fin Algoritmo


## 5.4. IsEmpty (Verificar Vacía)

Descripción: Algoritmo para verificar si la pila carece de elementos.

```Algoritmo IsEmpty(tope)
    Si tope < 0 Entonces
        Retornar Verdadero
    Sino
        Retornar Falso
    Fin Si
Fin Algoritmo


## Actividad 2 


Una cola es una estructura de datos lineal que sigue el principio FIFO (First In, First Out), que significa «primero en entrar, primero en salir».
Esto quiere decir que el primer elemento que ingresa a la cola será el primero en salir. Los elementos se insertan por el final de la cola (Rear) y se eliminan por el frente (Front), respetando siempre el orden de llegada.

Características 

•	Principio FIFO: el primer elemento que ingresa es el primero en salir.
•	Acceso restringido: la inserción se realiza por el final (Rear) y la eliminación por el frente (Front).
•	Orden secuencial: los elementos se procesan respetando su orden de llegada.
•	Implementación: puede desarrollarse mediante vectores (arreglos) o listas enlazadas.

Grafico 

En una unidad de servicios académicos, los estudiantes realizan diferentes solicitudes, como constancias de estudios, certificados académicos y consultas de matrícula.
Para organizar, se implementará una cola FIFO. Cada solicitud se almacenará en el orden en que sea registrada y será atendida desde el frente de la cola.
Se registran las siguientes solicitudes:
1.	Solicitud 101: Constancia de estudios.
2.	Solicitud 102: Certificado académico.
3.	Solicitud 103: Consulta de matrícula.

<img width="708" height="214" alt="image" src="https://github.com/user-attachments/assets/7d8925f4-e84a-46f0-9619-c5311376c449" />

## Diseñen algoritmos para encolar, desencolar, visualizar el frente de la cola y verificar si la cola está vacia.

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

 ## Resultado

<img width="587" height="237" alt="image" src="https://github.com/user-attachments/assets/f1ca64a6-aec9-4534-92ff-790e32870b74" />


## Aplicación concreta de la cola FIFO
Una aplicación concreta de la estructura de datos FIFO es la atención de solicitudes en una unidad de servicios académicos de una institución educativa.
Cuando los estudiantes realizan solicitudes, como constancias de estudios, certificados académicos o consultas sobre matrícula, estas se registran en una cola para ser atendidas según su orden de llegada.
Por ejemplo:
1.	El estudiante realiza la solicitud 101: Constancia de estudios.
2.	El estudiante realiza la solicitud 102: Certificado académico.
3.	El estudiante realiza la solicitud 103: Consulta de matrícula.

La cola FIFO es la estructura más adecuada, porque permite organizar las solicitudes de manera ordenada y garantiza que el primer estudiante que registra su solicitud sea el primero en recibir atención. Además, evita que las solicitudes más antiguas sean desplazadas por las nuevas y facilita el control del proceso de atención.

<img width="886" height="178" alt="image" src="https://github.com/user-attachments/assets/c0feb64b-72f1-4970-93fd-af8dcc3ae39d" />

 Actividad 3

| Situación                                                          | Estructura | Justificación técnica                                                                                                                                                                                                              |
| ------------------------------------------------------------------ | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Registro de acciones recientes para revertir cambios**           | **Pila**   | Utiliza el principio **LIFO** (*último en entrar, primero en salir*). Para deshacer cambios, se revierte primero la acción más reciente. Cada acción se almacena con una operación **push** y se retira con **pop** al deshacerla. |
| **Atención de solicitudes en orden de llegada**                    | **Cola**   | Aplica el principio **FIFO** (*primero en entrar, primero en salir*). Las solicitudes se agregan al final mediante **encolar** y se retiran del frente mediante **desencolar**, respetando su orden de llegada.                    |
| **Procesamiento donde el último ingresado debe atenderse primero** | **Pila**   | Corresponde a **LIFO**, porque el elemento más reciente queda en la cima y es el primero que se extrae para procesarlo.                                                                                                            |
| **Flujo de espera de trámites pendientes**                         | **Cola**   | Si los trámites se atienden por orden de llegada, corresponde **FIFO**. Los nuevos trámites ingresan al final y el más antiguo pendiente se atiende primero.                                                                       |















## Actividad 4 – Comparación y argumentación

| Aspecto | Pila (LIFO) | Cola (FIFO) |
|---|---|---|
| Principio de funcionamiento | El último elemento en entrar es el primero en salir. | El primer elemento en entrar es el primero en salir. |
| Operaciones principales | Apilar, desapilar, consultar el tope y verificar si la pila está vacía. | Encolar, desencolar, consultar el frente y verificar si la cola está vacía. |
| Forma de acceso | Los elementos se agregan y se retiran por el mismo extremo, llamado tope. | Los elementos se agregan al final y se retiran por el frente. |
| Ventaja en los servicios académicos | Permite deshacer cambios en orden inverso. Por ejemplo, si una nota cambia de 12 a 15 y luego de 15 a 17, al deshacer el último cambio se recupera el 15. | Permite respetar el orden de llegada. Por ejemplo, si Ana solicita una constancia antes que Luis, se atiende primero la solicitud de Ana. |

### Conclusión grupal

Como equipo, elegimos una pila para guardar los cambios porque, al deshacer una acción, necesitamos recuperar el valor que había justo antes. Para las solicitudes elegimos una cola porque cada estudiante debe conservar su turno, aunque después lleguen más solicitudes. Así, el sistema puede recuperar una nota paso a paso y atender los trámites en el orden en que se recibieron.

## 6. Video de exposición

Enlace de YouTube: Pendiente de agregar.
