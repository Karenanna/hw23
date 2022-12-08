import java.util.List;

public class Main {
    public static void main(String[] args) {

       Mechanic<Car> babur= new Mechanic<Car>("Бабур", "Джалалович", "Vfc");
        Sponsor skypro = new Sponsor("Skypro", 500000 );
        Car suzuki = new Car("Suzuki", "XC90", 3.2332);
        suzuki.addMechanic(babur);
        suzuki.addSponsor(skypro);
   //     Car honda = new Car("Honda", "Civic", 3.1);
   //     Car kia = new Car("Kia", "Sorento", 2.8);

        Mechanic<Truck> anvar= new Mechanic<Truck>("Анвар", "Дудаевич", "KlM");
        Sponsor apple = new Sponsor("Apple", 1000000 );
        Truck maz = new Truck("Maz", "5566", 2.2);
        maz.addMechanic(anvar);
        maz.addSponsor(apple);
 //       Truck iveco = new Truck("Iveco", "777", 2.5);
//        Truck kamaz = new Truck("Kamaz", "333", 3.0);

        Sponsor google = new Sponsor("Google", 1000000 );
        Bus man = new Bus("Man", "88", 2.0);
        man.addSponsor(google);
 //       Bus merseders = new Bus("Merseders", "3377", 3.0);
 //       Bus ikarus = new Bus("Ikarus", "43", 2.2);

  //      diagnostics(suzuki, honda, kia, maz, iveco, kamaz, man, merseders, ikarus);
        List<Transport> transportList = List.of(suzuki, maz,man);


    }

    private static void printInfo(Transport transport) {
        System.out.println("Инфо по авто" + transport.getBrand() + " " + transport.getModel());


    }

    private static void printInfo(Transport transport) {
        System.out.println(transport.getBrand() + transport.getModel() + transport.getEngineVolume());
    }
    private static void diagnostics(Transport... transports) {
        for (int i = 0; i < transports.length; i++) {
            if (!transports[i].diagnostics()) {
                try {
                    throw new RuntimeException("Транспорт" + transports[i].getBrand() + " " + transports[i].getModel()
                            "Не прошел диагностику");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}