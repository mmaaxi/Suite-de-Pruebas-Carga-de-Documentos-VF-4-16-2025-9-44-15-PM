Feature: Validar carga de documento PDF válido

  Scenario: Cargar y procesar un archivo PDF válido
    Given el usuario ha seleccionado el archivo PDF válido para cargar
    When el usuario hace clic en el botón 'Cargar documento'
    Then el documento debe procesarse y almacenarse correctamente mostrando un mensaje de éxito