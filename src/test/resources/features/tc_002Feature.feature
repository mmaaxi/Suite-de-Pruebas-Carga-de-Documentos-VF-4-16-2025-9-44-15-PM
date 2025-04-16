Feature: Validar rechazo de documento de formato inválido

  Scenario: Cargar un archivo con un formato no permitido
    Given que un usuario intenta cargar un archivo
    When selecciona un archivo con formato .exe
    Then el sistema debe rechazar el archivo y mostrar un mensaje de error
    And no se debe permitir la carga del archivo