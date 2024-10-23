public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Ford", "Ranger", "Gasolina");
        Camion camion = new Camion("Nissan", "Cabstar", "Diesel");
        Moto moto = new Moto("Yamaha", "YZF-R7", "Gasolina");
        CarroElectrico carroElectrico = new CarroElectrico("Tesla", "Model S", 67);

        carro.mostrarInformacion();
        carro.encender();
        carro.abastecerCombustible();
        carro.apagar();

        System.out.println("--------------------");

        camion.mostrarInformacion();
        camion.encender();
        camion.abastecerCombustible();
        camion.apagar();

        System.out.println("--------------------");

        moto.mostrarInformacion();
        moto.encender();
        moto.abastecerCombustible();
        moto.apagar();

        System.out.println("---------------------");

        carroElectrico.mostrarInformacion();
        carroElectrico.encender();
        System.out.println("Nivel de la batería: " + carroElectrico.nivelBateria() + "%");
        carroElectrico.cargarBateria();
        System.out.println("Nivel de  la batería tras la carga: " + carroElectrico.nivelBateria() + "%");
        carroElectrico.apagar();
    }
}