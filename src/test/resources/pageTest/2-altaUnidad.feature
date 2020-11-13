Feature: Alta Unidad
  As a User I would like to create 'Unidades'

  Scenario Outline: '<scenario>'
    Given I login successfully
    And I am at Home page
    And I click on Alta Unidades
    And I set '<patente>' as patente
    And I set '<fecha_patentamiento>' as fecha de patentamiento
    And I set '<asientos_cama>' as asientos cama
    And I set '<asientos_semi_cama>' as asientos semi cama
    And I set '<tipo_unidad>' as tipo unidad
    And I click Guardar
    Then I am taken to Taller page
    And Unidad with patente: '<patente>' is present

    Examples:
      | scenario      | patente   | fecha_patentamiento | asientos_cama | asientos_semi_cama | tipo_unidad|
      | Create Unidad | abc-123   | 09/09/2019          | 1             | 1                  | Cama       |