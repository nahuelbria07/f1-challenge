package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Tests del corredor")
class DriverTest {

    @Test
    @DisplayName("Creando un corredor con un nùmero valido")
    void crearConNumeroValido() {
        Driver driver = new Driver(75, "Nico Hulkenberg", "audi");

        assertEquals(75, driver.getNumber());
        assertEquals("Nico Hulkenberg", driver.getName());
        assertEquals("audi", driver.getTeam());
    }

    @Test
    @DisplayName("Rechazando un corredor por nùmero menor a 1")
    void rechazarNumInferior() {
        assertThrows(IllegalArgumentException.class,
                () -> new Driver(0, "Cara e chimba", "Apex"));
    }

    @Test
    @DisplayName("Rechazando un corredor por nùmero mayor a 99")
    void rechazarNumSuperior() {
        assertThrows(IllegalArgumentException.class,
                () -> new Driver(101, "Ghost", "Equipo X"));
    }
}
