Feature: Validar autenticación de usuario en el proceso de carga

  Scenario: El usuario inicia sesión y carga un documento satisfactoriamente
    Given el usuario está en la página de inicio de sesión
    When intenta iniciar sesión con credenciales válidas
    Then el usuario ingresa al sistema correctamente
    And después de autenticarse, realiza una carga de documento
    Then la carga se permite y se registra en el historial de usuario