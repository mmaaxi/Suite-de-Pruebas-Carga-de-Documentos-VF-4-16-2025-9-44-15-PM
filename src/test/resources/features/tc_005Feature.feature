Feature: Validar tiempos de respuesta en la carga de documentos

  Scenario: Verificar tiempo de carga de un documento PDF
    Given el usuario está en la página de carga de documentos
    When carga un documento PDF de tamaño medio
    Then el sistema procesa la carga en un tiempo inferior a 5 segundos
    And el tiempo registrado cumple con el SLA