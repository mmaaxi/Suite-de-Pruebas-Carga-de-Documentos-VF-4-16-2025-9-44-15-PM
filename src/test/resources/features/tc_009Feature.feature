Feature: Validar notificación de carga exitosa

  Scenario: El usuario carga un documento PDF válido y revisa la notificación
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento PDF válido
    Then el sistema envía una notificación de carga exitosa al usuario
    And el usuario revisa la bandeja de notificaciones
    Then se muestra el mensaje de confirmación de la carga