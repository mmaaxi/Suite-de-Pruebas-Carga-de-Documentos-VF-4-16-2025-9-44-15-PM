Feature: Validar mensaje de error por tamaño excedido

  Scenario: Seleccionar un documento PDF que exceda el tamaño máximo permitido
    Given que el usuario ha accedido a la página de carga de documentos
    When el usuario selecciona un documento PDF que excede el tamaño máximo permitido
    And hace clic en 'Cargar documento'
    Then el sistema muestra un mensaje de error indicando que el tamaño del archivo es demasiado grande