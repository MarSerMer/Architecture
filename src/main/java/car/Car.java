package car;

import java.awt.*;

public abstract class Car {
    //region Methods
    // Движение
    public abstract void movement();
    // Обслуживание
    public abstract void maintenance();
    // Переключение передач
    public abstract void gearShifting();
    // Включение фар
    public abstract void switchHeadLigths();
    // Включение дворников
    public abstract void switchWipers();

    //Заправить автомобиль
    public void fuel(){
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    public void fullCarWash(){
        if (wiping != null){
            wiping.fullCarWash();
        }
    }

    public void quickCarWash(){
        if (wiping != null){
            wiping.quickCarWash();
        }
    }
    //endregion

    //region Constructors

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    //endregion

    //region Public Properties
    public void setRefuelingStation(Refueling refuelingStation){
        this.refueling = refuelingStation;
    }

    public void setWiping(Wiping wiping){
        this.wiping = wiping;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(GearboxType gearboxType) {
        this.gearboxType = gearboxType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    //endregion

    //region Fields
    // Марка автомобиля
    private String brand;
    // Модель
    private String model;
    // Цвет
    private String color;
    // Тип
    protected CarType type;
    // Количество колес
    private int wheelsCount;
    // Тип топлива
    protected FuelType fuelType = FuelType.Diesel;
    // Тип коробки передач
    private GearboxType gearboxType;
    // Объем двигателя
    private double engineCapacity;
    // Состояние противотуманных фар
    private boolean fogLights = false;
    private Refueling refueling;
    private Wiping wiping;
    //endregion
}

