package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        /** Declaración de un objeto Car empleando el método constructor
         * de la clase Car y Account
        */
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        //uberX.passegenger = 4;
        uberX.setPassenger(4);

        //System.out.println("Car License: " + uberX.license);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH789", new Account("Andres Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        /************************* */
        /** Segundo objeto car */
        /*Car car2 = new Car("XPS234", new Account("Andrea Paez", "AA7482"));
    
        car2.passegenger = 3;
        /** Imprimir los datos empleando el método de la clase Car */
        /*car2.printDataCar(); */
    }
}