package car;

import java.awt.*;
import java.util.Random;

public class Harvester extends Car{

    //region Methods
    public void sweeping(){
        System.out.println("Автомобиль метет улицу.");
    }

    // Включение-выключение противотуманных фар (см. "Поля" - по умолчанию выключены)
    private  boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }
    @Override
    public void movement() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Random w = new Random();
        System.out.println(getBrand() + " " + getModel() + " собирается ехать: ");
        switchHeadLigths();
        boolean fog = w.nextBoolean();
        if (fog){
            switchFogLights();
            System.out.println("На улице туман: включили противотуманные фары");
        }
        boolean rainOrDirt = w.nextBoolean();
        if (rainOrDirt){
            System.out.println("На улице грязь или дождь:");
            switchWipers();
        }
        gearShifting();
        if (rainOrDirt){
            switchWipers();
        }
        if (fog){
            switchFogLights();
            System.out.println("Выключили противотуманные фары");
        }
        switchHeadLigths();
        System.out.println(getBrand() + " " + getModel() + " приехал.");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
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
    public Harvester(String brand, String model, String color) {
        super(brand, model, color);
        setWheelsCount(6);
        setGearboxType(GearboxType.MT);
        setEngineCapacity(5.00);
        type = CarType.Harvester;
        fuelType = FuelType.Diesel;
    }
    //endregion

    //region Fields
    private boolean fogLights = false;
    //endregion
}
