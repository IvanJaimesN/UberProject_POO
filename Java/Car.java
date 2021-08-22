package Java;

public class Car {
    /** variables globales */
    private Integer id;
    private String license;
    private Account driver;   /** driver hereda de la clase Account */
    protected Integer passenger;

    /** Método Constructor */
    public Car(String license, Account driver){ /** license y driver son variables locales */
        this.license = license;
        this.driver = driver; /** Asignación de las variables locales a las globales, 
        * deben ser del mismo tipo de dato */
    }

    /** Método para imprimir los datos de la clase */
    void printDataCar(){
        if(passenger != null){
        System.out.println("License: " + license + " Driver: " + driver.name + " Passengers: " + passenger);
        }
    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}
