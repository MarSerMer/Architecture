package car;

import java.util.Random;

public class Pickup extends Car{
    //region Methods
    public void cargoTransportation(int cargoWeight){
        int lc = getLiftingCapacity();
        if (cargoWeight <= lc) {
            System.out.println("Автомобиль везет груз.");
        }
        else{
            System.out.println("Столько автомобиль не сможет увезти. Максимальный вес груза: " + lc);
        }
    }

    // Включение-выключение противотуманных фар (см. "Поля" - по умолчанию выключены)
    private  boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }
    @Override
    public void movement() { // тут он просто едет! Если нужно везти груз, вызвать метод cargoTransportation
        System.out.println("//////////////////////////////////////////////");
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
        System.out.println("..........................................");
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
    public Pickup(String brand, String model, String color) {
        super(brand, model, color);
        setWheelsCount(4);
        setGearboxType(GearboxType.MT);
        setEngineCapacity(3.5);
        type = CarType.Pickup;
        fuelType = FuelType.Diesel;
        setLiftingCapacity(375);
    }
    //endregion

    //region Public Properties

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    //endregion

    //region Fields
    private boolean fogLights = false;
    private int liftingCapacity;
    //endregion
}
