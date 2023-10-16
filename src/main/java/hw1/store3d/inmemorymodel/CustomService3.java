package hw1.store3d.inmemorymodel;

public class CustomService3 implements ModelChangedObserver {

    @Override
    public void applyUpdateModel() {
        System.out.println("CustomService3 informes: now users can pay for new option");
    }
}
