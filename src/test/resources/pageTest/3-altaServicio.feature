Feature: Alta Servicio
  As a User I would like to create 'Servicios'

  Scenario Outline: '<scenario>'
    Given I login successfully
    And I am at Home page
    And I click on Alta Servicios
    And I choose '<tipo_unidad>' as tipo unidad
    And I set '<dia_partida>' as dia de partida
    And I set '<hora_partida>' as hora de partida
    And I set '<estacion_origen>' as estacion origen
    And I set '<estacion_destino>' as estacion destino
    And I click on Guardar
    Then I am taken to Listado de Servicios page
    And Servicio with hora de partida: '<hora_partida>' is present

    Examples:
      | scenario        | tipo_unidad | dia_partida | hora_partida  | estacion_origen               | estacion_destino  |
      | Create Servicio | Cama        | Lunes       | 00:00         | Terminal de Omnibus La Plata  | Retiro            |