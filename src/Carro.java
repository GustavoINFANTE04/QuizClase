public class Carro extends Vehiculo {

    public Carro(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void encender() {
        System.out.println("El carro " + marca + " " + modelo + " está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El carro " + marca + " " + modelo + " está apagado.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Carro - Marca: " + marca + ", Modelo: " + modelo + ", Combustible: " + combustible);
    }
}