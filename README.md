# Interfaces en Java

Aplicación de consola que modela un catálogo de canciones, podcasts y libros digitales. El proyecto demuestra el uso de interfaces, clases abstractas, herencia y polimorfismo para trabajar con contenidos que tienen capacidades diferentes.

## Funcionamiento

El programa muestra un catálogo de ejemplo, simula la reproducción de canciones y podcasts mediante mensajes en consola, suma su duración y calcula el espacio estimado para descargar todos los contenidos.

## Clases e interfaces

| Componente | Responsabilidad |
| --- | --- |
| `Contenido` | Clase abstracta con título, autor y el método `tipo()`. |
| `Reproducible` | Interfaz que define `reproducir()` y `getDuracionSeg()`. |
| `Descargable` | Interfaz que define `calcularTamanoMB()`. |
| `Cancion` | Contenido reproducible y descargable; estima 1.5 MB por minuto. |
| `Podcast` | Contenido reproducible y descargable con número de episodio; estima 1 MB por minuto. |
| `LibroDigital` | Contenido descargable; estima 0.2 MB por página. |
| `Main` | Construye el catálogo y calcula el tiempo y el espacio totales. |

Las listas de `Reproducible` y `Descargable` permiten procesar distintos tipos de contenido a través de una interfaz común.

## Estructura

```text
src/main/java/org/example/
├── Cancion.java
├── Contenido.java
├── Descargable.java
├── LibroDigital.java
├── Main.java
├── Podcast.java
└── Reproducible.java
bin/org/example/              # Archivos .class compilados
pom.xml                       # Configuración de Maven
```

## Requisitos

- JDK 26, de acuerdo con la configuración del proyecto.
- `java` y `javac` disponibles en el `PATH`.

## Compilar y ejecutar

Desde la carpeta que contiene `pom.xml`, ejecuta:

```powershell
javac -encoding UTF-8 -d bin src/main/java/org/example/*.java
java -cp bin org.example.Main
```

Si ya tienes los archivos compilados en `bin`, puedes ejecutar únicamente el segundo comando.

También puedes abrir el proyecto desde `pom.xml` en IntelliJ IDEA y ejecutar la clase `org.example.Main` con el JDK 26 configurado.

## Resultado de ejemplo

El catálogo incluye dos canciones de 210 y 180 segundos, un podcast de 1800 segundos y un libro de 320 páginas. Con estos datos, los totales son:

```text
Tiempo total: 36 min 30 s
Espacio necesario: 103.75 MB
```

La reproducción y las descargas son una simulación: el programa imprime información y calcula estimaciones, sin reproducir audio ni descargar archivos.
