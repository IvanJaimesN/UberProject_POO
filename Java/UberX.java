package Java;

/** Clase UberX extiende a la clase Car */
public class UberX extends Car {  
    String brand;
    String model;

    /** Constructor que debe coincidir con la clase padre */
    public UberX(String license, Account driver, String brand, String model){
        super(license, driver); /** se llama el método constructor de la clase padre (Car) */
        this.brand = brand;
        this.model = model;
    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Brand: " + brand);
    }
    
}
