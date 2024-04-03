public class ServiceStation {
    public void check(icheckEngine car, Vehicles bicycle, icheckTrailer truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + ((Car) car).getModelName());
            for (int i = 0; i < ((Car) car).getWheelsCount(); i++) {
                ((Car) car).updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + ((Truck) truck).getModelName());
            for (int i = 0; i < ((Truck) truck).getWheelsCount(); i++) {
                ((Truck) truck).updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }
}
