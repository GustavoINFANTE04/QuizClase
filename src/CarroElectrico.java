public class CarroElectrico extends Carro implements VehiculoElectrico {

    private int nivelBateria;

    public CarroElectrico(String marca, String modelo, int nivelBateria) {
        super(marca, modelo, "Eléctrico");
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando la batería del carro eléctrico " + marca + " " + modelo);
        nivelBateria = 100;
    }

    @Override
    public int nivelBateria() {
        return nivelBateria;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Carro Eléctrico - Marca: " + marca + ", Modelo: " + modelo + ", Nivel de Batería: " + nivelBateria + "%");
    }
}
