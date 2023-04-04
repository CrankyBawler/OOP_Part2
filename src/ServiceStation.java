public class ServiceStation implements ServiceStationInterface {

    @Override
    public void checkCar(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                Car.updateTyre();
            }
            Car.checkEngine();
        }
    }

    @Override
    public void checkTruck(Car car, Bicycle bicycle, Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                Truck.updateTyre();
            }
            Truck.checkEngine();
            Truck.checkTrailer();
        }
    }

    @Override
    public void checkBicycle(Car car, Bicycle bicycle, Truck truck) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }
}
