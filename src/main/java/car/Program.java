package car;

import java.awt.*;

public class Program {
    public static void main(String[] args) {
        RefuelingStation refuelStation = new RefuelingStation();
        CarWashingStation wasingStation = new CarWashingStation();

        Harvester harvester = new Harvester("M","5617", "Yellow");
        harvester.setRefuelingStation(refuelStation);
        harvester.sweeping();
        harvester.movement();
        harvester.fuel();
        harvester.setWiping(wasingStation);
        harvester.quickCarWash();
        double costOfMaintenance = calculateMaintenance(harvester);
        System.out.println("Переобуть машину " + harvester + " будет стоить: " + costOfMaintenance);


        SportCar sportCar = new SportCar("Ferrari", "1542", "Black");
        sportCar.setRefuelingStation(refuelStation);
        sportCar.movement();
        sportCar.fuel();
        sportCar.setWiping(wasingStation);
        sportCar.fullCarWash();
        costOfMaintenance = calculateMaintenance(sportCar);
        System.out.println("Переобуть машину " + sportCar + " будет стоить: " + costOfMaintenance);

        Pickup pickup = new Pickup("Ford", "CargoGreatMini", "Red");
        pickup.setRefuelingStation(refuelStation);
        pickup.movement();
        pickup.fuel();
        pickup.cargoTransportation(500);
        pickup.cargoTransportation(250);
        pickup.setWiping(wasingStation);
        pickup.fullCarWash();
        costOfMaintenance = calculateMaintenance(pickup);
        System.out.println("Переобуть машину " + pickup + " будет стоить: " + costOfMaintenance);
    }

    public static double calculateMaintenance(Car car){
        if (car.getWheelsCount() == 6){
            return 1500*6;
        }
        else {
            return 1000*4;
        }
    }
}
