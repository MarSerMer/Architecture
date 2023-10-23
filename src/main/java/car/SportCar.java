package car;

import java.awt.*;
import java.util.Random;

public class SportCar extends Car{

    //region Methods
    @Override
    public void movement() {
        System.out.println("*****************************************");
        System.out.println(getBrand() + " " + getModel() + " собирается ехать: ");
        switchHeadLigths();
        Random r = new Random();
        boolean rainOrDirt = r.nextBoolean();
        if (rainOrDirt){
            System.out.println("На улице грязь или дождь:");
            switchWipers();
        }
        gearShifting();
        if (rainOrDirt){
            switchWipers();
        }
        switchHeadLigths();
        System.out.println(getBrand() + " " + getModel() + " приехал.");
        System.out.println("--------------------------------------------");
    }

    @Override
    public void maintenance() {
        System.out.println("Автомобиль переобувают.");
    }

    @Override
    public void gearShifting() {
        System.out.println("Происходит переключение передач.");
    }

    @Override
    public void switchHeadLigths() {
        System.out.println("Фары");
    }

    @Override
    public void switchWipers() {
        System.out.println("Дворники");
    }

    @Override
    public String toString(){
        return getColor() + " " + getModel() + " " + getBrand();
    }
    //endregion

    //region Constructors
    public SportCar(String brand, String model, String color) {
        super(brand, model, color);
        setWheelsCount(4);
        setGearboxType(GearboxType.MT);
        setEngineCapacity(2.80);
        type = CarType.Sport; // это не нужно менять, у спорткара тип спорткар и больше никакого
        fuelType = FuelType.Gasoline; // допустим, что и это менять нельзя, спорткары будут только на бензине
    }
    //endregion
}
