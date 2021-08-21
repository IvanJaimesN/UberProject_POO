package Java;

public class Car {
    /** variables globales */
    Integer id;
    String license;
    Account driver;   /** driver hereda de la clase Account */
    Integer passegenger;

    /** Método Constructor */
    public Car(String license, Account driver){ /** license y driver son variables locales */
        this.license = license;
        this.driver = driver; /** Asignación de las variables locales a las globales, 
        * deben ser del mismo tipo de dato */
    }

    /** Método para imprimir los datos de la clase */
    void printDataCar(){
        System.out.println("License: " + license + " Driver: " + driver.name);
    }
}
