package org.example;


public class Main {
    public static void main(String[] args) {

        // 1. Probamos el constructor con un piloto válido
        Driver bestDriver = new Driver(3, "Max Verstappen",
                "Red Bull");

        // 2. Probamos que los getters y setters anden bien
        System.out.println("Piloto: " + bestDriver.getName());
        System.out.println("Equipo: "+ bestDriver.getTeam());

        bestDriver.setTeam("Ferrari"); // Cambia de team (un vendido)

        // 3. utilizamos toString
        System.out.println(bestDriver);

        // 4. Probamos que la validaciòn este correcta
        try {
            Driver invalidDriver = new Driver(
              101, "Cherstappen", "Apex"
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Nùmero incorrecto " + e.getMessage());
        }
    }
}