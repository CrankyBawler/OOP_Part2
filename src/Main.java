public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("car1", 4),
                new Car("car2", 4),
        };
        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2", 8),
        };
        Bicycle[] bicycles = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };

        Vehicle[] vehicles = new Vehicle[cars.length + trucks.length + bicycles.length];
        for (int i = 0; i < cars.length; i++) {
            vehicles[i] = cars[i];
        }
        for (int i = 0; i < trucks.length; i++) {
            vehicles[i + cars.length] = trucks[i];
        }
        for (int i = 0; i < bicycles.length; i++) {
            vehicles[i + cars.length + trucks.length] = bicycles[i];
        }

        ServiceStationInterface station = new ServiceStation();
        station.checkCar(cars[0]);
        station.checkCar(cars[1]);
        station.checkBicycle(bicycles[0]);
        station.checkBicycle(bicycles[1]);
        station.checkTruck(trucks[0]);
        station.checkTruck(trucks[1]);
    }
}

