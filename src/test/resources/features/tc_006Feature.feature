Feature: Validar manejo de errores en la carga de documentos

  Scenario: Manejo de error de conexión durante la carga de documentos
    Given que estoy en la página de carga de documentos
    When simulo un error en la conexión durante la carga del documento
    Then el sistema muestra mensaje de error de conexión y permite reintentar la acción

  Scenario: Reintentar la carga del documento
    Given que estoy en la página de carga de documentos con conexión restaurada
    When reintento la carga del documento
    Then el documento se carga exitosamente sin duplicación de datos