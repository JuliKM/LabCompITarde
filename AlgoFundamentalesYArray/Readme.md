# ALGORITMOS FUNDAMENTALES Y ARRAY
## Explique brevemente en qué consisten los siguientes Algoritmos Fundamentales:

1. Algoritmos de Ordenación:
* Ordenamiento por Inserción
* Algoritmo de la burbuja
* Ordenamiento por selección
* Algoritmo Quick-Sort
2. Algoritmosde Búsqueda:
* Búsqueda Secuencial
* Búsqueda Binaria
3. Algoritmos de Recorrido:
* Recorrido de Profundidad
* Recorrido de Anchura

### Ordenamiento por inserción
Inicialmente se tiene un solo elemento, que por defecto es un conjunto ordenado. Después, cuando hay k elementos ordenados de menor a mayor,  se  toma  el  elemento  k+1  y  se  compara  con  todos  los  elementos  ya ordenados,  deteniéndose  cuando  se  encuentra  un  elemento  menor  (todos  los elementos mayores han sido desplazados una posición a la derecha) o cuando ya no se encuentran elementos (todos los elementos fueron desplazados y este es el más pequeño). En este punto se inserta el elemento k+1 debiendo desplazarse los demás elementos

### Algoritmo de la burbuja (Bubble Sort)
Consiste en comparar cada elemento de la lista con el siguiente (por parejas), si no están en el orden correcto, se intercambian entre sí sus valores. El valor más pequeño flota hasta el principio de la lista como si fuera una burbuja en un vaso de gaseosa. EL  recorrido  completo  de  la  lista será ejecutado hasta  que no encontremos ninguno más fuera de orden.

### Ordenamiento por selección
Inicialmente se recorre toda la lista buscando el menor de todos los elementos, una vez terminada la recorrida el menor elemento se  coloca  al  inicio  de  la  lista  recorrida.  En  la  siguiente  iteración  se  recorre nuevamente  la  lista  pero  comenzando  en  el  segundo  elemento  (ya  que  al  haber insertado  el  menor  encontrado  al  inicio  ya  lo  consideramos  ordenado).  El procedimiento continúa hasta que el último elemento recorrido es el menor de su subconjunto. 

### Algoritmo Quick-Sort
Se elije un elemento de la lista de elementos a ordenar, al que llamaremos pivote. Se resitúa los demás elementos de la lista a cada lado del pivote, de manera que a un lado queden todos los menores que él,  y  al  otro los  mayores.  Los  elementos iguales al pivote pueden ser colocados tanto a su derecha  como  a  su  izquierda, dependiendo  de  la  implementación  deseada. En este momento,  el pivote ocupa exactamente el lugar que le corresponderá en la lista ordenada. La lista queda separada en dos sublistas,  una formada por los elementos a  la izquierda del pivote, y otra por los elementos a su derecha. Se repite este proceso de forma recursiva para cada sublista mientras éstas contengan  más de un elemento.  Una vez terminado este proceso todos los elementos estarán ordenados. Como se puede suponer, la eficiencia del algoritmo depende de la posición en la que termine el pivote elegido, algunas alternativas son: tomar  un  elemento  cualquiera  como  pivote,  tiene  la ventaja  de  no  requerir ningún cálculo adicional, lo cual lo hace bastante rápido. Otra opción puede ser recorrer la lista para saber de antemano qué elemento ocupará la posición central de la lista, para elegirlo como pivote. No obstante, el cálculo adicional rebaja bastante la eficiencia del algoritmo en el caso promedio. La opción a medio camino es tomar tres elementos de la lista - por ejemplo, el primero, el segundo, y el último - y compararlos, eligiendo el valor del medio como pivote.

### Búsqueda Secuencial
El algoritmo comprueba primero el elemento almacenado en la primera posición de la lista, a continuación,  el segundo elemento y así sucesivamente, hasta que se encuentra el elemento buscado o se termina el recorrido de la lista. Esta tarea repetitiva se realiza con bucles, en nuestro caso con el bucle "for".

### Búsqueda Binaria
Este algoritmo se puede utlizar en una lista ordenada. Se toma un valor central de la misma y se evalúa si el valor se encuentra hacia un lado o el otro. Porsteriormente se vuelve a aplicar el algoritmo hasta encontrar el valor buscado. Esto es muy ventajoso en el caso de tener listas con gran  cantidad  de  elementos,  es  decir  con  millones  de  valores,  en  estos  casos realizar una búsqueda secuencial lleva mucho tiempo y si la lista ya se encuentra ordenada es mucho más eficiente realizar una búsqueda binaria que secuencial. 

### Recorrido de Profundidad
El proceso exige un camino desde el nodo raíz a través de un hijo, al descendiente más lejano del primer hijo antes de proseguir a un  segundo  hijo.  En  otras  palabras,  en  el  recorrido  en  profundidad,  todos  los descendientes  de  un  hijo  se  procesan  antes  del  siguiente  hijo.  Para  saber  cómo regresarnos, vamos guardando los nodos visitados en una estructura de pila. Es por esto que se acostumbra programar esta búsqueda de forma recursiva, con lo que el manejo de la pila lo realiza el lenguaje de programación utilizado

### Recorrido en anchura 
El proceso se realiza horizontalmente desde el raíz a todos sus hijos, a continuación, a los hijos de sus hijos y así ́sucesivamente hasta que todos los nodos han sido procesados. En otras palabras, en el  recorrido en anchura, cada nivel se procesa totalmente antes de que comience el siguiente nivel. Para poder saber qué vértices visitar, utilizamos una cola. 
