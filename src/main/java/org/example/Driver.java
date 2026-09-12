package org.example;

// Importamos Lombok para poder utilizarlo
import lombok.Data;

// 5. Colocamos @Data para que nos haga los getters, setters y toString()
@Data
public class Driver {

    // Codigo utilizado para hacer comparaciones
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 99;

    // 1. Colocar atributos privados
    private int number;
    private String name;
    private String team;

    // 2. Generar el constructor con un validador de nùmero
    public Driver(int number, String name, String team) {

        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException(
                    "El nùmero tiene que ir entre " + MIN_NUMBER + " y "
                            + MAX_NUMBER
            );
        }
        this.number = number;
        this.name = name;
        this.team = team;
    }

    // 3. Crear los getters y setters de cada atributo

    // public String getName() {
    //    return name;
    // }

    // public void setName(String name) {
    //    this.name = name;
    // }

    // public int getNumber() {
    //    return number;
    // }

    // public void setNumber(int number) {
    //    this.number = number;
    // }

    // public String getTeam() {
    //    return team;
    // }

    // public void setTeam(String team) {
    //    this.team = team;
    // }

    // 4. Construir el toString a mano (@Override)
    // public String toString() {
    //    return "Corredor{number=" + number + "name=" + name + "team="
    //            + team + "}";
    // }
}
