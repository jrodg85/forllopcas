# Definición de Proyecto Individual

## Descripción
La aplicación permitirá saber que armas se encuentran depositadas, por tipo y caracteristicas.
 
Será una aplicación multidispositivo.  

## Diagrama de clases de diseño

![Diagrama de Diseño MVP](https://git.institutomilitar.com/llopcas/bullseye/-/wikis/uploads/8faec57b5ea805e041c3ef24516393d6/DAM.drawio.png)

*NOTA: Con este diagrama se cumple con el punto 9.2 "Criterios de evaluación" de la [guía docente](https://ui-719fa0e4e7366174bca68ae71ab99697.institutomilitar.com/file-upload/Ewp2mng7RAoJHXQcG/Gu%C3%ADa%20Docente%20Direcci%C3%B3n%20y%20Gesti%C3%B3n%20de%20Proyectos.pdf)*

**Cumplimiento de requisitos**
1. **Herencia**: Se realizará sobre `Arma` y sus subtipos.
2. **Relación One-To-Many**: Relación entre `Deposito` y `Arma`.
3. **Método personalizado**: Devolvera los `Deposito/s` donde se encuentren las Armas de fuego en funcion de un calibre, con un sistema de accionamiento concreto.
4. **Listado**: Se mostrarán las armas depositadas por tipo y caracteristicas figura 1 
5. **CRUD**: En la misma pantalla anterior se usarán los controles adecuados para hacer el CRUD. Se usará el formulario de la figura 2.
6. **URLs** del proyecto:
   1. Repositorio proyecto:https://git.institutomilitar.com/llopcas/bullseye.git
   1. Librería: https://github.com/llopcas/Bullseye-Common
7. **Despliegue** en Internet:
   1. API: https://bullseyeapi1.herokuapp.com/api/
   1. Web: https://bullseyeapi.netlify.app/

## Interfaz de usuario

Figura 1: 

  ![Interfaz de Usuario](https://git.institutomilitar.com/llopcas/bullseye/-/wikis/uploads/79a37b59036c0a08f1415bddab713b00/CRUD.png)

## Formulario

Figura 2: 
 
  ![Formulario](https://git.institutomilitar.com/llopcas/bullseye/-/wikis/uploads/4cf8c410586b0765a968b56605d39340/Formulario.png)


