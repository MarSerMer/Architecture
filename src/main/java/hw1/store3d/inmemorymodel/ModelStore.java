package hw1.store3d.inmemorymodel;

import hw1.store3d.modelelements.Camera;
import hw1.store3d.modelelements.Flash;
import hw1.store3d.modelelements.PoligonalModel;
import hw1.store3d.modelelements.Scene;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements ModelChanger {
    //region Constructors

    public ModelStore(Collection<PoligonalModel> models, Collection<Scene> scenes, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    //endregion

    //region Methods

    /**
     * Сообщает о событии
     */
    @Override
    public void notifyChange() {
        for (ModelChangedObserver observer : changeObservers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void registerModelChanger(ModelChangedObserver o) {
        changeObservers.add(o);

    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        changeObservers.remove(o);
    }

    public void updateModelStore(Object newObject){
        Boolean needToInform = true;
        if (newObject instanceof PoligonalModel){
            this.models.add((PoligonalModel) newObject);
        } else if (newObject instanceof Scene) {
            this.scenes.add((Scene) newObject);
        } else if (newObject instanceof Flash) {
            this.flashes.add((Flash) newObject);
        } else if (newObject instanceof Camera) {
            this.cameras.add((Camera) newObject);
        } else {
            System.out.println("ModelStore update denied: wrong object.");
            needToInform = false;
        }
        if (needToInform) {
            notifyChange(); // вот сюда при необходимости можно добавить передачу нового объекта
        }
    }
    //endregion

    //region Fields
    private Collection<PoligonalModel> models = new ArrayList<>();
    private Collection<Scene> scenes = new ArrayList<>();
    private Collection<Flash> flashes = new ArrayList<>();
    private Collection<Camera> cameras = new ArrayList<>();
    private Collection<ModelChangedObserver> changeObservers = new ArrayList<>();
    //endregion
}
