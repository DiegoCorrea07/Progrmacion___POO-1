import java.awt.image.DataBufferUShort;

public class Main {
    public static void main(String[] args) {

        Propietario propietario1 = new Propietario("Diego","1105314567");
        Motor motor1 = new Motor(2000, 5, "Gasolina");
        Auto auto1 = new Auto("Negro", 4, "PXX0021", "Yaris",4, motor1, propietario1);

        Propietario propietario2 = new Propietario("Luis","1123458789");
        Motor motor2 = new Motor(1500, 4, "Diesel");
        Auto auto2 = new Auto("Rojo", 4, "PXX0018", "Trailblazer",5, motor2, propietario2);

        Propietario propietario3 = new Propietario("Abby","11234545689");
        Motor motor3 = new Motor(2500, 4, "Gasolina");
        Auto auto3 = new Auto("Azul", 4, "PXX0067", "SportBack",4, motor3, propietario3);

        auto1.setColor("Blanco");

        String coloraux=auto1.getColor();


    }


}