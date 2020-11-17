Feature: Alta Estacion
  As a User I would like to create 'Estaciones'

  Scenario Outline: '<scenario>'
    Given I login successfully
    And I am at Home page
    And I click on Alta Estacion
    And I set '<localidad>' as localidad
    And I set '<nombre>' as nombre
    And I set '<direccion>' as direccion
    And I set '<telefono>' as telefono
    And I press Guardar
    Then I am taken to Estaciones page
    And Estacion with nombre: '<nombre>' is present

    Examples:
      | scenario        | localidad | nombre        | direccion       | telefono  |
      | Create Estacion | La Plata  | Terminal 123  | calle falsa 456 | 221555777 |