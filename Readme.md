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

### Resolución

#### Test parametrizados

Empleo el asserTrue para comprobar si el DNI  es el pedido y entonces veremos como podemos sber si los numeros y el tamaño d cada uno le corresponde al resultado del resto.
#### Error en el código

El error en el código es que el DNI no tiene que ser mayor de 8 caracteres, por lo que en el test se debería de comprobar que el DNI no sea mayor de 8 caracteres.

#### Comprobación de la longitud de la string

Cogemos la string antes de hacerle un tes con un @BeforeAll o podemos ir comprobando con un @beforeEach cada una de las pruebas que realizaremos para comprobar que la longitud de la string es la correcta.

---