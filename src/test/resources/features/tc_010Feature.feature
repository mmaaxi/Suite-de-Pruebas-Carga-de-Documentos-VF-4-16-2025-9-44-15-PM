Feature: Validar comportamiento ante interrupción de la conexión

  Scenario: Interrupción y reanudación de carga de documento
    Given el usuario ha iniciado la carga de un documento
    When la red se desconecta
    Then el sistema detiene la carga y muestra un mensaje de error por interrupción de conexión

    When la conexión se restaura
    And el usuario intenta reanudar la carga
    Then el sistema permite reintentar la carga sin duplicar el proceso anterior