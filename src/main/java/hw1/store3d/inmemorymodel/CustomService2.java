package hw1.store3d.inmemorymodel;

public class CustomService2 implements ModelChangedObserver {

    @Override
    public void applyUpdateModel() {
        System.out.println("CustomService2 informes: new option was added to user menu");
    }
}
