# Forja
#### Asignatura: *Arquitectura y Patrones para Aplicaciones Web*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)

### Tecnologías necesarias
* Java
* Maven
* IntelliJ
* GitHub
* Travis CI
* Sonarcloud

### Descripción
Proyecto para la primera práctica de la asignatura Arquitectura y Patrones para Aplicaciones Web.

[![Build Status](https://travis-ci.org/jolomoreno/APAW.ECP1.JoseLorenzo.svg?branch=develop)](https://travis-ci.org/jolomoreno/APAW.ECP1.JoseLorenzo)

### Tareas a realizar
1. Establecer el esquema UML entre las entidades.
* Cuatro entidades, con un mínimo de 2 atributos y si se guarda en BD directamente atributo Id de tipo String
* Un mínimo de 14 atributos entre todas las entidades (incluidos id)
* Debe existir alguna entidad con relación de 0..1
* Debe existir alguna entidad con relación de 0..n.
* Alguna entidad no debe tener relaciones
* Algún atributo con: Enumerado (mínimo 3 valores), LocalDateTime, Boolean, Integer.

2. Refactorización de las entidades propuestas aplicando los siguientes patrones:
* Factoría con patrón _**SINGLETON**_ de la entidad. Se almacenan y se buscan las entidades por su id de la entidad principal, como entidad principal se refiere a la entidad que posee la relación, pero la factoría no los crea, solo gestiona los objetos. Debe ir con test de prueba.
* _**BUILDER**_ de la entidad. Debe ir con test de prueba.
* Patrón _**COMPOSITE**_ de la entidad. La entidad no puede ser cambiada de su interfaz publico dado. Mediante el método view() se visualiza la id si es una entidad y name (String) si es una agrupación. Debe ir con test de prueba.
* Patrón _**OBSERVER**_, para que cada vez que se añade un objeto nuevo, provoque un evento, es decir, se notifique a todos los observadores.  Debe ir con test de prueba.
* Patrón _**STRATEGY**_. Buscar, comprender, explicar y realizar un ejemplo propio de su funcionamiento.

### Solución propuesta
1. Las entidades que se han definido (las cuales cumplen las especificaciones propuestas) son las siguientes:
* _**EQUIPO**_, sus atributos son: id: String, numCorredores: int y nombre: String.
* _**BICICLETA**_, sus atributos son: id: String, homologada: Boolean y marca: String.
* _**CORREDOR**_, sus atributos son: id: String, nombre: String y dorsal: int.
* _**CATEGORIA**_, clase enumerada con valores JUNIOR, SENIOR y ELITE.
* _**COMPETICION**_, sus atributos son: id: String, fecha: LocalDateTime y lugar: String.

![Esquema UML propuesto](https://github.com/jolomoreno/APAW.ECP1.JoseLorenzo/blob/master/APAW.ECP1.JoseLorenzo.png)

### Explicación del patrón _**STRATEGY**_ aplicado en la práctica.
* _**Definición**_: Este patrón facilita la implementación de distintas estrategias o comportamientos específicos en clases hijas a través de una clase común. Así, en tiempo de ejecución y en función de algún parámetro como el tipo de instancia, se ejecutará la estrategia concreta para esa situación.

Se recomendará usar este patrón cuando en un mismo programa debamos proporcionar distintas alternativas de comportamiento, permitiendo a través de clases independientes, encapsular las distintas estrategias.

Los distintos componentes de este patrón son:

* Interfaz Strategy: será aquella interfaz que define el nombre del método o métodos que conformarán la estrategia.
* Contexto: elemento donde se desarrollará la estrategia.
* Clases Strategy concretas: todas aquellas clases que implementen la interfaz Strategy dando forma al algoritmo.

A continuación se muestra el diagrama con la definición del patrón.
![Esquema UML propuesto](https://github.com/jolomoreno/APAW.ECP1.JoseLorenzo/blob/master/strategy.jpg)

Con la finalidad de hacer más amena la explicación de este patrón, se ha propuesto implementarlo en código a través de un ejemplo "más gráfico", en este caso mediante un personaje de ficción.

_**EJEMPLO de patrón Strategy**_

El personaje Iron Man/Tony Stark (de los comics de MARVEL) necesita mejorar el software de lanzamiento de sus armaduras para que, según sus necesidades, pueda pedir de forma remota la que mejor le convenga en cada momento (armadura para viajes espaciales, armadura con modo sigilo, armadura acuática, etc.). Como Tony Stark es un buen programador, se ha propuesto implementar esta mejora siguiendo el patrón _**STRATEGY**_ anteriormente definido.

En este repositorio se muestra la implementación final de la mejora (con sus respectivos TEST DE PRUEBAS). Comentar que como es una primera aproximación, se ha implementado que el sistema sea capaz de enviar 3 armaduras, aunque, debido a que el patrón lo permite, se podrá implementar el lanzamiento de tantos tipos de armaduras como se necesite.

En este ejemplo, los componentes desarrollados son estos:
* Interfaz ILanzador: Define el nombre del método realizarLanzamiento().
* Lanzador: Esta clase será la que discrimine la estrategia que se quiera aplicar y ejecute el método realizarLanzamiento().
* Clases ArmaduraX: Implementan el método definido por la interfaz pero aplicando la lógica que se requiera en cada caso.
