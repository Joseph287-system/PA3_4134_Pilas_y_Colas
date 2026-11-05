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
