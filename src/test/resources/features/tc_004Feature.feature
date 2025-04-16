Feature: Validar integración con sistema de gestión documental

  Scenario: Cargar un documento PDF válido y verificar la integración
    Given el sistema está listo para recibir documentos
    When el usuario carga un documento PDF válido
    Then el documento es enviado al sistema de gestión documental
    And el sistema registra la integración en sus logs correctamente