# PA3_4134_Pilas_y_Colas
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

Ingresar a la carpeta `Actividad1_Pila_Lifo` y revisar los archivos de pseudocódigo para comprender las operaciones de una pila LIFO.

## 6. Video de exposición

Enlace de YouTube: Pendiente de agregar.

## Actividad 4 – Comparación y argumentación

| Aspecto | Pila (LIFO) | Cola (FIFO) |
|---|---|---|
| Principio de funcionamiento | El último elemento en entrar es el primero en salir. | El primer elemento en entrar es el primero en salir. |
| Operaciones principales | Apilar, desapilar, consultar el tope y verificar si la pila está vacía. | Encolar, desencolar, consultar el frente y verificar si la cola está vacía. |
| Forma de acceso | Los elementos se agregan y se retiran por el mismo extremo, llamado tope. | Los elementos se agregan al final y se retiran por el frente. |
| Ventaja en los servicios académicos | Permite deshacer cambios en orden inverso. Por ejemplo, si una nota cambia de 12 a 15 y luego de 15 a 17, al deshacer el último cambio se recupera el 15. | Permite respetar el orden de llegada. Por ejemplo, si Ana solicita una constancia antes que Luis, se atiende primero la solicitud de Ana. |

### Conclusión grupal

Como equipo, elegimos una pila para guardar los cambios porque, al deshacer una acción, necesitamos recuperar el valor que había justo antes. Para las solicitudes elegimos una cola porque cada estudiante debe conservar su turno, aunque después lleguen más solicitudes. Así, el sistema puede recuperar una nota paso a paso y atender los trámites en el orden en que se recibieron.
