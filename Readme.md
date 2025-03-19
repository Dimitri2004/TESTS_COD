## Examen de Test Unitarios

---

### Enunciado

Con el código de este repositorio realiza:

- (*4 puntos*) Los test unitarios de los **dos** métodos, utiliza test **parametrizados**. Suponiendo que la `string` DNI, siempre es un DNI válido.
- (*2 puntos*) En el código, hay un error, ¿lo pudiste comprabar en los test? ¿Plantea la solución?
- (*3 puntos*) Si no hubiera una comprobación previamente encuanto a la longitud de la `string` del DNI, ¿Qué hay que cambiar en los tests para que comprueben estos casos?

Entrega tu repositorio con el código y los test. Además un `Readme` explicando y justificando cada apartado

Formato del `Readme` *1 punto*

---
DIMA APARICIO PEREIRA
### Resolución

#### Test parametrizados

Empleo el asserTrue y assertFalse para comprobar si el DNI  es el pedido y entonces veremos como podemos sber si los numeros y el tamaño d cada uno le corresponde al resultado del resto.

#### Error en el código

El error en el código es que no se comprueba la longitud de la cadena del DNI, por lo que si no se comprueba la longitud de la cadena del DNI, el código no funcionará correctamente. Para solucionar este problema, se debe añadir una comprobación de la longitud de la cadena del DNI en el código.

#### Cambios en los tests

