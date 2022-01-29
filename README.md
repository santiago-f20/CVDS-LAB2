# La Herramienta Maven

## Mayor Utilidad

Maven permite crear de software con dependencias incluidas dentro de la estructura del JAR. 
Además permite trabajar en red. este sistema se encargará de ubicar las librerías que deseamos utilizar en Maven Central.


## Fases de Maven

* Process-resources
* Compile
* Process-test-resources
* Test-compile
* Test
* Package
* Install
* Deploy


## Ciclo de vida de la construcción

**Ciclo de vida default:** Gestiona la construcción y despliegue del proyecto. </p>
**Ciclo de vida clean:** Gestiona la limpieza del directorio del proyecto. </p>
**Ciclo de vida site:** Gestiona la creación de la documentación del proyecto.


## Para qué sirven los plugins?

ejecutan tareas de construcción como: compilar el proyecto, empaquetarlo e implementarlo en un servidor local o remoto. 
Esas actividades se correlacionan perfectamente para construir fases del ciclo de vida.

## Repositario central de Maven
**Qué es:** Es la ubicación predeterminada para que Maven descargue todas las bibliotecas de dependencia del proyecto para su uso, bibliotecas que son constantemente actualizadas por sus creadores. </p>
**Para qué sirve:** Facilita el acceso de los usuarios a las cientos de bibliotecas con las que este cuenta, las cuales facilitan el desarrollo.