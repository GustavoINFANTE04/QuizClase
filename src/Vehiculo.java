public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String combustible;

    public Vehiculo(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public abstract void encender();
    public abstract void apagar();
    public abstract void mostrarInformacion();

    public void abastecerCombustible() {
        System.out.println("Abasteciendo combustible para el: " + marca + " " + modelo);
    }
}