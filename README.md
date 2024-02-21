# CasoFinalIntegrador_1
 - Caso final integrador del tema 1 de Java (21/2/2024)
 - Link con acceso al código ---> https://github.com/GabriHR/CasoFInalIntegrador_1.git

## Informe del proyecto

### Descripción de cada módulo y su propósito dentro de la misión.
 1. Cronómetro Cósmico: en este módulo se calcula y muestra el tiempo en segundos, minutos, horas, días y años en la Tierra y, se realiza la conversión a su  equivalente en el nuevo planeta.
 2. Recursos y Suministros: estima el uso de recursos y anticipa si habrá requerimientos, emitiendo advertencias/alertas cuando los niveles sean bajos.
 3. Sistema de Alerta y Monitoreo: vigila factores críticos y emite advertencias sobre sucesos inusuales. Además, desglosa cuestiones complejas para simplificar la toma de decisiones.
 4. Planificador de Tareas: planifica y asigna las tareas cotidianas, estimando la carga de trabajo requerida para cada empleado.
 5. Navegador Estelar: estima rutas de exploración, empleando matrices para representar el terreno.
 6. Comunicador Interplanetario: inspecciona y traduce mensajes, asegurando que la comunicación sea íntegra y efectiva.

### Explicación de los algoritmos y estructuras de datos utilizados.

 1. Cronómetro Cósmico: utiliza los metodos "convertirTiempo" y "formatearTiempo" para calcular, transformar el tiempo en función de lo requerido
 2. Recursos y Suministros: emplea operaciones aritméticas y estructuras de flujo para determinar el consumo. Retorna matrices/arrays.
 3. Sistema de Alerta y Monitoreo: aplica algoritmos para identificar números primos y descomponer dichos números, en factores primos. Utiliza bucles for y arrays para definir de manera más clara y abarcando los casos posibles en cuanto al monitoreo.
 4. Planificador de Tareas:
 5. Navegador Estelar: usa las matrices o arrays para almacenar los datos y para mostrar al usuario los elementos requeridos respecto de las rutas y construcciones, multiplica dichos matrices.
 6. Comunicador Interplanetario: hace uso de un bucle for que recorre todas las vocales y más adelante devuelve el número de vocales que contiene el mensaje. 

### Desafíos encontrados durante el desarrollo y cómo se resolvieron

Principalmente, el mayor desafío en la elaboración del proyecto de código de Java, no fue otro más que el uso correcto de los módulos y su disposición. Con esto me quiero referir, a que a la hora de escribir el código, no ha habido problema ninguno. En caso de haberlo habido, hubiese buscado información extra de repositorios en github. Pero lo que si me gustaría recalcar, es la complejidad que supone, el una vez redactado el código, que sea legible, esté ordenado y no sea un cúmulo de letras sin sentido alguno.

Para ello he creado una solo módulo, que contiene diversos archivos, implementado. Estos archivos estan todos dentro de otra carpeta llamada "org.example" debido a la sintaxis del build system. 
He decidido organizarlo de tal manera que, en cada .java, almacenaba todos los datos y variables, métodos y clases necesarios para su ejecución y, posteriormente, en un archivo Main.java, el código necesario para mostrar por pantalla al usuario en cuestión los datos ya definidos en los demás archivos. He decidido hacerlo de esta manera ya que me parece una manera fácil pero a la vez rebuscada para el programador, que merece la pena porque proporciona una claridad y sencillez para el usuario a la hora de acceder, leer y buscar dentro del código.
