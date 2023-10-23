package car;

public class CarWashingStation implements Wiping{

    @Override
    public void fullCarWash() {
        System.out.println("Машина отмыта до блеска");
    }

    @Override
    public void quickCarWash(){
        wipMirrors();
        wipWindshield();
        wipHeadLights();
    }
    public void wipMirrors() {
        System.out.println("Протерты зеркала.");
    }

    public void wipWindshield() {
        System.out.println("Протерто лобовое стекло.");
    }

    public void wipHeadLights() {
        System.out.println("Протерты фары.");
    }
}
