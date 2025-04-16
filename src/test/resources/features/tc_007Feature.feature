Feature: Validación de seguridad y permisos de acceso al documento cargado

  Scenario: Verificar acceso al documento cargado con usuarios autorizados y no autorizados
    Given el usuario autorizado ha iniciado sesión en el sistema
    When se carga un documento PDF en el sistema
    Then el usuario puede acceder al documento

    Given el usuario no autorizado ha iniciado sesión en el sistema
    When intenta acceder al documento
    Then el sistema muestra un mensaje de 'Acceso denegado'