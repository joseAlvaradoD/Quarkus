# language: es

Característica: ¿Está diciendo hello?
  Primer servicio rest con quarkus

  Escenario: Service is responding hello
    Dado Recurso libro
    Cuando Solicitar libros por la API
    Entonces Deberia recibir "Hello RESTEasy"