public class Auto {
    private String color;
    private int puertas;
    private String placas;
    private String modelo;
    private int numLlantas;
    private Motor motor;
   private  Propietario propietario;


    public Auto(){

    }

    public Auto(String color, int numLlantas, String placas, String modelo, int puertas, Motor motor, Propietario propietario ){
        this.color=color;
        this.puertas=puertas;
        this.placas=placas;
        this.modelo=modelo;
        this.numLlantas=numLlantas;
        this.motor=motor;
        this.propietario=propietario;
    }

    public  Auto(String color, int puertas, String placas){
        this.color = color;
        this.puertas = puertas;
        this.placas = placas;
    }
    double velocidad(){
        double velocidadKh = 0;
        velocidadKh = motor .fuerza() *numLlantas;
        return velocidadKh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}