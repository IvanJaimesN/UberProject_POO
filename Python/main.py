from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    
    ## Declaración de un objeto Car
    car = Car("AMS234", Account("Andres Herrera", "AND957"))
    print(vars(car))
    print(vars(car.driver))

    ## Declaración sin métodos constructores:
    #car2 = Car()
    #car2.license = "XPS385"
    #car2.driver = "Andrea Paez"
    #print(vars(car2))