package hw1.store3d.inmemorymodel;

public class CustomService1 implements ModelChangedObserver {

    @Override
    public void applyUpdateModel() {
        System.out.println("I am CustomService1 and I print it because I was informed about changes");
    }
}
