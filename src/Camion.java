public class Camion extends Vehiculo {

    public Camion(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void encender() {
        System.out.println("El camión " + marca + " " + modelo + " está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El camión " + marca + " " + modelo + " está apagado.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Camión - Marca: " + marca + ", Modelo: " + modelo + ", Combustible: " + combustible);
    }
}
