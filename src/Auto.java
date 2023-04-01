public class Auto {
    String color;
    String placa;
    int numLlantas;
    Motor motor;
    Propietario propietario;
    double velocidad(){
        double velocidadKh = 0;
        velocidadKh = motor .fuerza() *numLlantas;
        return velocidadKh;
    }

}