public class Main {
    public static void main(String[] args) {
        icheckEngine car = new Car("car", 4);

        icheckTrailer truck = new Truck("truck", 6);

        Vehicles bicycle = new Bicycle("bicycle", 2);


        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(null, bicycle, null);
        station.check(null, null, truck);
    }
}